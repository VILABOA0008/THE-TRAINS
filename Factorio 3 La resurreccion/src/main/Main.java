package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import bd.Bdd;

public class Main {

  public static void main(String[] args) throws IOException {
    Map<Integer, ArrayList<Integer>> mto = new HashMap<>();
    Map<Integer, ArrayList<Integer>> otm = new HashMap<>();
    Map<Integer, Boolean> mtm = new HashMap<>();//SI LA TABLA ES MTM O NO
    Map<Integer, ArrayList<String>> fks = new HashMap<>();//NOMBRE DE TODAS LAS FKS
    Map<Integer, ArrayList<String>> vars = new HashMap<>();//nombre de las variables de los fields
    Map<Integer, ArrayList<String>> tipos = new HashMap<>();//tipo de las variables de los fields
  Map<Integer, ArrayList<String>> fields = new HashMap<>();//fields sin limpiar
  Map<Integer, ArrayList<String>> foreign = new HashMap<>();//foreign regerences sin limpiar
  ArrayList<String>arrayprimary=new ArrayList<>();//TODOS LOS IDS LOS QUE SON 2 SEPARADOS POR UN ESPACIO
  ArrayList<String>tablas=new ArrayList<>();//NOMBRE D ELAS TABLAS
    Bdd.bdd(fields,foreign,arrayprimary,tablas,mtm);
    ConverToPojo.pojo(vars,tipos,fields, foreign, arrayprimary,tablas,fks,mtm,otm,mto);
    
    System.out.println("\n\nHERE\n" ); 
    for (int i=1;i<tablas.size()+1;i++) {
System.out.println();
      if(mto.get(i)!=null)
      for(Integer q:mto.get(i)) {
        System.out.println(i+"  valor "+q ); 
      }
    }
    
    AgregadoPLUSPLUS.test(vars,tipos,fields, foreign, arrayprimary,tablas,fks,mtm,otm,mto);
    

    
    //Agregado.test();
//    automata.a();

  }
}
