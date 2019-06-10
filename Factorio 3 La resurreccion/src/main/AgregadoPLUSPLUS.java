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
      Map<Integer, ArrayList<String>> fields,
      Map<Integer, ArrayList<String>> foreign,
      ArrayList<String> arrayprimary,
      ArrayList<String> tablas,
      Map<Integer, ArrayList<String>> fks,
      Map<Integer, Boolean> mtm,
      Map<Integer, ArrayList<Integer>> otm,
      Map<Integer, ArrayList<Integer>> mto,
      Map<Integer, String[]> Mtm,
      Map<Integer,Integer>tipo)
      throws IOException {
Scanner s=new Scanner(System.in)  ;

    ArrayList<String> aggs = new ArrayList<>();
   
    String ag = "", importagg = "";
    Map<Integer, Boolean> readOnly=new HashMap<>();
    // MANY TO MANY
    Map<Integer, ArrayList<String[]>> MTM=new HashMap<>();
    Map<Integer, ArrayList<Integer>> MTMapped=new HashMap<>();
    // ArrayList<String> fieldsVar = new ArrayList<>();
    // ArrayList<String> fieldsType = new ArrayList<>();
    // NOMBRE DE LA TABLA Y EL AGREGADO D    
    String agg;
    String tabla;
    int c ;
    
    AgregadoMetodosPLUS_PLUS_PLUS.NombreAggregado(aggs, tablas, mtm,Mtm,MTM,MTMapped,readOnly,tipo);

    
    for(int i=1;i<mtm.size();i++) {
      if(mtm.get(i)==false) {
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
        ag="";
   c=i;
    tabla = tablas.get(c - 1);

    agg = aggs.get(c - 1);
    importagg=Agregadospeques.importAgg(agg);
    ag += Agregadospeques.paqueteAgg(agg);

    ag += Agregadospeques.imports();

    ag += AgregadosGrandes.clas(agg);

    ag += Agregadospeques.finalTable(tabla);

    ag += Agregadospeques.ID();
      if(tipo.get(c)!=3) {
    ag+=Agregadospeques.tableStatic();}

    ag += Agregadospeques.finalId(agg);

    ag += AgregadoMetodosPLUS_PLUS_PLUS.Fields(tipos.get(c), fieldsFinal, vars.get(c));
    if (fks.get(c) != null) {
      ag += AgregadoMetodosPLUS_PLUS_PLUS.ManysToOnes(aggs, fks.get(c), fkmoVarFinal, mto.get(c));
    }
    if (otm.get(c) != null) {
    ag +=   AgregadoMetodosPLUS_PLUS_PLUS.OnesToManys(
            agg, otm.get(c), aggs, mapedBy, mapedByV, mapedByFinal);}
    
    

    if(MTM.get(c)!=null) {
        ag += AgregadoMetodosPLUS_PLUS_PLUS.ManyToMany(agg, mtmVar,MTM.get(c));
  
    }

        
        if(MTMapped.get(c)!=null) {
        ag += AgregadoMetodosPLUS_PLUS_PLUS.ManyToManyMapped(agg, mtmappedVar,MTMapped.get(c),aggs);
      
    }


    if(tipo.get(c)!=3) {
    ag += Agregadospeques.finalGenerator(agg);
    ag += AgregadosGrandes.tableGenerator(agg);
    }
    System.out.println("\n\n \n\n\n");
    String url="C:\\Users\\pabcos\\Documents\\trains\\prubas\\proyecto seedstack base\\src\\main\\java\\ctag\\";
    ag += AgregadoMetodosPLUS_PLUS_PLUS.VariablesBasicas(fieldsFinal, tipos.get(c), vars.get(c));
    ag += Agregadospeques.constructorEmpty(agg);
    if (fks.get(c) != null) {
      if(tipo.get(c)!=3) {
      ag += AgregadoMetodosPLUS_PLUS_PLUS.ManyToOne(fks.get(c), fkmoVarFinal,tipo.get(c));}else {
        System.out.println( ); 
        ag+=AgregadoMetodosPLUS_PLUS_PLUS.ManyToOneEspecial(agg, fks.get(c), fkmoVarFinal, url);
    
    }

    if (!mapedByV.isEmpty()) {
      ag += AgregadosGrandes.oneToMany(mapedByFinal, mapedByV);
    }
        
        ag += AgregadosGrandes.ManysToManys(agg, mtmVar);
       
       ag += Agregadospeques.manyToManyMappedBy(agg, mtmappedVar);

    ag += "\n\n\n";

    if(tipo.get(c)!=3) {
    ag += Agregadospeques.getId(agg);}
    ag += Agregadospeques.getBasics(tipos.get(c), vars.get(c));
    ag += Agregadospeques.setBasics(tipos.get(c), vars.get(c));
    ag += AgregadosGrandes.setAddSets(mapedByV);
    ag += AgregadosGrandes.getSetEntities(fkmoVarFinal,tipo.get(c));

    ag += Agregadospeques.acabalo();

    
    
    

    agg=metodos.Capital(agg);
    System.out.println(new File(url+"domain\\model\\"+agg.toLowerCase()).mkdir() ); 
    Escribir.escribir(
        url+"domain\\model\\"+agg+"\\"
            + agg
            + ".java",
        ag);
if(tipo.get(c)!=3) {
    Escribir.escribir(
        url+"domain\\model\\"+agg+"\\"
            + agg
            + "Id.java",
        AgregadoId.id(agg));}
    if(readOnly.get(c)==false) {
    // DTOS
    System.out.println(new File(url+"dtos\\dto\\"+agg.toLowerCase()).mkdir() ); 
    Escribir.escribir(
        url+"dtos\\dto\\"+agg+"\\"
            + agg
            + "CreateDto.java",
        Dto.createDto(agg, tipos.get(c), vars.get(c), fkmoVarFinal));
    Escribir.escribir(
        url+"dtos\\dto\\"+agg+"\\"
            + agg
            + "Dto.java",
        Dto.Dto(agg));
    // ASSEMBLERS
    System.out.println(new File(url+"dtos\\assembler\\"+agg.toLowerCase()).mkdir()); 
    Escribir.escribir(
        url+"dtos\\assembler\\"+agg+"\\"
            + agg
            + "CreateAssembler.java",
        Assembler.createAssembler(agg, tipos.get(c), vars.get(c), fkmoVarFinal));
    Escribir.escribir(
        url+"dtos\\assembler\\"+agg+"\\"
            + agg
            + "Assembler.java",
        Assembler.Assembler(agg, tipos.get(c), vars.get(c), fkmoVarFinal));
    // FACTORY
    System.out.println(new File(url+"application\\factoryimpl\\"+agg.toLowerCase()).mkdir() ); 
    Escribir.escribir(
        url+"domain\\model\\"+agg+"\\"
            + agg
            + "Factory.java",
        Factory.factory(agg, tipos.get(c), vars.get(c), fkmoVarFinal));
    Escribir.escribir(
        url+"application\\factoryimpl\\"+agg+"\\"
            + agg
            + "FactoryImpl.java",
        Factory.factoryImpl(agg, tipos.get(c), vars.get(c), fkmoVarFinal,importagg));
    }
  System.out.println(c+"    iiii");}}
//
//
  }
  //////////////////////////////////////////////////////
  //////////////////////////////////////////////////////
  //////////////////////////////////////////////////////
  }
}
