package main;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import bd.Bdd;
import bd.Leer;

public class Main {

  public static void main(String[] args) throws IOException, SQLException {
    //tipo 3 =MANY TO MANY CON PARAMETRO
    Map<Integer,Integer>tipo=new HashMap<>();
    Map<Integer, String[]> Mtm = new HashMap<>();
    Map<Integer, ArrayList<Integer>> mto  = new HashMap<>();
    Map<Integer, ArrayList<Integer>> otm = new HashMap<>();
    Map<Integer, Boolean> mtm = new HashMap<>();//SI LA TABLA ES MTM O NO
    Map<Integer, ArrayList<String>> fks = new HashMap<>();//NOMBRE DE TODAS LAS FKS
    Map<Integer, ArrayList<String>> vars = new HashMap<>();//nombre de las variables de los fields
    Map<Integer, ArrayList<String>> tipos = new HashMap<>();//tipo de las variables de los fields
  Map<Integer, ArrayList<String>> fields = new HashMap<>();//fields sin limpiar
  Map<Integer, ArrayList<String>> foreign = new HashMap<>();//foreign regerences sin limpiar
  ArrayList<String>arrayprimary=new ArrayList<>();//TODOS LOS IDS LOS QUE SON 2 SEPARADOS POR UN ESPACIO
  ArrayList<String>tablas=new ArrayList<>();//NOMBRE D ELAS TABLAS
    Bdd.bdd(fields,foreign,arrayprimary,tablas,mtm,tipo);
    System.err.println("sdad");
    ConverToPojo.pojo(vars,tipos,fields, foreign, arrayprimary,tablas,fks,mtm,otm,mto,Mtm);
    Scanner s=new Scanner(System.in);
    
    

    
/*   int cd=0;
    while(1>cd) {
      System.out.println("escrbe" );
      String a=s.nextLine();
      metodos.mayusq(a);
      
    }*/
    
    

    
    System.out.println("\n\n\nMAIN" );
    int c=0;
//    for(String i:arrayprimary) {
//      c++;
//      System.out.println(i+"    "+c ); 
//      
//    }
    
    
    
    
      for (int i = 1; i < tablas.size() + 1; i++) {
        //poner tipo=3 para base entities
        if(tipo.get(i)==1) {
          tipo.put(i, 3);
          System.out.println( "\n"+tablas.get(i-1)+"            "+"   cosas  "+arrayprimary.get(i-1)+""); 
         String word;
         System.out.println("vars antes   "+vars.get(i) ); 
         c=0;
          do {
            word=null;
            word=metodos.word(arrayprimary.get(i-1), c+1);
                        if(word!=null) {
                          for (int j = 0; j < vars.get(i).size(); j++) {
                            word=metodos.despital(word);
                            System.out.println("here   "+vars.get(i).get(j)+"   "+word ); 
                            if(vars.get(i).get(j).equalsIgnoreCase(word)){
                              vars.get(i).remove(j);
                              tipos.get(i).remove(j);}
                          }        }             
                        c++;
              }while(word!=null);
          System.out.println("vars despues   "+vars.get(i) ); 
        }
        
      }
      
      //Si  hay mas de una pk perooooo no es mtm
      for(int i=1;i<tablas.size();i++){  
        if(mtm.get(i)==true) {
          System.out.println(tablas.get(i-1) ); 
          if(Mtm.get(i)==null) { tipo.put(i, 4); }
        }
        
      }
          
      Map<Integer, ArrayList<String>> fksTest = new HashMap<>();//NOMBRE DE TODAS LAS FKS
      ArrayList<String>tablasTest=new ArrayList<>();//NOMBRE D ELAS TABLAS
      Leer leer=new Leer(tablasTest,fksTest);
      leer.start();
      System.err.println(tablasTest.size());
      System.exit(1);
    AgregadoPLUSPLUS.test(vars,tipos,tablas,fks,mtm,otm,mto,Mtm,tipo);
    
//                                                      TABLAS
//    [Line, TOT_Page, TOT_Button, TOT_DocType, TOT_Document, TOT_ButtonDoc, TOT_Style, TOT_ButtonStyle, TOT_Configuration]
      
//                                                      VARS
//     {1=[idLine, name, active], 2=[idPage, name, order, active], 3=[idButton, name, shortName, x, y, w, h, active, order], 
//    4=[idDocType, name], 5=[idDoc, name, link], 6=[], 7=[idStyle, name, styleClass], 8=[idButton, idStyle], 9=[idConfig, value]}
    
//                                                      TIPOS
//{1=[Integer, String, boolean], 2=[Integer, String, Integer, boolean], 3=[Integer, String, String, Integer, Integer, Integer, Integer, boolean, Integer], 
//    4=[Integer, String], 5=[Integer, String, String], 6=[], 7=[Integer, String, String], 8=[Integer, Integer], 9=[Integer, String]}
    
    
//                                                      FKS
//    {2=[FK_Line], 3=[FK_Page], 5=[FK_DocType]}
    
    
//                                                    TIPO
//    {1=0, 2=0, 3=0, 4=0, 5=0, 6=0, 7=0, 8=0, 9=0}
    
//                                                     OTM
//   {1=[2], 2=[1, 3], 4=[5]}
    
//                                                    MTO 
//    {2=[1, 3], 3=[2], 5=[4]}
    
//                                                      MTM
//    {1=false, 2=false, 3=false, 4=false, 5=false, 6=true, 7=false, 8=true, 9=false}
  }
}
