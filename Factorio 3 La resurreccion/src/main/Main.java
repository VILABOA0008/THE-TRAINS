package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import bd.Bdd;

public class Main {

  public static void main(String[] args) throws IOException {

    Map<Integer, ArrayList<Integer>> otm = new HashMap<>();
    Map<Integer, Boolean> mtm = new HashMap<>();
    Map<Integer, ArrayList<String>> fks = new HashMap<>();
    Map<Integer, ArrayList<String>> vars = new HashMap<>();
    Map<Integer, ArrayList<String>> tipos = new HashMap<>();
  Map<Integer, ArrayList<String>> fields = new HashMap<>();
  Map<Integer, ArrayList<String>> foreign = new HashMap<>();
  ArrayList<String>arrayprimary=new ArrayList<>();
  ArrayList<String>tablas=new ArrayList<>();
    Bdd.bdd(fields,foreign,arrayprimary,tablas,mtm);
    ConverToPojo.pojo(vars,tipos,fields, foreign, arrayprimary,tablas,fks,mtm,otm);
    AgregadoPLUSPLUS.test(vars,tipos,fields, foreign, arrayprimary,tablas,fks,mtm,otm);
    //Agregado.test();
//    automata.a();

  }
}
