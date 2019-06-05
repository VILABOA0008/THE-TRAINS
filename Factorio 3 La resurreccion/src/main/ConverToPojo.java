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
            aux = metodos.word(q, 3);
            aux = metodos.comillas(aux);
            aux = metodos.comillas(aux);
            fk.add(aux);
            System.out.println();

          } else {
            // TODO MTM no hay na echo

            aux = metodos.word(q, 3);

            aux = metodos.comillas(aux);
            aux = metodos.comillas(aux);
            System.out.println(auxmtm ); 
            for(String g:auxmtm) {
              System.out.print(g +"   "); 
            }
            System.out.println("\n\n "+tablas.get(i-1) + "  aux  " + aux);
            auxmtm[mtmc] = aux;
            mtmc++;
            System.out.println(aux);
          }

        } else {
          if (mtm.get(i).equals(false)) {

            String auxx = aux;
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

            System.out.println(tablaotm + " " + auxx + " aux  " + aux + "  tabla" + i);

          } else {
            // TODO MTM no hay na echo

            String auxx = aux;
            aux = metodos.word(q, 2);
            aux = metodos.specialword(q, '.');
            aux = metodos.comillas(aux);
            Integer auxid = metodos.idByTable(aux, tablas);
            auxmtm[mtmc] = String.valueOf(auxid);
            mtmc++;
            System.out.println(" refere    " + auxid);
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
          // System.out.println(q+"  key "+i );
        }
      }
    }

    /*
    for(int i=1;i<tablas.size()+1;i++) {
    System.out.println(mtm.get(i) );
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
