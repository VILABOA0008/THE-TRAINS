package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import bd.Bdd;

public class Main {

  public static void main(String[] args) throws IOException {
    //Agregado a=new Agregado();
  //  a.test();

    Map<Integer, ArrayList<String>> fks = new HashMap<Integer, ArrayList<String>>();
    Map<Integer, ArrayList<String>> vars = new HashMap<Integer, ArrayList<String>>();
    Map<Integer, ArrayList<String>> tipos = new HashMap<Integer, ArrayList<String>>();
  Map<Integer, ArrayList<String>> fields = new HashMap<Integer, ArrayList<String>>();
  Map<Integer, ArrayList<String>> foreign = new HashMap<Integer, ArrayList<String>>();
  ArrayList<String>arrayprimary=new ArrayList<>();
  ArrayList<String>tablas=new ArrayList<>();
    Bdd.bdd(fields,foreign,arrayprimary,tablas);
    ConverToPojo.pojo(vars,tipos,fields, foreign, arrayprimary,tablas,fks);
//    Agregado.test(fields,foreign,arrayfields,arrayprimary,arrayforeign,tablas);
//    automata.a();

  }
}
