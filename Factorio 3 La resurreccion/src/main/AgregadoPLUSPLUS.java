package main;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import cosas.Escribir;
import textos.AgregadosGrandes;
import textos.Agregadospeques;

public class AgregadoPLUSPLUS {

  public static void test(
      Map<Integer, ArrayList<String>> vars,
      Map<Integer, ArrayList<String>> tipos,
      ArrayList<String> tablas,
      Map<Integer, ArrayList<String>> fks,
      Map<Integer, Boolean> mtm,
      Map<Integer, ArrayList<Integer>> otm,
      Map<Integer, ArrayList<Integer>> mto,
      Map<Integer, String[]> Mtm,
      Map<Integer, Integer> tipo,
      Map<Integer, ArrayList<String>> primaryKeys)
      throws IOException {
    Scanner s = new Scanner(System.in);

    ArrayList<String> aggs = new ArrayList<>();

    String ag = "", importagg = "";
    // MANY TO MANY
    Map<Integer, ArrayList<String[]>> MTM = new HashMap<>();
    Map<Integer, ArrayList<Integer>> MTMapped = new HashMap<>();
    // ArrayList<String> fieldsVar = new ArrayList<>();
    // ArrayList<String> fieldsType = new ArrayList<>();
    // NOMBRE DE LA TABLA Y EL AGREGADO D
    String agg;
    String tabla;
    String importUrl="import ctag.";
    Integer tableType;
    int c;

    AgregadoMetodosPLUS_PLUS_PLUS.NombreAggregado(aggs, tablas, mtm, Mtm, MTM, MTMapped,
        tipo);
    aggs = tablas;

    for (int i = 0; i < mtm.size(); i++) {
      if (!mtm.get(i)) {

        ArrayList<String> mtmVar = new ArrayList<>();
        // MANY TO MANY
        ArrayList<String> mtmappedVar = new ArrayList<>();
        // MANY TO ONE
        ArrayList<String> fkmoVarFinal = new ArrayList<>();
        // ONE TO MANY
        ArrayList<String> mapedBy = new ArrayList<>();
        ArrayList<String> mapedByV = new ArrayList<>();
        ArrayList<String> mapedByFinal = new ArrayList<>();
        // FIELDS
        ArrayList<String> fieldsFinal = new ArrayList<>();
        String finalId;
        ag = "";
        c = i;
        tableType=tipo.get(c);
        tabla = tablas.get(c);
        agg = metodos.Capital(tablas.get(c));
        importagg = Agregadospeques.importAgg(agg,importUrl);
        ag += Agregadospeques.paqueteAgg(agg);
        
        ag += Agregadospeques.imports();
        ag += Agregadospeques.importsMto(mto.get(c),otm.get(c),tablas,importUrl);
        ag += AgregadosGrandes.clas(agg);

        ag += Agregadospeques.finalTable(tabla);

        ag += Agregadospeques.ID();
        ag += Agregadospeques.tableStatic();// TODO SE PUEDE ELIMINAR
        finalId="algo";
        if(tableType==0) {
        finalId=metodos.mayusq(primaryKeys.get(c).get(0)).toUpperCase();
        ag += Agregadospeques.finalId(finalId,primaryKeys.get(c).get(0));}

        if(tabla.equalsIgnoreCase("PartVersionFile")) {
          System.err.println();}
        
        // Crear variable con los fields de la tabla actual
        ArrayList<String> varss = vars.get(c);
        ArrayList<String> tiposs = tipos.get(c);
        vars.put(c, varss);
        tipos.put(c, tiposs);
        ag += AgregadoMetodosPLUS_PLUS_PLUS.Fields(tipos.get(c), fieldsFinal, vars.get(c));
        if (fks.get(c) != null) {
          ag += AgregadoMetodosPLUS_PLUS_PLUS.ManysToOnes(aggs, fks.get(c), fkmoVarFinal,
              mto.get(c));
        }
        if (otm.get(c) != null) {
          ag += AgregadoMetodosPLUS_PLUS_PLUS.OnesToManys(
              agg, otm.get(c), aggs, mapedBy, mapedByV, mapedByFinal);
        }

        if (MTM.get(c) != null) {
          ag += AgregadoMetodosPLUS_PLUS_PLUS.ManyToMany(agg, mtmVar, MTM.get(c));

        }

        if (MTMapped.get(c) != null) {
          ag += AgregadoMetodosPLUS_PLUS_PLUS.ManyToManyMapped(agg, mtmappedVar, MTMapped.get(c),
              aggs);

        }
        if (tipo.get(c) != 3) {
          ag += Agregadospeques.finalGenerator(agg);
          ag += AgregadosGrandes.tableGenerator(finalId);
        }
        String url="C:\\Users\\pabcos\\Documents\\trains\\prubas\\proyecto seedstack base\\src\\main\\java\\ctag";
        new File(url).mkdir();
        url +="\\";
        ag += AgregadoMetodosPLUS_PLUS_PLUS.VariablesBasicas(fieldsFinal, tipos.get(c),
            vars.get(c));
        ag += Agregadospeques.constructorEmpty(agg);
        if (fks.get(c) != null) {
          ag += AgregadoMetodosPLUS_PLUS_PLUS.ManyToOne(fks.get(c), fkmoVarFinal, tipo.get(c));
        }

        if (!mapedByV.isEmpty()) {
          ag += AgregadosGrandes.oneToMany(mapedByFinal, mapedByV);
        }

        ag += AgregadosGrandes.ManysToManys(finalId,agg, mtmVar);

        ag += Agregadospeques.manyToManyMappedBy(agg, mtmappedVar);

        ag += "\n\n\n";

        if (tipo.get(c) != 3) {
          ag += Agregadospeques.getId(agg);
        } else {
          String withoutFK;
          for (int q = 0; q < primaryKeys.get(c).size(); q++) {
            if (primaryKeys.get(c).get(q).contains("FK")) {
              withoutFK = primaryKeys.get(c).get(q).replace("FK_", "");
            } else {
              withoutFK = primaryKeys.get(c).get(q);
            }
            if (withoutFK.contains("id")||withoutFK.contains("Id")) {
              withoutFK = withoutFK.replace("id", "");
              withoutFK = withoutFK.replace("Id", "");}
            primaryKeys.get(c).set(q, withoutFK);
          }
          
          ag += Agregadospeques.getIdBaseEntity(agg, primaryKeys.get(c));
        }

        ag += Agregadospeques.getBasics(tipos.get(c), vars.get(c));
        ag += Agregadospeques.setBasics(tipos.get(c), vars.get(c));
        ag += AgregadosGrandes.setAddSets(mapedByV);
        ag += AgregadosGrandes.getSetEntities(fks.get(c), fkmoVarFinal, tipo.get(c));

        ag += Agregadospeques.acabalo();

        agg = metodos.Capital(agg);
        
        mkdirs(url);
        new File(url + "domain\\model\\" + agg.toLowerCase()).mkdir();
        Escribir.escribir(
            url + "domain\\model\\" + agg + "\\"
                + agg
                + ".java",
            ag);
        if (tipo.get(c) != 3) {
          Escribir.escribir(
              url + "domain\\model\\" + agg + "\\"
                  + agg
                  + "Id.java",
              AgregadoId.id(agg));
        } else {

          
          Escribir.escribir(
              url + "domain\\model\\" + agg + "\\"
                  + agg
                  + "Id.java",
              AgregadoId.BaseEntityId(agg, mto.get(c),tablas,primaryKeys.get(c)));

        }

        if (tipo.get(c) != 3) {
          // DTOS

          new File(url + "dtos\\dto\\" + agg.toLowerCase()).mkdir();
          Escribir.escribir(
              url + "dtos\\dto\\" + agg + "\\"
                  + agg
                  + "CreateDto.java",
              Dto.createDto(agg, tipos.get(c), vars.get(c), fks.get(c),importagg));
          Escribir.escribir(
              url + "dtos\\dto\\" + agg + "\\"
                  + agg
                  + "Dto.java",
              Dto.Dto(agg));
          // ASSEMBLERS
          new File(url + "dtos\\assembler\\" + agg.toLowerCase()).mkdir();
          Escribir.escribir(
              url + "dtos\\assembler\\" + agg + "\\"
                  + agg
                  + "CreateAssembler.java",
              Assembler.createAssembler(agg, tipos.get(c), vars.get(c), fks.get(c), fkmoVarFinal,importagg));
          Escribir.escribir(
              url + "dtos\\assembler\\" + agg + "\\"
                  + agg
                  + "Assembler.java",
              Assembler.Assembler(agg,importagg));
          
          
          //OLDDDDDDDDDD
          //OLDDDDDDDDDD
          //OLDDDDDDDDDD
          boolean old=false;
          if(old) {
          new File(url + "rest").mkdir(); 
          new File(url + "rest\\"+agg.toLowerCase()).mkdir();
          Escribir.escribir(
              url + "rest\\" + agg + "\\"
                  + agg
                  + "Finder.java",
              Old.finder(agg));
//          new File(url + "rest\\"+agg.toLowerCase()).mkdir();
          Escribir.escribir(
              url + "rest\\" + agg + "\\"
                  + agg
                  + "Resource.java",
                  Old.Resource(agg));
          
          
          
          new File(url + "application\\infrastructure").mkdir();
          new File(url + "application\\infrastructure\\"+agg.toLowerCase()).mkdir();
          Escribir.escribir(
              url + "application\\infrastructure\\" + agg + "\\"
                  + agg
                  + "JpaFinder.java",
              Old.jpaFinder(agg));
          
          //OLDDDDDDDDDD
          //OLDDDDDDDDDD
          //OLDDDDDDDDDD
          }
        }
        // FACTORY
        // System.out
        new File(url + "application\\factoryimpl\\" + agg.toLowerCase()).mkdir();
        Escribir.escribir(
            url + "domain\\model\\" + agg + "\\"
                + agg
                + "Factory.java",
            Factory.factory(agg, tipos.get(c), vars.get(c), fks.get(c)));
        Escribir.escribir(
            url + "application\\factoryimpl\\" + agg + "\\"
                + agg
                + "FactoryImpl.java",
            Factory.factoryImpl(agg, tipos.get(c), vars.get(c), fks.get(c),fkmoVarFinal, importagg));
        
        //COSILLAS
        //COSILLAS

        if(tabla.equalsIgnoreCase("coilslaunch")) {
        Cosillas cosilla=new Cosillas(agg);
        
         
        //RESOURCE 
        System.err.println("\n\n\nRESOURCE");
        cosilla.constructor(); 
        String params="Integer idAccount,Integer idProcessVigilanceVersion,Integer idPsaShift";
        if(!params.isEmpty()) {
        cosilla.getAllWithFiltersResource(params);}
        else {
        cosilla.getAll();}
        cosilla.create();
        cosilla.update();
        
        s.nextLine();
        
        
        //FINDER
        System.err.println("\n\n\nFINDER");
        cosilla.Finder(params);
        s.nextLine();
        
        //JPAFINDER
        System.err.println("\n\n\nJPAFINDER");
        if(!params.isEmpty()) {
        cosilla.getAllFinderWithParams(params);}
        else{
        cosilla.getAllFinder();}
        
        
        }
        //COSILLAS
        //COSILLAS
        
      }

    }

    //////////////////////////////////////////////////////
    //////////////////////////////////////////////////////
    //////////////////////////////////////////////////////
  }

  public static void mkdirs(String url) {
    new File(url + "application").mkdir();
    new File(url + "application\\factoryimpl").mkdir();
    new File(url + "domain").mkdir();
    new File(url + "domain\\model").mkdir();
    new File(url + "dtos").mkdir();
    new File(url + "dtos\\dto").mkdir();
    new File(url + "dtos\\assembler").mkdir();
  }
}
