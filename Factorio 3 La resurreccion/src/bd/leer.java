package bd;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class leer {

  public static void leer()throws SQLException {
    Connection con=null;
    String url="jdbc:mysql://localhost:3306/IEC_IND";
    String user="root",password="";
    ResultSet tableType;
    String actualTable;
    ResultSet tables;
    try {
      Class.forName("com.mysql.jdbc.Driver");
     con= DriverManager.getConnection(url, user,password);
    } catch (ClassNotFoundException e) {
    }
    DatabaseMetaData databaseMetaData = con.getMetaData();

    
    //TABLE NAMES
     tables = databaseMetaData.getTables(null, null, null, new String[] { "TABLE" });
    System.out.println("Printing TABLE_TYPE \"TABLE\" ");
    System.out.println("----------------------------------");
    
    while (tables.next()) {
      // Print
      actualTable=tables.getString("TABLE_NAME");
      System.out.println(actualTable);
      
      
    //GetPrimarykeys
      ResultSet PK = databaseMetaData.getPrimaryKeys(null,null, actualTable);
      System.out.println("------------PRIMARY KEYS-------------");
      while(PK.next())
      {
          System.out.println(PK.getString("COLUMN_NAME") + "===" + PK.getString("PK_NAME"));
      }
      System.out.println("---------------------------------------------");
      
      
    //Get Foreign Keys
      ResultSet FK = databaseMetaData.getImportedKeys(null, null, actualTable);
      System.out.println("------------FOREIGN KEYS-------------");
      while(FK.next())
      {
          System.out.println(FK.getString("PKTABLE_NAME") + "---" + FK.getString("PKCOLUMN_NAME") + "===" + FK.getString("FKTABLE_NAME") + "---" + FK.getString("FKCOLUMN_NAME"));
      }
      System.out.println("---------------------------------------------");
    //TABLE COLUMNS
      ResultSet columns = databaseMetaData.getColumns(null,null, tables.getString("TABLE_NAME"), null);
      while(columns.next())
      {
          String columnName = columns.getString("COLUMN_NAME");
          String datatype = columns.getString("TYPE_NAME");
        System.out.println(columnName + "-type " + datatype);
          
//          String columnsize = columns.getString("COLUMN_SIZE");
////          String decimaldigits = columns.getString("DECIMAL_DIGITS");
//          String isNullable = columns.getString("IS_NULLABLE");
//          String is_autoIncrment = columns.getString("IS_AUTOINCREMENT");
//          //Printing results
//          System.out.println(columnName + "-type " + datatype + "-col " + columnsize +  "-null " + isNullable + "-auto " + is_autoIncrment);
      }
    }
  }
    

}
