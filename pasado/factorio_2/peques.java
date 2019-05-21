/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorio_2;

import java.util.ArrayList;

/**
 *
 * @author mi
 */
public class peques {
                  public static String aaa2a(){
    String a="";
    return a;
    }
            public static String a4(){
    String a="";
    return a;
    }
                  public static String a3a(){
    String a="";
    return a;
    }
                  public static String aa2a(){
    String a="";
    return a;
    }
            public static String hg4(){
    String a="";
    return a;
    }
                  public static String mapkeymanyone(String n,String cl){
    String a="\n <key-many-to-one name=\""+n+"\" column=\""+n+"\" class=\""+cl+"\"/>";
    
    return a;
    }
         
    
              public static String mapkeypro(String n){
    String a="\n<key-property name=\""+n+"\" >";
    return a;
    }
            public static String mapcrement(String s){
    String a="\n<id name=\""+s+"\" type=\"int\" >\n" +
"    <generator class=\"identity\" />    \n" +
"  </id>";
    return a;
    }
                  public static String makeys(char c){
                String a="";
                      
                      switch(c){
                              case 'a': a="\n<composite-id >";break;
                              case 'c': a="\n</composite-id>";break;}
    
    return a;
    }
    
          public static String mapeoid(String b){
    String a="\n <id name=\""+b+"\"/>";
    return a;
    }
            public static String mapeomanyone(String b,String c){
    String a="\n<many-to-one name=\""+b+"\" column=\""+b+"\" class=\"Pojos."+c+"\"/>";
    return a;
    }
                  public static String mapeoset(String n,String f,String c){
    String a="\n<set\n" +
"   name=\""+f+"\"  inverse=\"false\">\n" +
"   <key>     \n" +
"   <column name=\""+n+"\" not-null=\"true\" />\n" +
"    </key>\n" +
"   <one-to-many class=\""+"Pojos."+c+"\"/>        \n" +
"</set>";
    return a;
    }                 
                              
                  
      public static String mapepoclass(String c,String t){
    String a="\n<class name=\""+"Pojos."+c+"\" table=\""+t+"\">\n \n";
    
    //="  <class name=\"Pojos.Usos\" table=\""+t+"\">";
    return a;
    }
                 public static String   mapeoproperty(String b){
    String a="\n     <property name=\""+b+"\"/>";
    return a;
    }
      
      public static String mapeofin(){
    String a="\n  \n </class>" +
"  \n" +
"</hibernate-mapping>";
    return a;
    }
 
                  public static String mapeoinicio(){
    String a="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
"<!DOCTYPE hibernate-mapping PUBLIC \"-//Hibernate/Hibernate Mapping DTD 3.0//EN\" \"http://hibernate.sourceforge.net/hibernate-mapping-3.0.dtd\">\n" +
"\n" +
"<hibernate-mapping>";
    return a;
    }
    
    
        public static String constructorsin(String n){
         
    String a="\npublic "+n+"() {\n" +
"    }";
    return a;}
        
 
       public static String driver(){
    String a="  \n\nStatement sentencia=null;\n" +
"           try{\n" +
"      Connection conexion=DriverManager.getConnection(\"jdbc:mysql://localhost:3307/?user=root&password=usbw\");\n" +
"             sentencia=conexion.createStatement();\n" +
"        }catch(SQLException e){System.out.println(e.getMessage());}\n";

    return a;
    }
       
   public static String impoerdriver(){
      String a="import java.sql.Connection;\n" +
                    "import java.sql.DriverManager;\n" +
                    "import java.sql.SQLException;\n" +
                    "import java.sql.Statement;";
    return a;
    }
    public static String catchsql(){
    String a=" }catch(SQLException e){System.out.println(e);}\n" +
"          }";
    return a;
    }
     public static String primary(String key){
    String a="PRIMARY KEY  ("+key+"));\");\n";
    return a;
    }
     
              public static String creartabla(ArrayList<String[]> m,String t){
        String b="";
           for(String[] i:m){
        b+=i[0]+"  "+i[1]+"  "+i[2]+"  "+i[3]+"  "+i[4]+", \"\n +\"";
             }    
        
       String a=" \nsentencia.execute(\"CREATE TABLE IF NOT EXISTS "+t+" ( \"\n+\""+b;

       return a;
       }
     
      public static String foreing(String[] q){
          
    String a="FOREIGN KEY ("+q[0]+") REFERENCES "+q[1]+"("+q[2]+") \"\n +\""
                                 + "on delete cascade  \"\n +\""
                                   + "on update cascade,  \"\n +\" ";
    return a;
    }


    public static String paquete(String n){
    String a="package "+n+";\n\n";
    return a;
    }
    public static String get(String n1,String n){
    String a="\npublic "+n1+" get"+n.substring(0,1).toUpperCase()+n.substring(1)+"() {\n" +
"        return "+n+";\n" +
"    }\n";
    return a;
    }
       public static String set(String n1,String n){
    String a="\n public void set"+n.substring(0,1).toUpperCase()+n.substring(1)+"("+n1+" "+n+") {\n" +
"        this."+n+" = "+n+";\n" +
"    }\n";
    
    return a;
    }
    
      public static String voi(String n){
    String a="public static void "+n+"(){\n \n}";
    return a;
    }
      
      public static String importcomprobaciones(){
      String a="import java.sql.Date;\n" +
                    "import java.util.InputMismatchException;\n" +
                     "import java.util.Scanner;\n \n";      
      return a;      
      }
          public static String publiclas(String n){
    String a="\n public class "+n+"{\n \n";
    return a;
    };
              public static String privat(String a1,String b){
    String a="\nprivate "+a1+" "+b+";";
    return a;
    }
               public static String stati(String n){
    String a="public static void "+n;
    return a;
    }
                public static String crearclase(String n,char c){
                    String a="";
                    switch(c){
                        case 'j' :a=n+".java";break;
                        case 'm':a=n+".xml";break;             
                    }
    return a;
    }
                      public static String salto(int n){
                        int c=0;
                        String a="";
                        while(c<n){
                        a +="\n";c++;}
    return a;
    }
    
                    public static String llave(int n){
                        int c=0;
                        String a="";
                        while(c<n){
                        a +="}\n";c++;}
    return a;
    }
}
