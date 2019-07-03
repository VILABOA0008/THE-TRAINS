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
      Map<Integer, ArrayList<String>> fks,
      Map<Integer, Boolean> mtm,
      Map<Integer, ArrayList<Integer>> otm,
      Map<Integer, ArrayList<Integer>> mto,
      Map<Integer, String[]> Mtm, Map<Integer,Integer>tipo) {

    FieldsyVars(vars, tipos, fields, tablas);
    ManiesToOnes(vars, tipos, fields, tablas, foreign, fks, arrayprimary, mtm, otm, mto, Mtm);
    tipo(vars, tipos,  tablas,  arrayprimary, mtm,  Mtm,tipo);

  }

  
  public static void tipo(
      Map<Integer, ArrayList<String>> vars,
      Map<Integer, ArrayList<String>> tipos,
      ArrayList<String> tablas,
      ArrayList<String> arrayprimary,
      Map<Integer, Boolean> mtm,
      Map<Integer, String[]> Mtm,Map<Integer,Integer>tipo) {

    int c;
    for (int i = 1; i < tablas.size() + 1; i++) {
      //poner tipo=3 para base entities
      if(tipo.get(i)==1) {
        tipo.put(i, 3);
       String word;
       c=0;
        do {
          word=metodos.word(arrayprimary.get(i-1), c+1);
                      if(word!=null) {
                        for (int j = 0; j < vars.get(i).size(); j++) {
                          word=metodos.despital(word);
                          if(vars.get(i).get(j).equalsIgnoreCase(word)){
                            vars.get(i).remove(j);
                            tipos.get(i).remove(j);}
                        }        }             
                      c++;
            }while(word!=null);
      }
      
    }
    
    //Si  hay mas de una pk perooooo no es mtm
    for(int i=1;i<tablas.size();i++){  
      if(mtm.get(i)) {
        if(Mtm.get(i)==null) { tipo.put(i, 4); }
      }
      
    }
    
    
    
  }
  public static void ManiesToOnes(
      Map<Integer, ArrayList<String>> vars,
      Map<Integer, ArrayList<String>> tipos,
      Map<Integer, ArrayList<String>> fields,
      ArrayList<String> tablas,
      Map<Integer, ArrayList<String>> foreign,
      Map<Integer, ArrayList<String>> fks,
      ArrayList<String> arrayprimary,
      Map<Integer, Boolean> mtm,
      Map<Integer, ArrayList<Integer>> otm,
      Map<Integer, ArrayList<Integer>> mto,
      Map<Integer, String[]> Mtm) {
    ArrayList<String> fk;
    String aux = "";
    for (int i = 1; i < tablas.size() + 1; i++) {
      fk = new ArrayList<>();
      String[] auxmtm = new String[4];
      int mtmc = 0;
      for (String q : foreign.get(i)) {
        q += " ";
        if (metodos.word(q, 1).equalsIgnoreCase("FOREIGN")) {
          

          if (mtm.get(i).equals(false)) {
          //MTO OTM MTO OTM MTO OTM MTO OTM MTO OTM 
            aux = metodos.word(q, 3);
            aux = metodos.comillas(aux);
            aux = metodos.comillas(aux);
            fk.add(aux);

          } else {
            //MTM MTM MTM MTM MTM MTM MTM MTM MTM MTM MTM MTM
            aux = metodos.word(q, 3);
            aux = metodos.comillas(aux);
            aux = metodos.comillas(aux);
            auxmtm[mtmc] = aux;
            mtmc++;
          }

        } else {
          if (mtm.get(i).equals(false)) {

            aux = metodos.specialword(q, '.');
            aux = metodos.comillas(aux);
            int tablaotm = metodos.idByTable(aux, tablas);
            ArrayList<Integer> auxmto = mto.get(i);
            if (auxmto == null) {
              auxmto = new ArrayList<>();
            }
            auxmto.add(tablaotm);
            mto.put(i, auxmto);
            ArrayList<Integer> auxotm = mto.get(tablaotm);
            if (auxotm == null) {
              auxotm = new ArrayList<>();
            }
            auxotm.add(i);
            otm.put(tablaotm, auxotm);


          } else {
            aux = metodos.specialword(q, '.');
            aux = metodos.comillas(aux);
            Integer auxid = metodos.idByTable(aux, tablas);
            auxmtm[mtmc] = String.valueOf(auxid);
            mtmc++;
            if (mtmc == 4) {
              Mtm.put(i, auxmtm);
            }}
        }
        if (!fk.isEmpty()) {
          fks.put(i, fk);
        }}
    }


  }

  public static void FieldsyVars(
      Map<Integer, ArrayList<String>> vars,
      Map<Integer, ArrayList<String>> tipos,
      Map<Integer, ArrayList<String>> fields,
      ArrayList<String> tablas) {

    Map<String, String> toVars = new HashMap<>();
    toVars.put("INT", "Integer");
    toVars.put("TINYINT", "Byte");
    toVars.put("VARCHAR", "String");
    toVars.put("BIT", "boolean");
    toVars.put("FLOAT", "float");
    toVars.put("TIMESTAMP", "LocalDateTime");
    toVars.put("TIME", "LocalTime");
    toVars.put("BINARY", "byte[]");
    toVars.put("DECIMAL", "BigDecimal");

    
    String s = "";
    ArrayList<String> var = new ArrayList<>();
    ArrayList<String> tipo = new ArrayList<>();
    String aux = "";

    for (int q = 1; q < (tablas.size() + 1); q++) {
      var = new ArrayList<>();
      tipo = new ArrayList<>();
      for (String i : fields.get(q)) {
        s = i;
        aux = metodos.word(s, 1);
        aux = metodos.comillas(aux);
        aux = metodos.despital(aux);
        var.add(aux);
        aux = metodos.word(s, 2);
        aux = metodos.varchar(aux);
        if (aux.contains("INT")) {
          aux = "INT";
        }
        if (aux.contains("BIT")) {
          aux = "BIT";
        }
        if (aux.contains("TINYINT")) {
          aux = "TINYINT";
        }
        if (aux.contains("BINARY")) {
          aux = "BINARY";
        }
        if (aux.contains("DECIMAL")) {
          aux = "DECIMAL";
        }
        aux = toVars.get(aux);
        tipo.add(aux);
      }
      vars.put(q, var);
      tipos.put(q, tipo);


    }

  }
}
