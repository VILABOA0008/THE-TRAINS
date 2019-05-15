package main;

import java.util.ArrayList;
import java.util.Scanner;

import textos.AgregadosGrandes;
import textos.Agregadospeques;

public class Agregado {

  public static void test() {

    String ag = "", ag2 = "";
    ArrayList<String> fkVarFinal = new ArrayList<>();
    ArrayList<String> fkFinal = new ArrayList<>();
    ArrayList<String> fieldsFinal = new ArrayList<>();
    ArrayList<String> fieldsVar = new ArrayList<>();
    ArrayList<String> fieldsType = new ArrayList<>();
    Scanner s = new Scanner(System.in);
    String tabla, agg, id;

    String tipo, var, fk, fkv, Field, MappedBy, mappedByV = "cas";

    int nf, c;

    System.out.println("nombre del agregado");

    // agg=metodos.Capital(s.nextLine());
    agg = "Customers";

    ag += AgregadosGrandes.clas(agg);

    System.out.println("nombre de la tabla");

    // tabla = s.nextLine();
    tabla = "CUSTOMERS";

    ag += Agregadospeques.finalTable(tabla);

    System.out.println("Cuantos fields sin relaciones");
    // nf = s.nextInt();
    // s.nextLine();
    nf = 3;
    c = 0;
    while (nf > c) {

      System.out.println("tipo");
      // tipo = s.nextLine();
      System.out.println("variable");
      String cct[] = { "String", "String", "int", "float" };
      tipo = cct[c];
      fieldsType.add(tipo);

      // var = s.nextLine();
      String ccv[] = { "name", "username", "age", "money" };
      var = ccv[c];
      Field = "FIELD_" + var.toUpperCase();
      fieldsFinal.add(Field);
      fieldsVar.add(var);
      ag += Agregadospeques.finalFields(Field, var);
      c++;
    }

    System.out.println("Cuantos FK");
    // nf = s.nextInt();
    // s.nextLine();
    nf = 2;
    c = 0;
    while (nf > c) {

      System.out.println("Nombre");
      // fk = s.nextLine();
      String ccv[] = { "cost", "direction" };
      fk = ccv[c];
      fkFinal.add("FK_" + fk.toUpperCase());
      ag += Agregadospeques.finalFk(fk);

      System.out.println("Valor");
      // fkv = s.nextLine();
      String ccvv[] = { "products", "shops" };
      fkv = ccvv[c];
      fkVarFinal.add(fk);

      c++;
    }

    System.out.println("mapped by de one to many  (vacio si no hay)");
    // MappedBy = s.nextLine();
    MappedBy = "declarationGroup";

    if (!MappedBy.isEmpty()) {
      ag += Agregadospeques.MappedBy(MappedBy);
      System.out.println("Escribe la variable");
      // mappedByV = s.nextLine();
      mappedByV = "declarationTypes";
    }

    ag += Agregadospeques.finalGenerator(agg);
    ag += AgregadosGrandes.tableGenerator(agg);

    System.out.println("\n\n\n\n");

    ag += VariablesBasicas(fieldsFinal, fieldsType, fieldsVar);
    ag += Agregadospeques.constructorEmpty(agg);
    ag += ManyToOne(fkFinal, fkVarFinal);

    if (!MappedBy.isEmpty()) {

      ag += AgregadosGrandes.oneToMany(mappedByV);

    }

    System.out.println(ag);

  }

  //////////////////////////////////////////////////////
  //////////////////////////////////////////////////////
  //////////////////////////////////////////////////////

  public static String VariablesBasicas(ArrayList<String> fieldsFinal, ArrayList<String> fieldsType,
      ArrayList<String> fieldsVar) {

    String a = "";

    for (int i = 0; i < fieldsFinal.size(); i++) {
      a += Agregadospeques.basicVar(fieldsFinal.get(i), fieldsType.get(i), fieldsVar.get(i));
    }
    return a;
  }

  public static String ManyToOne(ArrayList<String> fkFinal, ArrayList<String> fkVarFinal) {

    String a = "";

    for (int i = 0; i < fkFinal.size(); i++) {
      a += AgregadosGrandes.manyToOne(fkFinal.get(i), fkVarFinal.get(i));
    }
    return a;
  }

  public static String MappedBy(ArrayList<String> fkFinal, ArrayList<String> fkVarFinal) {

    System.out.println("");

    String a = "";

    for (int i = 0; i < fkFinal.size(); i++) {
      a += AgregadosGrandes.manyToOne(fkFinal.get(i), fkVarFinal.get(i));
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
