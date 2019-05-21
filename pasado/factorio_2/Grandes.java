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
public class Grandes {
    
     public static String vacio0(){
       String a="";
       
       return a;
       }
     
      public static String vacio1(){
       String a="";
       
       return a;
       }
      
       public static String vacio2(){
       String a="";
       
       return a;
       }
    
   
    
    
       public static String crearbase(String base,String clase){
       String a="import java.sql.Connection;\n" +
"import java.sql.DriverManager;\n" +
"import java.sql.SQLException;\n" +
"import java.sql.Statement;\n" +
"\n" +
"/**\n" +
" *\n" +
" * @author a16pablovc\n" +
" */\n" +
"public class "+clase+" {\n" +
"    public static void crear(Statement sentencia){\n" +
"    \n" +
"      try{\n" +
"      Connection conexion=DriverManager.getConnection(\"jdbc:mysql://localhost:3307/?user=root&password=usbw\");\n" +
"             sentencia=conexion.createStatement();\n" +
"    \n" +
"    \n" +
"\n" +
"        sentencia.execute(\"CREATE DATABASE IF NOT EXISTS "+base+"\");\n" +
"    sentencia.execute(\"  Use  "+base+"\");\n" +
"";
       
       return a;
       }
    
                   public static String constructor(ArrayList <String>t,ArrayList  <String>n,String cl){
                       String set=null; 
                    int c=0;String a="\n\n\npublic "+cl+"(";
            
          //    if(t.get(0).substring(0, 3).equalsIgnoreCase("set")){}else{      a+=t.get(c)+" "+n.get(c)+",";     c++;}
                    
              
                   
                      while(t.size()>c){
                          if(t.get(c).charAt(t.get(c).length()-1)=='>'){}else{ 
                                a+=t.get(c)+" "+n.get(c);
                                        System.out.println(t.size()+"  si  c  "+c);
                          if(t.size()==(c+1)){}else{a+=",";    }
                          }
                       
                              c++;}

                      a+="){\n";
                      c=0;
                        while(t.size()>c){
                             if(t.get(c).charAt(t.get(c).length()-1)=='>'){
                                  if(t.get(c).charAt(0)=='S'){set="new HashSet<>()";}
                                   if(t.get(c).charAt(0)=='A'){set="new ArrayList<>()";}}                       
                                  else{  set=n.get(c);}
                          a+="this."+n.get(c)+"="+set+";\n";
                              c++;}
                      a+="}";
  //
    return a;
    }
    
      public static String abmc(int op,Basicos ba){
          int c=0;
          String aa=ba.getAuxclase();
          String b="\"";
          String bb="";
              
          while(op>c){
          b+=((c+1)+" "+aa+(c+1)+"\\n");c++;}
            b+=((c+1)+" "+"Salir"+"\\n");
          System.out.println("b  "+b);
                System.out.println("bb  "+   bb);
                c=0;
             while(op>c){
          bb+=("case "+(c+1)+": "+aa+c+"();break;\n");c++;}
          b+="\"";
          
        String a="  \n  int op;\n" +
"        \n" +
"        do{\n" +
"            System.out.println("+b+");\n" +
"            op=Comprobaciones.opcion("+(op+1)+");\n" +
"        \n" +
"            switch(op){\n"
              +bb+
"                  } \n" +
"      }while(op!="+(op+1)+");\n" +
"      \n" +
"    ";
        c=0;        
            while(op>c){
                a+="}\n\n";
        a+=peques.stati(aa+c+"(){");
        a+="\n\n\n";c++; 
      }
     
            
            
      return a;  }
    public static String main(){
        String a="  \n  int op;\n" +
"        \n" +
"        do{\n" +
"            System.out.println(\"1 Altas \\n2 Bajas \\n3 Modificaciones \\n4 Consultas \\n5 Salir\");\n" +
"            op=Comprobaciones.opcion(5);\n" +
"        \n" +
"            switch(op){\n" +
"                case 1:Altas.altas();break;\n" +
"                case 2:Bajas.bajas();break;\n" +
"                case 3:Modificaciones.modificaciones();break;\n" +
"                case 4:Consultas.consultas();break;}\n" +
"                   \n" +
"      }while(op!=5);\n" +
"        System.exit(0);\n" +
"    ";
           return a;}
    public static String comprobaciones(){
    String a="    public static Date fecha(){\n" +
"    \n" +
"        Scanner s=new Scanner(System.in);   \n" +
"       \n" +
"     Date a=null;\n" +
"    int d;\n" +
"            do{ d=0;\n" +
"            try {\n" +
"                \n" +
"                a=Date.valueOf((s.nextLine()));\n" +
"           \n" +
"            } catch (IllegalArgumentException e) {System.out.println(\"Formato incorrecto  yyyy-MM-dd\");      d=1;               }\n" +
"\n" +
"             }while (d==1);\n" +
"    return a;\n" +
"    }\n" +
"        \n" +
"        \n" +
"         public static String dni(){\n" +
"         String a;int d;\n" +
"    do{d=0;\n" +
"        Scanner s=new Scanner(System.in);   \n" +
"       a=s.nextLine();\n" +
"       \n" +
"       \n" +
"       \n" +
"       try{\n" +
"   \n" +
"        if(a.substring(0, 8).matches(\"[0-9]*\" )&& a.substring(8).matches(\"[A-Za-z]\")&&a.length()==9){}else {System.out.println(\"Formato incorrecto \");d=1;}\n" +
"        \n" +
"        \n" +
"        }catch(StringIndexOutOfBoundsException e){System.out.println(\"Longitud incorrecta   \");d=1;}\n" +
"        \n" +
"    }while(d==1);\n" +
"    return a;\n" +
"    }\n" +
"        \n" +
"    \n" +
"    public static String strin(){\n" +
"         String a;int d;\n" +
"    do{d=0;\n" +
"        Scanner s=new Scanner(System.in);   \n" +
"       a=s.nextLine();\n" +
"       if(a.isEmpty()){d=1;System.out.println(\"Escribe algo\");}\n" +
"    }while(d==1);\n" +
"    return a;\n" +
"    }\n" +
"    \n" +
"       public static int opcion(int op){\n" +
"    int a=0,d;\n" +
"        Scanner s=new Scanner(System.in);   \n" +
"        \n" +
"        do{\n" +
"            d=0;\n" +
"        try {\n" +
"         a=s.nextInt();\n" +
"         if(a<0||a>op){d=1;System.out.println(\"Introduzca una opcion valida\");}\n" +
"        }catch(InputMismatchException e){d=1;s.nextLine();System.out.println(\"Valor erroneo Escriba la opcion de nuevo\");}\n" +
"        }while (d==1);\n" +
"        \n" +
"        \n" +
"        return a;\n" +
"    }\n" +
"         public static int entero(){\n" +
"    int a=0,d=0;\n" +
"        Scanner s=new Scanner(System.in);   \n" +
"        \n" +
"        do{\n" +
"            d=0;\n" +
"        try {\n" +
"         a=s.nextInt();\n" +
"        \n" +
"        }catch(InputMismatchException e){d=1;}\n" +
"        }while (d==1);\n" +
"       \n" +
"        \n" +
"        return a;\n  }}" ;


    return a;
    }
}
