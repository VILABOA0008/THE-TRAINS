package main;

import java.util.ArrayList;
import java.util.Scanner;

import textos.AgregadosGrandes;
import textos.Agregadospeques;

public class AgregadoMetodos {
  
  public static final boolean automatico = true;

  public static String VariablesBasicas(
      ArrayList<String> fieldsFinal, ArrayList<String> fieldsType, ArrayList<String> fieldsVar) {

    String a = "";

    for (int i = 0; i < fieldsFinal.size(); i++) {
      a += Agregadospeques.basicVar(fieldsFinal.get(i), fieldsType.get(i), fieldsVar.get(i));
    }
    return a;
  }

  public static String ManyToOne(ArrayList<String> fkmoFinal, ArrayList<String> fkmoVarFinal) {

    String a = "";

    for (int i = 0; i < fkmoFinal.size(); i++) {
      a += AgregadosGrandes.manyToOne(fkmoFinal.get(i), fkmoVarFinal.get(i));
    }
    return a;
  }

  public static String MappedBy(ArrayList<String> fkmoFinal, ArrayList<String> fkmoVarFinal) {

    System.out.println("");

    String a = "";

    for (int i = 0; i < fkmoFinal.size(); i++) {
      a += AgregadosGrandes.manyToOne(fkmoFinal.get(i), fkmoVarFinal.get(i));
    }
    return a;
  }

  public static String NombreTabla() {
    String tabla = "";
    Scanner s = new Scanner(System.in);

    System.out.println("nombre de la tabla");
    if (automatico) {
      tabla = "CUSTOMERS";
    } else {
      tabla = s.nextLine();
    }

    return tabla;
  }

  public static String NombreAggregado() {
    String agg = "";
    Scanner s = new Scanner(System.in);
    System.out.println("nombre del agregado");
    if (automatico) {
      agg = "Customers";
    } else {
      agg = metodos.Capital(s.nextLine());
    }

    return agg;
  }

  public static String Fields(
      ArrayList<String> fieldsType, ArrayList<String> fieldsFinal, ArrayList<String> fieldsVar) {
    String a = "";
    int nf, c = 0;
    String tipo, var;
    Scanner s = new Scanner(System.in);
    System.out.println("Cuantos fields sin relaciones");
    if (automatico) {
      nf = 3;
    } else {
      nf = s.nextInt();
      s.nextLine();
    }
    while (nf > c) {

      System.out.println("tipo");

      if (automatico) {
        String cct[] = {"String", "String", "Integer", "float"};
        tipo = cct[c];
      } else {
        tipo = s.nextLine();
      }
      fieldsType.add(tipo);

      System.out.println("variable");

      if (automatico) {
        String ccv[] = {"name", "username", "age", "money"};
        var = ccv[c];
      } else {
        var = s.nextLine();
      }
      String Field = "FIELD_" + var.toUpperCase();
      fieldsFinal.add(Field);
      fieldsVar.add(var);
      a += Agregadospeques.finalFields(Field, var);
      c++;
    }

    return a;
  }

  public static String OnesToManys(
      ArrayList<String> mapedBy, ArrayList<String> mapedByV, ArrayList<String> mapedByFinal) {
    Scanner s = new Scanner(System.in);
    String a = "", MappedBy, mappedByV;
    int nf;
    System.out.println("Numero de ones to manies");
    int c = 0;

    if (automatico) {
      nf = 1;
    } else {
      nf = s.nextInt();
      s.nextLine();
    }

    while (nf > c) {

      System.out.println("mapped by");

      if (automatico) {
        MappedBy = "storage";
      } else {
        MappedBy = s.nextLine();
      }

      mapedBy.add(MappedBy);

      if (!MappedBy.isEmpty()) {
        String MappedByFinal = "MAPPED_BY_" + MappedBy.toUpperCase();
        mapedByFinal.add(MappedByFinal);

        a += Agregadospeques.MappedBy(MappedByFinal, MappedBy);
        System.out.println("Escribe la variable");
        if (automatico) {
          mappedByV = "position";

        } else {
          mappedByV = s.nextLine();
        }

        mapedByV.add(mappedByV);
      }

      c++;
    }
    return a;
  }

  public static String ManyToMany(String agg, ArrayList<String> mtmVar) {
    Scanner s = new Scanner(System.in);
    String a = "";
    System.out.println("Numero de manys to manys sin mapped by");
    int nf;
    int c = 0;

    if (automatico) {
      nf = 1;
    } else {
      nf = s.nextInt();
      s.nextLine();
    }
    while (nf > c) {
      String clase, id, tabla;
      System.out.println("tipo (en minuscula) ");
      if (automatico) {
        clase = "pagesina";
      } else {
        clase = s.nextLine();
      }
      mtmVar.add(clase);

      System.out.println("id  en la tabla");
      if (automatico) {
        id = "idPage";
      } else {
        id = s.nextLine();
      }
      System.out.println("tabla ");
      if (automatico) {
        tabla = "TOT_CUSTOMER_PAGE";
      } else {
        tabla = s.nextLine();
      }
      a += Agregadospeques.finalManytoMany(agg, clase, id, tabla);

      c++;
    }
    return a;
  }

  public static String ManyToManyMapped(String agg, ArrayList<String> mtmVar) {
    Scanner s = new Scanner(System.in);
    String a = "";
    int nf;
    System.out.println("Numero de manys to manys con mapped by");
    int c = 0;

    if (automatico) {
      nf = 1;
    } else {
      nf = s.nextInt();
      s.nextLine();
    }
    while (nf > c) {
      String clase, map;
      System.out.println("tipo (en minuscula) ");
      if (automatico) {
        clase = "style";
      } else {
        clase = s.nextLine();
      }
      mtmVar.add(clase);

      System.out.println("mappedby ");
      if (automatico) {
        map = "customers";
      } else {
        map = s.nextLine();
      }

      a += Agregadospeques.finalManytoManyMapped(clase, map);

      c++;
    }
    return a;
  }

  public static String ManysToOnes(ArrayList<String> fkmoFinal, ArrayList<String> fkmoVarFinal) {

    String a = "";
    int nf;
    int c = 0;
    System.out.println("Numero de manys to one");
    Scanner s = new Scanner(System.in);
    if (automatico) {
      nf = 2;
    } else {
      nf = s.nextInt();
      s.nextLine();
    }

    while (nf > c) {
      String fk;
      System.out.println("Nombre");
      if (automatico) {
        String ccv[] = {"style", "page"};
        fk = ccv[c];
      } else {
        fk = s.nextLine();
      }
      fkmoFinal.add("FK_" + fk.toUpperCase());
      a += Agregadospeques.finalFk(fk);
      fkmoVarFinal.add(fk);

      c++;
    }
    return a;
  }
  
  
}
