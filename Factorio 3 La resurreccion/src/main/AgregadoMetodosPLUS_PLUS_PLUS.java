package main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

import cosas.Escribir;
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

  public static String ManyToOneEspecial(String agg, ArrayList<String> fks,
      ArrayList<String> fkmoVarFinal, String url) {

    String var0 = metodos.Capital(fkmoVarFinal.get(0)), var1 = metodos.Capital(fkmoVarFinal.get(1));

    String a = "";

    a += "\n  @ManyToOne(fetch = FetchType.LAZY)\n" +
        "  @JoinColumn(name = " + fks.get(0).toUpperCase()
        + ", nullable = false, insertable = false, updatable = false)\n" +
        "  private " + var0 + " " + fkmoVarFinal.get(0) + ";\n";

    a += "\n  @ManyToOne(fetch = FetchType.LAZY)\n" +
        "  @JoinColumn(name = " + fks.get(1).toUpperCase()
        + ", nullable = false, insertable = false, updatable = false)\n" +
        "  private " + var1 + " " + fkmoVarFinal.get(1) + ";\n";

    a += "  @EmbeddedId\n"
        + "@AttributeOverrides( {" +
        "  @AttributeOverride(name = \" id" + var0 + "  \", column = @Column(name = "
        + fks.get(0).toUpperCase() + ")),\n" +
        "  @AttributeOverride(name = \" id" + var1 + "\", column = @Column(name ="
        + fks.get(1).toUpperCase() + "))})\n" +
        "  private " + agg + "Id id;\n" +
        "\n"
        + "\n"
        + "\n"
        + "\n" +
        "  " + agg + "(" + var0 + "Id id" + var0 + ", " + var1 + "Id id" + var1 + ") {\n" +
        "    id = new " + agg + "Id(id" + var0 + ".getId(), id" + var1 + ".getId());\n" +
        "  }"
        + "\n" +
        "  @Override\n" +
        "  public " + agg + "Id getId() {\n" +
        "    return new " + agg + "Id(getId" + metodos.Capital(fkmoVarFinal.get(0))
        + "().getId(), getId" + metodos.Capital(fkmoVarFinal.get(1)) + "().getId());\n" +
        "  }";

    Escribir.escribir(
        url + "domain\\model\\" + agg + "\\"
            + agg
            + "Id.java",
        AgregadoId.idMtm(agg, var0, var1));
    return a;

  }

  public static String ManyToOne(ArrayList<String> fks, ArrayList<String> fkmoVarFinal, int tipo) {

    String a = "";
//  if(tableType.get(c)==3&&(fk.contains("id")||fk.contains("Id"))) {
//  fk = fk.replace("id", "");fk = fk.replace("Id", "");
//}
    for (int i = 0; i < fks.size(); i++) {
      String withoutFK;
      if (fks.get(i).contains("FK")) {
        withoutFK = fks.get(i).replace("FK_", "");
      } else {
        withoutFK = fks.get(i);
      }
      if (withoutFK.contains("id")||withoutFK.contains("Id")) {
        withoutFK = withoutFK.replace("id", "");
        withoutFK = withoutFK.replace("Id", "");}

        a += AgregadosGrandes.manyToOne(withoutFK, fks.get(i).toUpperCase(), fkmoVarFinal.get(i),
          tipo);
        fks.set(i, withoutFK);
    }
    return a;
  }

  public static void NombreAggregado(
      ArrayList<String> aggs,
      ArrayList<String> tablas,
      Map<Integer, Boolean> mtm,
      Map<Integer, String[]> Mtm,
      Map<Integer, ArrayList<String[]>> MTM,
      Map<Integer, ArrayList<Integer>> MTMapped,
      Map<Integer, Integer> tipo) {

    int c = 0;
    String agg;
    String[] arraymtm = new String[6];

    for (String i : tablas) {
      Scanner s = new Scanner(System.in);

      if (!mtm.get(c) || tipo.get(c) == 4) {

        agg = i;

        aggs.add(metodos.Capital(agg));
      } else {

        int op = 0;
        while (op != 1 && op != 2) {
          System.out.println("\n\n  " + c + "Que agregado es la padre de " + i);

          System.out.println(
              "1   Agregado   "
                  + tablas.get(Integer.valueOf(Mtm.get(c)[1]))
                  + "  con  "
                  + Mtm.get(c)[2]);
          System.out.println(
              "2   Agregado   "
                  + tablas.get(Integer.valueOf(Mtm.get(c)[3]))
                  + "  con  "
                  + Mtm.get(c)[0]);

          try {
            op = 1;
            // op = s.nextInt();
          } catch (InputMismatchException e) {
            s.nextLine();
            System.out.println("Fallo tecnico Tuyo");
          }
        }

        String aux, aggpadre, tabla, fk1, fk2, agghijo;
        Integer auxmapped;
        arraymtm = new String[6];
        if (op == 1) {

          aux = Mtm.get(c)[1];
          aggpadre = tablas.get(Integer.valueOf(aux) - 0);
          tabla = i;
          fk1 = Mtm.get(c)[0];
          fk2 = Mtm.get(c)[2];
          agghijo = tablas.get(Integer.valueOf(Mtm.get(c)[3]) - 0);
          arraymtm[0] = aux;
          arraymtm[1] = aggpadre;
          arraymtm[2] = tabla;
          arraymtm[3] = fk1;
          arraymtm[4] = fk2;
          arraymtm[5] = agghijo;
          auxmapped = Integer.valueOf(Mtm.get(c)[3]);
        } else {
          // aux=Integer.valueOf(Mtm.get(c)[3]);

          aux = Mtm.get(c)[3];
          aggpadre = tablas.get(Integer.valueOf(aux) - 0);
          tabla = i;
          fk1 = Mtm.get(c)[2];
          fk2 = Mtm.get(c)[0];
          agghijo = tablas.get(Integer.valueOf(Mtm.get(c)[1]) - 0);
          arraymtm[0] = aux;
          arraymtm[1] = aggpadre;
          arraymtm[2] = tabla;
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
    String Field;
    int nf, c = 0;
    String tipo, var;
    // System.out.println("Cuantos fields sin relaciones");
    while (fieldsType.size() > c) {
      var = fieldsVar.get(c);
        Field= metodos.mayusq(var);
       Field = "FIELD_" + Field.toUpperCase();
      
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
    // System.out.println("Numero de ones to manies");
    int c = 0;
    nf = otm.size();
    while (nf > c) {

      // System.out.println("mapped by");

      MappedBy = metodos.despital(agg);

      mapedBy.add(MappedBy);

      if (!MappedBy.isEmpty()) {
        String MappedByFinal = "MAPPED_BY_" + metodos.mayusq(MappedBy).toUpperCase();
        mapedByFinal.add(MappedByFinal);
        // System.out.println(MappedByFinal + " mapeddd " + MappedBy);
        if (c == 0) {
          a += Agregadospeques.MappedBy(MappedByFinal, MappedBy);
        }
        // System.out.println("Escribe la variable");

        mappedByV = metodos.despital(aggs.get(otm.get(c) - 0));

        mapedByV.add(mappedByV);
      }

      c++;
    }
    return a;
  }

  public static String ManyToMany(String agg, ArrayList<String> mtmVar, ArrayList<String[]> MTM) {
    String a = "";
    // System.out.println("Numero de manys to manys sin mapped by");
    int nf;
    int cc = 2;
    int c = 0;

    nf = MTM.size();

    while (nf > c) {
      String clase, id, tabla;

      // TIPO");
      clase = metodos.despital(MTM.get(c)[5]);
      mtmVar.add(clase);
      // ID
      id = MTM.get(c)[4];

      // System.out.println("tabla ");
      tabla = MTM.get(c)[2];
      if (a.contains(clase.toUpperCase())) {
        clase += cc;
        cc++;
        a += Agregadospeques.finalManytoMany(agg, clase, id, tabla);
      } else {

        a += Agregadospeques.finalManytoMany(agg, clase, id, tabla);
        a += Agregadospeques.finalManytoManyId(agg, clase, id, tabla);
      }

      c++;
    }
    return a;
  }

  public static String ManyToManyMapped(
      String agg, ArrayList<String> mtmVar, ArrayList<Integer> mapped, ArrayList<String> aggs) {
    String a = "";
    int nf;
    // System.out.println("Numero de manys to manys con mapped by");
    int c = 0, cc = 2;

    agg = metodos.despital(agg);
    nf = mapped.size();

    while (nf > c) {
      String clase, map;

      clase = agg + "s";

      // System.out.println("mappedby ");
      map = metodos.despital(aggs.get(mapped.get(c) - 0));
      if (a.contains(map.toUpperCase())) {
        mtmVar.add(map);
        a += Agregadospeques.finalManytoManyMapped((clase + cc), (map + cc));
        clase += cc;
        cc++;
      } else {
        mtmVar.add(map);

        // System.out.println(clase + " clase " + map);
        // if (c == 0) {

        a += Agregadospeques.finalManytoManyMapped(clase, map);
      }
      // }

      c++;
    }
    return a;
  }

  public static String ManysToOnes(
      ArrayList<String> aggs,
      ArrayList<String> fks,
      ArrayList<String> fkmoVarFinal,
      ArrayList<Integer> mto) {
    // System.out.println("aggs " + aggs);
    String a = "";
    int nf;
    int c = 0;
    // System.out.println("Numero de manys to one");
    nf = fks.size();
    while (c < nf) {
      String fk;
      // System.out.println("Nombre");

      fk = metodos.despital(aggs.get(mto.get(c) - 0));

      // System.out.println("\n\nfk " + fks.get(c));
      a += Agregadospeques.finalFk(fks.get(c));
      fkmoVarFinal.add(fk);

      c++;
    }
    return a;
  }
}
