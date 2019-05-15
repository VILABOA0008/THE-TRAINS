package main;

import java.util.ArrayList;
import java.util.Scanner;

import textos.AgregadosGrandes;
import textos.Agregadospeques;

public class finales {

  public static void test() {

    String ag = "", ag2 = "";
    ArrayList<String> fkVarFinal = new ArrayList<>();
    ArrayList<String> fkFinal = new ArrayList<>();
    ArrayList<String> fieldsFinal = new ArrayList<>();
    ArrayList<String> fieldsVar = new ArrayList<>();
    ArrayList<String> fieldsType = new ArrayList<>();
    Scanner s = new Scanner(System.in);
    String tabla, agg, id;

    String tipo, var, fk,fkv, Field;

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
      fk = ccvv[c];
      fkFinal.add("FK_" + fk.toUpperCase());
      ag += Agregadospeques.finalFk(fk);
      
      
      c++;
    }
    ag += Agregadospeques.finalGenerator(agg);
    ag += AgregadosGrandes.tableGenerator(agg);

    System.out.println("\n\n\n\n");

    for (int i = 0; i < fieldsFinal.size(); i++) {
      ag += Agregadospeques.basicVar(fieldsFinal.get(i), fieldsType.get(i), fieldsVar.get(i));

    }

    ag += Agregadospeques.constructorEmpty(agg);

    for (int i = 0; i < fkFinal.size(); i++) {
      ag += fkFinal.get(i)+"   "+2+"\n";
    }
    System.out.println(ag);

  }
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
  public static void f() {

    String ag = "", ag2 = "";
    ArrayList<String> FieldsFinal = new ArrayList<>();
    ArrayList<String> FieldsVar = new ArrayList<>();
    ArrayList<String> FieldsType = new ArrayList<>();
    Scanner s = new Scanner(System.in);
    String tabla, agg, id;

    String tipo, var, fk, Field;

    int nf, c;

    System.out.println("nombre del agregado");

    agg = metodos.Capital(s.nextLine());

    ag += AgregadosGrandes.clas(agg);

    System.out.println("nombre de la tabla");

    tabla = s.nextLine();

    ag += Agregadospeques.finalTable(tabla);

    System.out.println("Cuantos fields sin relaciones");
    nf = s.nextInt();
    s.nextLine();
    c = 0;
    while (nf > c) {

      System.out.println("tipo");
      tipo = s.nextLine();
      FieldsType.add(tipo);
      System.out.println("variable");

      var = s.nextLine();
      Field = "FIELD_" + var.toUpperCase();
      FieldsFinal.add(Field);
      FieldsVar.add(var);
      ag += Agregadospeques.finalFields(Field, var);
      c++;
    }

    System.out.println("Cuantos FK");
    nf = s.nextInt();
    s.nextLine();
    c = 0;
    while (nf > c) {

      System.out.println("Nombre");
      fk = s.nextLine();

      ag += Agregadospeques.finalFk(fk);
      c++;
    }
    ag += Agregadospeques.finalGenerator(agg);
    ag += AgregadosGrandes.tableGenerator(agg);

    System.out.println("\n\n\n\n");

    for (int i = 0; i < FieldsFinal.size(); i++) {
      ag += Agregadospeques.basicVar(FieldsFinal.get(i), FieldsType.get(i), FieldsVar.get(i));

    }

    ag += Agregadospeques.constructorEmpty(agg);

    System.out.println(ag);

  }

}
