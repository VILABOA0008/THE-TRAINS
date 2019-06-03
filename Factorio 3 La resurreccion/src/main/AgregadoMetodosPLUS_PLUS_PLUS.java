package main;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

import textos.AgregadosGrandes;
import textos.Agregadospeques;

public class AgregadoMetodosPLUS_PLUS_PLUS {

  public static final boolean automatico = true;

  public static String VariablesBasicas(
      ArrayList<String> fieldsFinal, ArrayList<String> fieldsType, ArrayList<String> fieldsVar) {

    String a = "";

    for (int i = 0; i < fieldsFinal.size(); i++) {
      a += Agregadospeques.basicVar(fieldsFinal.get(i), fieldsType.get(i), fieldsVar.get(i));
    }
    return a;
  }

  public static String ManyToOne(ArrayList<String> fks, ArrayList<String> fkmoVarFinal) {

    String a = "";

    for (int i = 0; i < fks.size(); i++) {
      a += AgregadosGrandes.manyToOne(fks.get(i).toUpperCase(), fkmoVarFinal.get(i));
    }
    return a;
  }

  public static String MappedBy(ArrayList<String> fkmoFinal, ArrayList<String> fkmoVarFinal) {

//    System.out.println("");

    String a = "";

    for (int i = 0; i < fkmoFinal.size(); i++) {
      a += AgregadosGrandes.manyToOne(fkmoFinal.get(i), fkmoVarFinal.get(i));
    }
    return a;
  }

  public static void NombreAggregado(
      ArrayList<String> aggs,
      ArrayList<String> tablas,
      Map<Integer, Boolean> mtm,
      Map<Integer, String[]> Mtm,
      Map<Integer, ArrayList<String[]>> MTM,
      Map<Integer, ArrayList<Integer>> MTMapped) {
    String[] aggss = {
      "Page", "Button", "DocType", "Document", "null", "Style", "null", "Configuration", "null"
    };
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" ); 
    int c = 1;
    String agg;
    String[] arraymtm = new String[6];

    for (String i : tablas) {
      Scanner s = new Scanner(System.in);
      if (mtm.get(c) == false) {
        System.out.println("nombre del agregado de la tabla " + i);
               agg=s.nextLine();
//        agg = aggss[c - 1];
        aggs.add(metodos.Capital(agg));

      } else {
        System.out.println("\n\nQue agregado es la padre de " + i);

        System.out.println(
            "1   Agregado   "
                + aggs.get(Integer.valueOf(Mtm.get(c)[1]) - 1)
                + "  con  "
                + Mtm.get(c)[2]);
        System.out.println(
            "2   Agregado   "
                + aggs.get(Integer.valueOf(Mtm.get(c)[3]) - 1)
                + "  con  "
                + Mtm.get(c)[0]);
        int op = s.nextInt();
        String aux, aggpadre, tabla, fk1, fk2, agghijo;
        Integer auxmapped;
        arraymtm = new String[6];
        if (op == 1) {

          aux = Mtm.get(c)[1];
          aggpadre = aggs.get(Integer.valueOf(aux) - 1);
          tabla = i;
          fk1 = Mtm.get(c)[0];
          fk2 = Mtm.get(c)[2];
          agghijo = aggs.get(Integer.valueOf(Mtm.get(c)[3]) - 1);
          arraymtm[0] = aux;
          arraymtm[1] = aggpadre;
          arraymtm[2] = tabla;
          arraymtm[3] = fk1;
          arraymtm[4] = fk2;
          arraymtm[5] = agghijo;
          auxmapped = Integer.valueOf(Mtm.get(c)[3]);
        } else {
          //   aux=Integer.valueOf(Mtm.get(c)[3]);

          aux = Mtm.get(c)[3];
          aggpadre = aggs.get(Integer.valueOf(aux) - 1);
          tabla = i;
          fk1 = Mtm.get(c)[2];
          fk2 = Mtm.get(c)[0];
          agghijo = aggs.get(Integer.valueOf(Mtm.get(c)[1]) - 1);
          arraymtm[0] = aux;
          arraymtm[1] = aggpadre;
          arraymtm[2] = tabla.toString();
          arraymtm[3] = fk1;
          arraymtm[4] = fk2;
          arraymtm[5] = agghijo;
          auxmapped = Integer.valueOf(Mtm.get(c)[1]);
        }
        // MANY TO MANY

        ArrayList<String[]> auxadd = new ArrayList<>();
        if (MTM.get(Integer.valueOf(aux)) == null) {
          auxadd.add(arraymtm);
          MTM.put(Integer.valueOf(aux), auxadd);
        } else {
          auxadd = MTM.get(Integer.valueOf(aux));
          auxadd.add(arraymtm);
          MTM.put(Integer.valueOf(aux), auxadd);
        }

        // Mapped By
        /*
        ArrayList<Integer>aa=MTMapped.get(auxmapped);
        if(aa==null) {
          aa=new ArrayList<>();
        }
        aa.add(Integer.valueOf(aux));

        MTMapped.put(auxmapped, aa);*/
        ArrayList<Integer> aa = new ArrayList<>();
        if (MTMapped.get(Integer.valueOf(auxmapped)) == null) {
          aa.add(Integer.valueOf(aux));
          MTMapped.put(auxmapped, aa);
        } else {
          aa = MTMapped.get(auxmapped);
          aa.add(Integer.valueOf(aux));
          MTMapped.put(auxmapped, aa);
        }

  
        aggs.add(null);

 
      }
      c++;
    }
  }

  public static String Fields(
      ArrayList<String> fieldsType, ArrayList<String> fieldsFinal, ArrayList<String> fieldsVar) {
    String a = "";
    int nf, c = 0;
    String tipo, var;
    // System.out.println("Cuantos fields sin relaciones");
    while (fieldsType.size() > c) {

      var = fieldsVar.get(c);

      String Field = "FIELD_" + var.toUpperCase();
      fieldsFinal.add(Field);
      a += Agregadospeques.finalFields(Field, var);
      c++;
    }

    return a;
  }

  public static String OnesToManys(
      String agg,
      ArrayList<Integer> otm,
      ArrayList<String> aggs,
      ArrayList<String> mapedBy,
      ArrayList<String> mapedByV,
      ArrayList<String> mapedByFinal) {
    String a = "", MappedBy, mappedByV;
    int nf;
//    System.out.println("Numero de ones to manies");
    int c = 0;
    nf = otm.size();
    while (nf > c) {

//      System.out.println("mapped by");

      MappedBy = agg.toLowerCase();

      mapedBy.add(MappedBy);

      if (!MappedBy.isEmpty()) {
        String MappedByFinal = "MAPPED_BY_" + MappedBy.toUpperCase();
        mapedByFinal.add(MappedByFinal);

        a += Agregadospeques.MappedBy(MappedByFinal, MappedBy);
        System.out.println("Escribe la variable");

        mappedByV = aggs.get(otm.get(c) - 1);

        mapedByV.add(mappedByV);
      }

      c++;
    }
    return a;
  }

  public static String ManyToMany(String agg, ArrayList<String> mtmVar, ArrayList<String[]> MTM) {
    String a = "";
//    System.out.println("Numero de manys to manys sin mapped by");
    int nf;
    int c = 0;

    nf = MTM.size();

    while (nf > c) {
      String clase, id, tabla;
//      System.out.println("tipo (en minuscula) ");

      clase = MTM.get(c)[5].toLowerCase();

      mtmVar.add(clase);

//      System.out.println("id  en la tabla");
      id = MTM.get(c)[4];

//      System.out.println("tabla ");
      tabla = MTM.get(c)[2];

      a += Agregadospeques.finalManytoMany(agg, clase, id, tabla);

      c++;
      System.out.println(clase);
    }
    return a;
  }

  public static String ManyToManyMapped(
      String agg, ArrayList<String> mtmVar, ArrayList<Integer> mapped, ArrayList<String> aggs) {
    String a = "";
    int nf;
//    System.out.println("Numero de manys to manys con mapped by");
    int c = 0;

    agg = agg.toLowerCase();
    nf = mapped.size();

    while (nf > c) {
      String clase, map;

      clase = agg + "s";

//      System.out.println("mappedby ");
      map = aggs.get(mapped.get(c) - 1).toLowerCase();
      mtmVar.add(map);

//      System.out.println(clase + "  clase   " + map);

      a += Agregadospeques.finalManytoManyMapped(clase, map);

      c++;
    }
    return a;
  }

  public static String ManysToOnes(
      ArrayList<String> aggs,
      ArrayList<String> fks,
      ArrayList<String> fkmoVarFinal,
      ArrayList<Integer> mto) {
    System.out.println("aggs   " + aggs);
    String a = "";
    int nf;
    int c = 0;
    //  System.out.println("Numero de manys to one");
//    System.out.println(fks + " \n " + mto);
//    System.out.println(fks.size() - 1);
    nf = fks.size();
//    System.out.println("nf  " + nf);

    while (c < nf) {
      String fk;
      //  System.out.println("Nombre");

      fk = aggs.get(mto.get(c) - 1).toLowerCase();

//      System.out.println("\n\nfk  " + fks.get(c));
      a += Agregadospeques.finalFk(fks.get(c));
      fkmoVarFinal.add(fk);

      c++;
    }
    return a;
  }
}
