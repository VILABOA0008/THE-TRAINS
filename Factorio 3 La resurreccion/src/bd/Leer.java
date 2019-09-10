package bd;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import main.metodos;

public class Leer {
  Map<Integer, Boolean> mtm;
  ArrayList<String> tablas;
  Map<Integer, ArrayList<String>> fks;
  DatabaseMetaData databaseMetaData;
  Map<Integer, ArrayList<String>> vars;
  Map<Integer, ArrayList<String>> types;
  Map<Integer, ArrayList<Integer>> mto;
  Map<Integer, ArrayList<Integer>> otm;
  Map<Integer, String[]> Mtm;
  Map<Integer, Integer> tableType;
  Map<Integer, ArrayList<String>> primaryKeys;

  // CONSTRUCTOR
  public Leer(ArrayList<String> tablas, Map<Integer, ArrayList<String>> fks,
      Map<Integer, Boolean> mtm, Map<Integer, ArrayList<String>> vars,
      Map<Integer, ArrayList<String>> types, Map<Integer, ArrayList<Integer>> otm,
      Map<Integer, ArrayList<Integer>> mto, Map<Integer, String[]> Mtm,
      Map<Integer, Integer> tableType, Map<Integer, ArrayList<String>> primaryKeys) {
    this.tablas = tablas;
    this.fks = fks;
    this.mtm = mtm;
    this.vars = vars;
    this.types = types;
    this.otm = otm;
    this.mto = mto;
    this.Mtm = Mtm;
    this.tableType = tableType;
    this.primaryKeys = primaryKeys;

  }

  public void start() throws SQLException {

    Connection con = connect();
    databaseMetaData = con.getMetaData();
    getTableNames();
    getMTM();
    getFKs();
    getFields();
    toJavaSyntax();

  }

  public void toJavaSyntax() throws SQLException {

    Map<String, String> toVars = new HashMap<>();
    toVars.put("INT", "Integer");
    toVars.put("TINYINT", "Byte");
    toVars.put("VARCHAR", "String");
    toVars.put("BIT", "boolean");
    toVars.put("FLOAT", "float");
    toVars.put("TIMESTAMP", "LocalDateTime");
    toVars.put("TIME", "LocalTime");
    toVars.put("BINARY", "byte[]");
    toVars.put("DATE", "LocalDate");
    toVars.put("DECIMAL", "BigDecimal");
    toVars.put("Hash", "Integer");
    toVars.put("CHAR", "char");
    toVars.put("BLOB", "Blob");
    toVars.put("DOUBLE", "Double");
    toVars.put("DATETIME", "LocalDateTime");

    for (int i = 0; i < tablas.size(); i++) {
      ArrayList<String> vars = new ArrayList<>();
      for (int j = 0; j < types.get(i).size(); j++) {
        vars.add(toVars.get(types.get(i).get(j)));

      }
      types.put(i, vars);
    }

  }

  public void getFields() throws SQLException {

    int c = -1;
    for (String actualTable : tablas) {
      c++;
      ArrayList<String> dataVars = new ArrayList<>();
      ArrayList<String> dataTypes = new ArrayList<>();
      ArrayList<String> primaryKey = new ArrayList<>();
      ArrayList<String> primaryKeyTable = new ArrayList<>();
      ArrayList<String> auxFks = new ArrayList<>();

      ResultSet pkFind = databaseMetaData.getPrimaryKeys(null, null, actualTable);
      while (pkFind.next()) {
        primaryKey.add(pkFind.getString("COLUMN_NAME"));
      }

      ResultSet fkFind = databaseMetaData.getImportedKeys(null, null, actualTable);
      while (fkFind.next()) {
        auxFks.add(fkFind.getString("FKCOLUMN_NAME"));
      }

      ResultSet columns = databaseMetaData.getColumns(null, null, actualTable, null);
      while (columns.next()) {
        String column = columns.getString("COLUMN_NAME");
        String dataType = columns.getString("TYPE_NAME");

        if (!mtm.get(c) && !auxFks.contains(column) && !primaryKey.contains(column)) {
          column = metodos.despital(column);
          dataTypes.add(dataType);
          dataVars.add(column);

        }
      }
      primaryKeys.put(c, primaryKey);
      vars.put(c, dataVars);
      types.put(c, dataTypes);
    }
  }

  // Por ahora si tiene más de un Pk La voy a poner aquí
  public void getMTM() throws SQLException {
    int tipo = 0;
    int c = -1;
    for (String actualTable : tablas) {
      int cc = -1;
      c++;
      ResultSet pkFind = databaseMetaData.getPrimaryKeys(null, null, actualTable);
      ResultSet pfkcolumns = databaseMetaData.getColumns(null, null, actualTable, null);
      pfkcolumns.last();
      pkFind.last();
      if (actualTable.equalsIgnoreCase("PartVersionFile")) {
        System.err.println();
        pfkcolumns.last();
        pkFind.last();
      }
      if (pkFind.getRow() > 1) {
        String[] manyToMany = new String[4];
        ResultSet fkFind = databaseMetaData.getImportedKeys(null, null, actualTable);
        fkFind.last();
        pkFind.last();

        if (pfkcolumns.getRow() == fkFind.getRow()) {
          tipo = 1;
        } else {
          tipo = 3;
        }
        fkFind.beforeFirst();
        pkFind.first();

        while (fkFind.next()) {
          cc++;
          if (actualTable.equalsIgnoreCase("ControlPlanVersion")) {
          }
          // TODO MAS DE 2 PK
          if (cc == 4) {
            break;
          }
          for (int i = 0; i < tablas.size(); i++) {
            if (tablas.get(i).equalsIgnoreCase(fkFind.getString("PKTABLE_NAME"))) {
              manyToMany[cc] = fkFind.getString("FKCOLUMN_NAME");
              manyToMany[cc + 1] = String.valueOf(i);
              cc++;
              break;

            }
          }
        }
        if (tipo == 1) {
          // MTM
          tableType.put(c, 1);
          mtm.put(c, true);
          Mtm.put(c, manyToMany);
        } else {
          // TODO BASE ENTITIEES (2Pk, 2Fk +Fields )
          // Factory

          fkFind.beforeFirst();
          pkFind.beforeFirst();
          ArrayList<String> auxPks = new ArrayList<>();
          ArrayList<String> auxFks = new ArrayList<>();
          while (pkFind.next()) {
            auxPks.add(pkFind.getString("COLUMN_NAME"));
            // System.err.println("auxxx pk "+pkFind.getString("COLUMN_NAME"));
          }
          while (fkFind.next()) {
            auxFks.add(fkFind.getString("FKCOLUMN_NAME"));
            // System.err.println("auxxx fk "+fkFind.getString("FKCOLUMN_NAME"));

          }
          System.err.println("\n\n" + actualTable);
          System.err.println(auxFks);
          System.err.println(auxPks);

          tableType.put(c, 3);
          mtm.put(c, false);
        }

        // NORMAL TABLES
      } else {
        tableType.put(c, 0);
        mtm.put(c, false);
      }
    }
  }

  public void getFKs() throws SQLException {
    int c = -1;
    for (String actualTable : tablas) {
      c++;
      if (!mtm.get(c)) {
        ResultSet fkFind = databaseMetaData.getImportedKeys(null, null, actualTable);
        ArrayList<String> var = new ArrayList<>();
        ArrayList<Integer> oneToMany = new ArrayList<>();
        ArrayList<Integer> manyToOne;
        int i = -3;
        if (actualTable.equalsIgnoreCase("PartVersionFile")) {
          System.err.println();
        }
        while (fkFind.next()) {
          String fk = fkFind.getString("FKCOLUMN_NAME");

          if (tableType.get(c) != 3
              && (fk.substring(0, 2).contains("id") || fk.substring(0, 2).contains("Id"))) {
            System.err.println("error  " + actualTable + "  empieza con id en vez de fk  " + fk);// error
          }

          if (tableType.get(c) == 3
              && ((!fk.substring(0, 2).contains("id") && !fk.substring(0, 2).contains("Id")))) {
            System.err
                .println("error entitie  " + actualTable + "  empieza con fk en vez de id  " + fk);// error
          }

          var.add(fk);

          // oneToMany.add(e)
          for (i = 0; i < tablas.size(); i++) {
            if (tablas.get(i).equalsIgnoreCase(fkFind.getString("PKTABLE_NAME"))) {
              // System.err.println(fkFind.getString("PKTABLE_NAME") + " s " +
              // fkFind.getString("FKCOLUMN_NAME"));
              oneToMany.add(i);

              // one to many
              
              
              ResultSet PK = databaseMetaData.getPrimaryKeys(null, null, actualTable);
//              while (PK.next()) {
//                if (PK.getString("COLUMN_NAME")
//                    .equalsIgnoreCase(fkFind.getString("FKCOLUMN_NAME"))) {
                  manyToOne = mto.get(i);
                  if (manyToOne == null) {
                    manyToOne = new ArrayList<>();
                  }
                  if(manyToOne.contains(c)) {}else {
                  manyToOne.add(c);
                  mto.put(i, manyToOne);}
//                }}
              
              // one to many
              break;
            }
          }
        }
        if (!var.isEmpty()) {
          fks.put(c, var);
          otm.put(c, oneToMany);

        }
      }
    }
  }

  public Connection connect() throws SQLException {

    Connection con = null;
    // String url = "jdbc:mysql://localhost:3306/totem";
    String url = "jdbc:mysql://localhost:3306/IEC_IND";
    String user = "root";
    String password = "";

    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection(url, user, password);
    } catch (ClassNotFoundException e) {
    }
    return con;
  }

  public void getTableNames() throws SQLException {

    // TABLE NAMES
    ResultSet tables = databaseMetaData.getTables(null, null, null, new String[] { "TABLE" });

    while (tables.next()) {
      String actualTable = tables.getString("TABLE_NAME");
      if (!actualTable.equalsIgnoreCase("SEQUENCE")) {
        tablas.add(actualTable);
      }
    }
  }
}
// //GetPrimarykeys
// ResultSet PK = databaseMetaData.getPrimaryKeys(null,null, actualTable);
// System.out.println("------------PRIMARY KEYS-------------");
// while(PK.next())
// {
// System.out.println(PK.getString("COLUMN_NAME") + "===" + PK.getString("PK_NAME"));
// }
// System.out.println("---------------------------------------------");
//
//
// //Get Foreign Keys
// ResultSet FK = databaseMetaData.getImportedKeys(null, null, actualTable);
// System.out.println("------------FOREIGN KEYS-------------");
// while(FK.next())
// {
// System.out.println(FK.getString("PKTABLE_NAME") + "---" + FK.getString("PKCOLUMN_NAME") + "===" +
// FK.getString("FKTABLE_NAME") + "---" + FK.getString("FKCOLUMN_NAME"));
// }
// System.out.println("---------------------------------------------");
// //TABLE COLUMNS
// ResultSet columns = databaseMetaData.getColumns(null,null, tables.getString("TABLE_NAME"), null);
// while(columns.next())
// {
// String columnName = columns.getString("COLUMN_NAME");
// String datatype = columns.getString("TYPE_NAME");
// System.out.println(columnName + "-type " + datatype);
//
// String columnsize = columns.getString("COLUMN_SIZE");
//// String decimaldigits = columns.getString("DECIMAL_DIGITS");
// String isNullable = columns.getString("IS_NULLABLE");
// String is_autoIncrment = columns.getString("IS_AUTOINCREMENT");
// //Printing results
// System.out.println(columnName + "-type " + datatype + "-col " + columnsize + "-null " +
// isNullable + "-auto " + is_autoIncrment);
// }
// }
