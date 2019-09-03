package main;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import bd.Bdd;
import bd.leer;

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
  
  
//  leer.leer();
//  System.exit(1);
//    Bdd.bdd(fields,foreign,arrayprimary,tablas,mtm,tipo);
//    ConverToPojo.pojo(vars,tipos,fields, foreign, arrayprimary,tablas,fks,mtm,otm,mto,Mtm);
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
          
    
    /*
    for (int i = 1; i < tablas.size() + 1; i++) {
      if (Mtm.get(i) != null) {
        System.out.println("\n\nTABLA" ); 
        for (String q : Mtm.get(i)) {
           System.out.print(q+"   " );
        }      }    }
    System.out.println("\n" ); 
    */

    AgregadoPLUSPLUS.test(vars,tipos,  tablas,fks,mtm,otm,mto,Mtm,tipo);
      

    
//    Agregado.test();
//    automata.a();

  }
}
