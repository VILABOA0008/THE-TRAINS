package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ConverToPojo {


public static void pojo(

    Map<Integer, ArrayList<String>> vars,
    Map<Integer, ArrayList<String>> tipos,
  Map<Integer, ArrayList<String>> fields,
  Map<Integer, ArrayList<String>> foreign,
  ArrayList<String> arrayprimary,
  ArrayList<String> tablas,
  Map<Integer, ArrayList<String>> fks)
   {
  
  

  
  FieldsyVars(vars, tipos, fields, tablas);
  ManiesToOnes(vars, tipos, fields, tablas,foreign,fks,arrayprimary);

}


public static void ManiesToOnes(    Map<Integer, ArrayList<String>> vars,
    Map<Integer, ArrayList<String>> tipos,  Map<Integer, ArrayList<String>> fields, 
    ArrayList<String> tablas,  Map<Integer, ArrayList<String>> foreign,  
    Map<Integer, ArrayList<String>> fks,ArrayList<String> arrayprimary){
  ArrayList<String>fk;
  String aux="";
  for (int i = 1; i < tablas.size()+1; i++) {
    System.out.println( " \n\n    "+ tablas.get(i-1) ); 
    fk=new ArrayList<>();
    for(String q:foreign.get(i)) {
      //System.out.println(q+"  1"); 
      q+=" ";
      if(metodos.word(q, 1).equalsIgnoreCase("FOREIGN")){
        aux=metodos.word(q, 3);
        aux=metodos.comillas(aux);aux=metodos.comillas(aux);
       // System.out.println( aux); 
        fk.add(aux);
      }
      
      else {
//        aux=metodos.word(q, 2);
//        aux=metodos.specialword(q, '.');aux=metodos.comillas(aux);
//        System.out.println( aux); 
//        aux=metodos.word(q, 3);
//        aux=metodos.comillas(aux);aux=metodos.comillas(aux);
//        System.out.println( aux); 
      }
   //   System.out.println(q+"2"); 
      
if(!fk.isEmpty()) {fks.put(i, fk);}
    }
    
    System.out.println( arrayprimary.get(i-1));
    
  }
  for (int i = 1; i < tablas.size()+1; i++) {
    if(fks.get(i)!=null) {
    for(String q:fks.get(i)) {      
      System.out.println(q ); 
      
    }
    }
    
  }
  
}






  
public static void FieldsyVars(    Map<Integer, ArrayList<String>> vars,
    Map<Integer, ArrayList<String>> tipos,
  Map<Integer, ArrayList<String>> fields,  ArrayList<String> tablas){
  
  
  Map<String, String> toVars=new HashMap<>();
  toVars.put("INT", "int");
  toVars.put("VARCHAR", "String");
  toVars.put("BIT", "boolean");
  
  String s="";
  ArrayList<String>var=new ArrayList<>();
  ArrayList<String>tipo=new ArrayList<>();
  String aux="";
  
  for(int q=1;q<(tablas.size()+1);q++) {
    var=new ArrayList<>();
    tipo=new ArrayList<>();
  for(String i:fields.get(q)) {
  s=i;
  aux=metodos.word(s,1);aux=metodos.comillas(aux);aux=metodos.despital(aux);
  var.add(aux);
  aux=metodos.word(s, 2); aux=metodos.varchar(aux);
  aux=toVars.get(aux);
  tipo.add(aux);
  }
  vars.put(q, var);
  tipos.put(q, tipo);
  
//System.out.println("\n\n\n");
//for(int i=0;i<var.size();i++) {
//  System.out.println(var.get(i)+"   "+tipo.get(i));
}
  for(int i=1;i<tablas.size()+1;i++) {
    
      System.out.println("\nTABLA"+i ); 
    vars.get(i).forEach(n->System.out.println(n ));
    tipos.get(i).forEach(n->System.out.println(n ));
  }
  
}  
  
 




}