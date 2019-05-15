package main;

import java.util.ArrayList;
import java.util.Scanner;

import textos.AgregadosGrandes;
import textos.Agregadospeques;

public class finales {

  public static void f() {

    String ag = "";
    ArrayList<String> finals;
    ArrayList<String> finalsV;
    Scanner s = new Scanner(System.in);
    String tabla, agg, id;

    String tipo, var, fk;

    int nf, c;

    System.out.println("nombre del agregado");

    // agg=metodos.Capital(s.nextLine());
    agg = "Customers";
    
    ag+=AgregadosGrandes.clas(agg);

    System.out.println("nombre de la tabla");

    // tabla = s.nextLine();
    tabla = "Products";

    ag += Agregadospeques.ftable(tabla);

    System.out.println("Cuantos fields sin relaciones");
    // nf = s.nextInt();
    // s.nextLine();
    nf = 3;
    c = 0;
    while (nf > c) {

      System.out.println("tipo");
      // tipo = s.nextLine();
      System.out.println("variable");

      // var = s.nextLine();
      String ccv[] = { "name", "username", "age", "money" };
      var = ccv[c];

      ag += Agregadospeques.ffield(var);
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
      String ccv[] = { "products", "shops" };
      fk = ccv[c];

      ag += Agregadospeques.ffk(fk);
      c++;
    }
    ag += Agregadospeques.fgenertator(agg);

    System.out.println("\n\n\n\n");
    System.out.println(ag);
    

  }

}
