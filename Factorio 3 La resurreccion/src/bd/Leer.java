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

  // CONSTRUCTOR
  public Leer(ArrayList<String> tablas, Map<Integer, ArrayList<String>> fks,
      Map<Integer, Boolean> mtm, Map<Integer, ArrayList<String>> vars,
      Map<Integer, ArrayList<String>> types, Map<Integer, ArrayList<Integer>> otm,
      Map<Integer, ArrayList<Integer>> mto, Map<Integer, String[]> Mtm,
      Map<Integer, Integer> tableType) {
    this.tablas = tablas;
    this.fks = fks;
    this.mtm = mtm;
    this.vars = vars;
    this.types = types;
    this.otm = otm;
    this.mto = mto;
    this.Mtm = Mtm;
    this.tableType = tableType;

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
      ResultSet columns = databaseMetaData.getColumns(null, null, actualTable, null);
      while (columns.next()) {
        String column = columns.getString("COLUMN_NAME");
        String formatedColumn = columns.getString("COLUMN_NAME");
        String datatype = columns.getString("TYPE_NAME");
        if (formatedColumn.contains("FK")) {
          formatedColumn = formatedColumn.replace("FK_", "");
        }
        formatedColumn = metodos.despital(formatedColumn);
        if (!mtm.get(c)
            && (fks.get(c) == null || (fks.get(c) != null && !fks.get(c).contains(column)))) {
          dataVars.add(formatedColumn);
          dataTypes.add(datatype);

        }
      }
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
      if (pkFind.getRow() > 1) {
        String[] manyToMany = new String[4];
        ResultSet fkFind = databaseMetaData.getImportedKeys(null, null, actualTable);
        fkFind.last();
        pkFind.last();
        System.err.println("fks  " + fkFind.getRow() + "     pks  " + pkFind.getRow()
            + "     total  " + pfkcolumns.getRow());

        if (pfkcolumns.getRow() == fkFind.getRow()) {
          System.err.println(actualTable + "asq");
          tipo = 1;
        } else {
          tipo = 3;
        }
        fkFind.beforeFirst();
        pkFind.first();

        while (fkFind.next()) {
          cc++;
          if (actualTable.equalsIgnoreCase("CataloguedEvent")) {
              System.err.println("");
          }
          // TODO MAS DE UNA PK
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
          System.err.println(Mtm.get(c));
        } else {
          // TODO BASE ENTITIEES (2Pk, 2Fk +Fields  )
          //Factory
          tableType.put(c, 4);
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
        while (fkFind.next()) {
          var.add(fkFind.getString("FKCOLUMN_NAME"));
          // oneToMany.add(e)
          for (i = 0; i < tablas.size(); i++) {
            if (tablas.get(i).equalsIgnoreCase(fkFind.getString("PKTABLE_NAME"))) {
              oneToMany.add(i);
              break;
            }
          }
        }
        if (!var.isEmpty()) {
          fks.put(c, var);
          otm.put(c, oneToMany);
          manyToOne = mto.get(i);
          if (manyToOne == null) {
            manyToOne = new ArrayList<>();
          }
          manyToOne.add(c);
          mto.put(i, manyToOne);
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
