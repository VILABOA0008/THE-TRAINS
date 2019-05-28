package main;

import java.util.ArrayList;
import java.util.Scanner;

import cosas.Escribir;
import textos.AgregadosGrandes;
import textos.Agregadospeques;

public class Agregado {

  public static void test() {

    Scanner s = new Scanner(System.in);
    String ag = "", ag2 = "";
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

    ag += Agregadospeques.paqueteB();

    ag += Agregadospeques.imports();

    ag += AgregadosGrandes.clas(agg);

    tabla = NombreTabla();

    ag += Agregadospeques.finalTable(tabla);

    ag += Agregadospeques.ID();

    ag += Agregadospeques.finalId(agg);

    ag += Fields(fieldsType, fieldsFinal, fieldsVar);

    ag += ManysToOnes(fkmoFinal, fkmoVarFinal);

    ag += OnesToManys(mapedBy, mapedByV, mapedByFinal);

    ag += Agregadospeques.finalGenerator(agg);
    ag += AgregadosGrandes.tableGenerator(agg);

    System.out.println("\n\n \n\n\n");

    ag += VariablesBasicas(fieldsFinal, fieldsType, fieldsVar);
    ag += Agregadospeques.constructorEmpty(agg);
    ag += ManyToOne(fkmoFinal, fkmoVarFinal);

    if (!mapedByV.isEmpty()) {
      ag += AgregadosGrandes.oneToMany(mapedByFinal, mapedByV);
    }
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

    Escribir.escribir(
        "C:\\Users\\pabcos\\Documents\\trains\\prubas\\proyecto seedstack base\\src\\main\\java\\ctag\\domain\\model\\aggregate\\ModelosPruebas\\Customers.java",
        ag);
    Escribir.escribir(
        "C:\\Users\\pabcos\\Documents\\trains\\prubas\\proyecto seedstack base\\src\\main\\java\\ctag\\domain\\model\\aggregate\\ModelosPruebas\\CustomersId.java",
        AgregadoId.id(agg));
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

    System.out.println("nombre de la tabla");
    // tabla = s.nextLine();
    tabla = "CUSTOMERS";
    return tabla;
  }

  public static String NombreAggregado() {
    String agg = "";
    System.out.println("nombre del agregado");
    // agg=metodos.Capital(s.nextLine());
    agg = "Customers";
    return agg;
  }

  public static String Fields(
      ArrayList<String> fieldsType, ArrayList<String> fieldsFinal, ArrayList<String> fieldsVar) {
    String a = "";

    System.out.println("Cuantos fields sin relaciones");
    // nf = s.nextInt();
    // s.nextLine();
    int nf = 3;
    int c = 0;
    while (nf > c) {

      System.out.println("tipo");
      // tipo = s.nextLine();
      String cct[] = {"String", "String", "Integer", "float"};
      String tipo = cct[c];
      fieldsType.add(tipo);

      System.out.println("variable");
      // var = s.nextLine();
      String ccv[] = {"name", "username", "age", "money"};
      String var = ccv[c];

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
    String a = "";
    System.out.println("Numero de ones to manies");
    // nf = s.nextInt();
    // s.nextLine();
    int nf = 1;
    int c = 0;
    while (nf > c) {

      System.out.println("mapped by");
      // MappedBy = s.nextLine();
      String MappedBy = "storage";
      mapedBy.add(MappedBy);

      if (!MappedBy.isEmpty()) {
        String MappedByFinal = "MAPPED_BY_" + MappedBy.toUpperCase();
        mapedByFinal.add(MappedByFinal);

        a += Agregadospeques.MappedBy(MappedByFinal, MappedBy);
        System.out.println("Escribe la variable");
        // mappedByV = s.nextLine();
        String mappedByV = "position";
        mapedByV.add(mappedByV);
      }

      c++;
    }
    return a;
  }

  public static String ManysToOnes(ArrayList<String> fkmoFinal, ArrayList<String> fkmoVarFinal) {

    String a = "";
    System.out.println("Numero de manys to one");
    // nf = s.nextInt();
    // s.nextLine();
    int nf = 2;
    int c = 0;
    while (nf > c) {

      System.out.println("Nombre");
      // fk = s.nextLine();
      String ccv[] = {"style", "page"};
      String fk = ccv[c];
      fkmoFinal.add("FK_" + fk.toUpperCase());
      a += Agregadospeques.finalFk(fk);

      System.out.println("Valor");
      // fkv = s.nextLine();
      String ccvv[] = {"products", "shops"};
      String fkv = ccvv[c];
      fkmoVarFinal.add(fk);

      c++;
    }
    return a;
  }

  //
  // public static String oneToManyField() {
  // Scanner s=new Scanner(System.in);
  // System.out.println("mapped by de one to many (vacio si no hay)");
  // String map=s.nextLine();
  //
  // if(map.isEmpty()) {
  // return null;
  //
  // }else {
  //
  // System.out.println("Escribe la variable");
  // String mappedBy=s.nextLine();
  //
  // }
  // return null;
  // }
  //////////////////////////////////////////////////////
  //////////////////////////////////////////////////////
  //////////////////////////////////////////////////////
  //////////////////////////////////////////////////////
  //////////////////////////////////////////////////////
  //////////////////////////////////////////////////////
  //////////////////////////////////////////////////////
  //////////////////////////////////////////////////////
  //////////////////////////////////////////////////////
  //////////////////////////////////////////////////////
  //////////////////////////////////////////////////////
  //////////////////////////////////////////////////////
  //////////////////////////////////////////////////////
  //////////////////////////////////////////////////////

}
