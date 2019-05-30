package main;

import java.util.ArrayList;
import java.util.Scanner;

import cosas.Escribir;
import textos.AgregadosGrandes;
import textos.Agregadospeques;

public class Agregado {
  public static final boolean automatico = false;

  public static void test() {

    String ag = "", ag2 = "";
    // MANY TO MANY
    ArrayList<String> mtmVar = new ArrayList<>();
    // MANY TO MANY
    ArrayList<String> mtmappedVar = new ArrayList<>();
    // MANY TO ONE
    ArrayList<String> fkmoVarFinal = new ArrayList<>();
    ArrayList<String> fkmoFinal = new ArrayList<>();
    // ONE TO MANY
    ArrayList<String> mapedBy = new ArrayList<>();
    ArrayList<String> mapedByV = new ArrayList<>();
    ArrayList<String> mapedByFinal = new ArrayList<>();
    // FIELDS
    ArrayList<String> fieldsFinal = new ArrayList<>();
    ArrayList<String> fieldsVar = new ArrayList<>();
    ArrayList<String> fieldsType = new ArrayList<>();
    // NOMBRE DE LA TABLA DE L AGREGADO Y DEL ID
    String tabla, agg;

    // DISTINTAS VARIABLES
    String MappedBy, mappedByV;

    agg = NombreAggregado();

    ag += Agregadospeques.paqueteAgg();

    ag += Agregadospeques.imports();

    ag += AgregadosGrandes.clas(agg);

    tabla = NombreTabla();

    ag += Agregadospeques.finalTable(tabla);

    ag += Agregadospeques.ID();

    ag += Agregadospeques.finalId(agg);

    ag += Fields(fieldsType, fieldsFinal, fieldsVar);

    ag += ManysToOnes(fkmoFinal, fkmoVarFinal);
    ag += OnesToManys(mapedBy, mapedByV, mapedByFinal);
    ag += ManyToMany(agg, mtmVar);
    ag += ManyToManyMapped(agg, mtmappedVar);

    ag += Agregadospeques.finalGenerator(agg);
    ag += AgregadosGrandes.tableGenerator(agg);

    System.out.println("\n\n \n\n\n");

    ag += VariablesBasicas(fieldsFinal, fieldsType, fieldsVar);
    ag += Agregadospeques.constructorEmpty(agg);
    ag += ManyToOne(fkmoFinal, fkmoVarFinal);

    if (!mapedByV.isEmpty()) {
      ag += AgregadosGrandes.oneToMany(mapedByFinal, mapedByV);
    }
    ag += AgregadosGrandes.ManysToManys(agg, mtmVar);
    ag += Agregadospeques.manyToManyMappedBy(agg, mtmappedVar);

    ag += "\n\n\n";

    ag += Agregadospeques.getId(agg);
    ag += Agregadospeques.getBasics(fieldsType, fieldsVar);
    ag += Agregadospeques.setBasics(fieldsType, fieldsVar);
    ag += AgregadosGrandes.setAddSets(mapedByV);
    ag += AgregadosGrandes.getSetEntities(fkmoVarFinal);

    ag += Agregadospeques.acabalo();

    System.out.println(ag);
    System.out.println("\n\n\n ID \n\n\n");
    System.out.println("\n\n\n" + AgregadoId.id(agg));
    System.out.println("\n\n\n FACTORY \n\n\n");
    System.out.println("\n\n\n" + Factory.factory(agg, fieldsType, fieldsVar, fkmoVarFinal));
    System.out.println("\n\n\n FACTORY_IMPL \n\n\n");
    System.out.println("\n\n\n" + Factory.factoryImpl(agg, fieldsType, fieldsVar, fkmoVarFinal));
    System.out.println("\n\n\n CREATE  DTO \n\n\n");
    System.out.println("\n\n\n" + Dto.createDto(agg, fieldsType, fieldsVar, fkmoVarFinal));
    System.out.println("\n\n\n DTO \n\n\n");
    System.out.println("\n\n\n" + Dto.Dto(agg));
    System.out.println("\n\n\n CREATE ASSEMBLER \n\n\n");
    System.out.println(
        "\n\n\n" + Assembler.createAssembler(agg, fieldsType, fieldsVar, fkmoVarFinal));
    System.out.println("\n\n\n  ASSEMBLER \n\n\n");
    System.out.println("\n\n\n" + Assembler.Assembler(agg, fieldsType, fieldsVar, fkmoVarFinal));

    // ENTITY , ID
    Escribir.escribir(
        "C:\\Users\\pabcos\\Documents\\trains\\prubas\\proyecto seedstack base\\src\\main\\java\\ctag\\domain\\model\\customer\\"+ metodos.Capital(agg)+".java",
        ag);
    Escribir.escribir(
        "C:\\Users\\pabcos\\Documents\\trains\\prubas\\proyecto seedstack base\\src\\main\\java\\ctag\\domain\\model\\customer\\"+ metodos.Capital(agg)+"Id.java",
        AgregadoId.id(agg));
    // DTOS
    Escribir.escribir(
        "C:\\Users\\pabcos\\Documents\\trains\\prubas\\proyecto seedstack base\\src\\main\\java\\ctag\\dtos\\dto\\customer\\"
            + metodos.Capital(agg)
            + "CreateDto.java",
        Dto.createDto(agg, fieldsType, fieldsVar, fkmoVarFinal));
    Escribir.escribir(
        "C:\\Users\\pabcos\\Documents\\trains\\prubas\\proyecto seedstack base\\src\\main\\java\\ctag\\dtos\\dto\\customer\\"
            + metodos.Capital(agg)
            + "Dto.java",
        Dto.Dto(agg));
    // ASSEMBLERS
    Escribir.escribir(
        "C:\\Users\\pabcos\\Documents\\trains\\prubas\\proyecto seedstack base\\src\\main\\java\\ctag\\dtos\\assembler\\customer\\"
            + metodos.Capital(agg)
            + "CreateAssembler.java",
        Assembler.createAssembler(agg, fieldsType, fieldsVar, fkmoVarFinal));
    Escribir.escribir(
        "C:\\Users\\pabcos\\Documents\\trains\\prubas\\proyecto seedstack base\\src\\main\\java\\ctag\\dtos\\assembler\\customer\\"
            + metodos.Capital(agg)
            + "Assembler.java",
        Assembler.Assembler(agg, fieldsType, fieldsVar, fkmoVarFinal));
    // FACTORUE
    Escribir.escribir(
        "C:\\Users\\pabcos\\Documents\\trains\\prubas\\proyecto seedstack base\\src\\main\\java\\ctag\\domain\\model\\aggregate\\ModelosPruebas\\"
            + metodos.Capital(agg)
            + "Factory.java",
        Factory.factory(agg, fieldsType, fieldsVar, fkmoVarFinal));
    Escribir.escribir(
        "C:\\Users\\pabcos\\Documents\\trains\\prubas\\proyecto seedstack base\\src\\main\\java\\ctag\\domain\\model\\customer\\"
            + metodos.Capital(agg)
            + "Factory.java",
        Factory.factory(agg, fieldsType, fieldsVar, fkmoVarFinal));
    Escribir.escribir(
        "C:\\Users\\pabcos\\Documents\\trains\\prubas\\proyecto seedstack base\\src\\main\\java\\ctag\\application\\factoryimpl\\customer\\"
            + metodos.Capital(agg)
            + "FactoryImpl.java",
        Factory.factoryImpl(agg, fieldsType, fieldsVar, fkmoVarFinal));
    // Escribir.escribir("C:\\Users\\pabcos\\Desktop\\cosas.txt",ag);

  }

  //////////////////////////////////////////////////////
  //////////////////////////////////////////////////////
  //////////////////////////////////////////////////////

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
        clase = "page";
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
