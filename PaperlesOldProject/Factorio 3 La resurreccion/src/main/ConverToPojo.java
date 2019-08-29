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
      Map<Integer, String[]> Mtm) {

    FieldsyVars(vars, tipos, fields, tablas);
    ManiesToOnes(vars, tipos, fields, tablas, foreign, fks, arrayprimary, mtm, otm, mto, Mtm);
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

            aux = metodos.word(q, 2);
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

            aux = metodos.word(q, 2);
            aux = metodos.specialword(q, '.');
            aux = metodos.comillas(aux);
            Integer auxid = metodos.idByTable(aux, tablas);
            auxmtm[mtmc] = String.valueOf(auxid);
            mtmc++;
            if (mtmc == 4) {
              Mtm.put(i, auxmtm);
            }
          }
        }

        if (!fk.isEmpty()) {
          fks.put(i, fk);
        }
      }
    }

    for (int i = 1; i < tablas.size() + 1; i++) {
      if (otm.get(i) != null) {
        for (int q : otm.get(i)) {
        }
      }
    }

    /*
    for(int i=1;i<tablas.size()+1;i++) {
    }*/

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
    toVars.put("DATE", "LocalDate");
    toVars.put("DECIMAL", "BigDecimal");

    
    String s = "";
    ArrayList<String> var = new ArrayList<>();
    ArrayList<String> tipo = new ArrayList<>();
    String aux = "";

    for (int q = 1; q < (tablas.size() + 1); q++) {
      var = new ArrayList<>();
      tipo = new ArrayList<>();
      
        boolean a=true;
        while(a) {
          try {
      System.err.println(fields.get(q).size());
      a=false;
      }catch(NullPointerException e) {q++;}
//      System.err.println(tablas.get(q));
        }
      System.err.println(q+"  qqq");
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
        if (aux.contains("DATE")) {
          aux = "DATE";
        }
        

        aux = toVars.get(aux);
        tipo.add(aux);
      }
      vars.put(q, var);
      tipos.put(q, tipo);

      // System.out.println("\n\n\n");
      // for(int i=0;i<var.size();i++) {
      //  System.out.println(var.get(i)+"   "+tipo.get(i));
    }
    for (int i = 1; i < tablas.size() + 1; i++) {

      //      System.out.println("\nTABLA"+i );
      //    vars.get(i).forEach(n->System.out.println(n ));
      //    tipos.get(i).forEach(n->System.out.println(n ));
    }
  }
}
