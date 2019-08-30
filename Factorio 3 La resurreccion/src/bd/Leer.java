package bd;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

public class Leer {
  
  ArrayList<String>tablas;
  Map<Integer, ArrayList<String>> fks;
  DatabaseMetaData databaseMetaData;
  public Leer(ArrayList<String>tablas,Map<Integer, ArrayList<String>> fks ) {
    this.tablas=tablas;
    this.fks=fks; 
    
    
  }

  public  void start()throws SQLException {

    Connection con=connect();
    databaseMetaData = con.getMetaData();
    getTableNames();
    getFKs();
    
    
  }
  
  
  
  public  void getFKs( ) throws SQLException {
    
    int c=-1;
    for (String actualTable : tablas) {
      c++;
  ResultSet fkLoop = databaseMetaData.getImportedKeys(null, null, actualTable);
  ArrayList<String>var=new ArrayList<>();
  System.out.println("\n-FOREIGN KEYS   "+actualTable);
  while(fkLoop.next())
  {
    var.add( fkLoop.getString("FKCOLUMN_NAME"));
    System.out.println(fkLoop.getString("PKTABLE_NAME") + "---" + fkLoop.getString("PKCOLUMN_NAME") + "===" + fkLoop.getString("FKTABLE_NAME") + "---" + fkLoop.getString("FKCOLUMN_NAME"));

  }
  if(!var.isEmpty()){fks.put(c, var);}
    }    
    
  }
  
  public  Connection connect() throws SQLException {
    
    Connection con=null;
    String url="jdbc:mysql://localhost:3306/totem";
    String user="root",password="";
    
    try {
      Class.forName("com.mysql.jdbc.Driver");
     con= DriverManager.getConnection(url, user,password);
    } catch (ClassNotFoundException e) {
    }
    return con;
  }

    public  void getTableNames() throws SQLException {
    
    //TABLE NAMES
      ResultSet tables = databaseMetaData.getTables(null, null, null, new String[] { "TABLE" });
    
    while (tables.next()) {
      String actualTable=tables.getString("TABLE_NAME");
      if(!actualTable.equalsIgnoreCase("SEQUENCE")) {
      tablas.add(actualTable); }
      
    }
    }
}
//    //GetPrimarykeys
//      ResultSet PK = databaseMetaData.getPrimaryKeys(null,null, actualTable);
//      System.out.println("------------PRIMARY KEYS-------------");
//      while(PK.next())
//      {
//          System.out.println(PK.getString("COLUMN_NAME") + "===" + PK.getString("PK_NAME"));
//      }
//      System.out.println("---------------------------------------------");
//      
//      
//    //Get Foreign Keys
//      ResultSet FK = databaseMetaData.getImportedKeys(null, null, actualTable);
//      System.out.println("------------FOREIGN KEYS-------------");
//      while(FK.next())
//      {
//          System.out.println(FK.getString("PKTABLE_NAME") + "---" + FK.getString("PKCOLUMN_NAME") + "===" + FK.getString("FKTABLE_NAME") + "---" + FK.getString("FKCOLUMN_NAME"));
//      }
//      System.out.println("---------------------------------------------");
//    //TABLE COLUMNS
//      ResultSet columns = databaseMetaData.getColumns(null,null, tables.getString("TABLE_NAME"), null);
//      while(columns.next())
//      {
//          String columnName = columns.getString("COLUMN_NAME");
//          String datatype = columns.getString("TYPE_NAME");
//        System.out.println(columnName + "-type " + datatype);
//          
//          String columnsize = columns.getString("COLUMN_SIZE");
////          String decimaldigits = columns.getString("DECIMAL_DIGITS");
//          String isNullable = columns.getString("IS_NULLABLE");
//          String is_autoIncrment = columns.getString("IS_AUTOINCREMENT");
//          //Printing results
//          System.out.println(columnName + "-type " + datatype + "-col " + columnsize +  "-null " + isNullable + "-auto " + is_autoIncrment);
//      }
//    }
    

