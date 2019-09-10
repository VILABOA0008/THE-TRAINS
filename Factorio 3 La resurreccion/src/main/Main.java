package main;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import bd.Bdd;
import bd.Leer;

public class Main {

  public static void main(String[] args) throws IOException, SQLException {
    // tipo 3 =MANY TO MANY CON PARAMETRO
//    Map<Integer, Integer> tipo = new HashMap<>();
//    Map<Integer, String[]> Mtm = new HashMap<>();
//    Map<Integer, ArrayList<Integer>> mto = new HashMap<>();
//    Map<Integer, ArrayList<Integer>> otm = new HashMap<>();
//    Map<Integer, Boolean> mtm = new HashMap<>();// SI LA TABLA ES MTM O NO
//    Map<Integer, ArrayList<String>> fks = new HashMap<>();// NOMBRE DE TODAS LAS FKS
//    Map<Integer, ArrayList<String>> vars = new HashMap<>();// nombre de las variables de los fields
//    Map<Integer, ArrayList<String>> tipos = new HashMap<>();// tipo de las variables de los fields
//    Map<Integer, ArrayList<String>> fields = new HashMap<>();// fields sin limpiar
//    Map<Integer, ArrayList<String>> foreign = new HashMap<>();// foreign regerences sin limpiar
//    ArrayList<String> arrayprimary = new ArrayList<>();// TODOS LOS IDS LOS QUE SON 2 SEPARADOS POR
//                                                       // UN ESPACIO
//    ArrayList<String> tablas = new ArrayList<>();// NOMBRE D ELAS TABLAS
//    Bdd.bdd(fields, foreign, arrayprimary, tablas, mtm, tipo);
//    ConverToPojo.pojo(vars, tipos, fields, foreign, arrayprimary, tablas, fks, mtm, otm, mto, Mtm);

    
    
    Map<Integer, String[]> MtmTest = new HashMap<>();
    Map<Integer, ArrayList<Integer>> mtoTest= new HashMap<>();
    Map<Integer, ArrayList<Integer>> otmTest = new HashMap<>();
 // nombre de las variables de los fields
    Map<Integer, ArrayList<String>> varsTest = new HashMap<>();
    // tipo de las variables de los fields
    Map<Integer, ArrayList<String>> tiposTest = new HashMap<>();
 // SI LA TABLA ES MTM O NO
    Map<Integer, Boolean> mtmTest = new HashMap<>();
 // NOMBRE DE TODAS LAS FKS
    Map<Integer, ArrayList<String>> fksTest = new HashMap<>();
    // NOMBRE DE TODAS LAS PRIMARY KEYS
    Map<Integer, ArrayList<String>> primaryKeys = new HashMap<>();
 // NOMBRE D ELAS TABLAS
    ArrayList<String> tablasTest = new ArrayList<>();
 // Tipos de tabla mtm base entity...
    Map<Integer, Integer> tableType = new HashMap<>();
    Leer leer = new Leer(tablasTest, fksTest, mtmTest, varsTest, tiposTest,otmTest,mtoTest,MtmTest,tableType,primaryKeys);
    leer.start();
    AgregadoPLUSPLUS.test(varsTest, tiposTest, tablasTest, fksTest, mtmTest, mtoTest, otmTest, MtmTest, tableType,primaryKeys);

    System.err.println("ACABOSE");
    
    
    
    
    
    // TABLAS
    // [Line, TOT_Page, TOT_Button, TOT_DocType, TOT_Document, TOT_ButtonDoc, TOT_Style,
    // TOT_ButtonStyle, TOT_Configuration]

    // VARS
    // {1=[idLine, name, active], 2=[idPage, name, order, active], 3=[idButton, name, shortName, x,
    // y, w, h, active, order],
    // 4=[idDocType, name], 5=[idDoc, name, link], 6=[], 7=[idStyle, name, styleClass], 8=[idButton,
    // idStyle], 9=[idConfig, value]}

    // TIPOS
    // {1=[Integer, String, boolean], 2=[Integer, String, Integer, boolean], 3=[Integer, String,
    // String, Integer, Integer, Integer, Integer, boolean, Integer],
    // 4=[Integer, String], 5=[Integer, String, String], 6=[], 7=[Integer, String, String],
    // 8=[Integer, Integer], 9=[Integer, String]}

    // FKS
    // {2=[FK_Line], 3=[FK_Page], 5=[FK_DocType]}

    // TIPO
    // {1=0, 2=0, 3=0, 4=0, 5=0, 6=0, 7=0, 8=0, 9=0}

    // OTM
    // {1=[2], 2=[1, 3], 4=[5]}

    // MTO
    // {2=[1, 3], 3=[2], 5=[4]}

    // MTM
    // {1=false, 2=false, 3=false, 4=false, 5=false, 6=true, 7=false, 8=true, 9=false}
  }
}
