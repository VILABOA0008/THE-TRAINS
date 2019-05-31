package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import cosas.Escribir;
import textos.AgregadosGrandes;
import textos.Agregadospeques;

public class AgregadoPLUSPLUS {


  public static void test(   Map<Integer, ArrayList<String>> vars,
      Map<Integer, ArrayList<String>> tipos,
      Map<Integer, ArrayList<String>> fields,
      Map<Integer, ArrayList<String>> foreign,
      ArrayList<String> arrayprimary,
      ArrayList<String> tablas,
      Map<Integer, ArrayList<String>> fks,Map<Integer, Boolean> mtm ,Map<Integer, ArrayList<Integer>> otm)
      throws IOException {
    
    int c=3;
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
   //ArrayList<String> fieldsVar = new ArrayList<>();
   // ArrayList<String> fieldsType = new ArrayList<>();
    // NOMBRE DE LA TABLA DE L AGREGADO Y DEL ID
    String agg;
    String tabla =tablas.get(c-1);

    // DISTINTAS VARIABLES
    String MappedBy, mappedByV;

    
    //TODO agg = AgregadoMetodosPLUS_PLUS_PLUS.NombreAggregado(tabla);
agg="Button";
    ag += Agregadospeques.paqueteAgg();

    ag += Agregadospeques.imports();

    ag += AgregadosGrandes.clas(agg);

  //  tabla = AgregadoMetodosPLUS_PLUS_PLUS.NombreTabla();
    
    ag += Agregadospeques.finalTable(tabla);

    ag += Agregadospeques.ID();

    ag += Agregadospeques.finalId(agg);
    System.out.println(tipos.get(c).toString()); 
    ag += AgregadoMetodosPLUS_PLUS_PLUS.Fields(tipos.get(c), fieldsFinal, vars.get(c));
//    ag += AgregadoMetodosPLUS_PLUS_PLUS.ManysToOnes(fkmoFinal, fkmoVarFinal);
//    ag += AgregadoMetodosPLUS_PLUS_PLUS.OnesToManys(mapedBy, mapedByV, mapedByFinal);
//    ag += AgregadoMetodosPLUS_PLUS_PLUS.ManyToMany(agg, mtmVar);
//    ag += AgregadoMetodosPLUS_PLUS_PLUS.ManyToManyMapped(agg, mtmappedVar);

    ag += Agregadospeques.finalGenerator(agg);
    ag += AgregadosGrandes.tableGenerator(agg);

    System.out.println("\n\n \n\n\n");

    ag += AgregadoMetodosPLUS_PLUS_PLUS.VariablesBasicas(fieldsFinal, tipos.get(c), vars.get(c));
    ag += Agregadospeques.constructorEmpty(agg);
    ag += AgregadoMetodosPLUS_PLUS_PLUS.ManyToOne(fkmoFinal, fkmoVarFinal);

    if (!mapedByV.isEmpty()) {
      ag += AgregadosGrandes.oneToMany(mapedByFinal, mapedByV);
    }
    ag += AgregadosGrandes.ManysToManys(agg, mtmVar);
    ag += Agregadospeques.manyToManyMappedBy(agg, mtmappedVar);

    ag += "\n\n\n";

    ag += Agregadospeques.getId(agg);
    ag += Agregadospeques.getBasics(tipos.get(c), vars.get(c));
    ag += Agregadospeques.setBasics(tipos.get(c), vars.get(c));
    ag += AgregadosGrandes.setAddSets(mapedByV);
    ag += AgregadosGrandes.getSetEntities(fkmoVarFinal);

    ag += Agregadospeques.acabalo();

    System.out.println(ag);
    System.out.println("\n\n\n ID \n\n\n");
    System.out.println("\n\n\n" + AgregadoId.id(agg));
    System.out.println("\n\n\n FACTORY \n\n\n");
    System.out.println("\n\n\n" + Factory.factory(agg, tipos.get(c), vars.get(c), fkmoVarFinal));
    System.out.println("\n\n\n FACTORY_IMPL \n\n\n");
    System.out.println("\n\n\n" + Factory.factoryImpl(agg, tipos.get(c), vars.get(c), fkmoVarFinal));
    System.out.println("\n\n\n CREATE  DTO \n\n\n");
    System.out.println("\n\n\n" + Dto.createDto(agg, tipos.get(c), vars.get(c), fkmoVarFinal));
    System.out.println("\n\n\n DTO \n\n\n");
    System.out.println("\n\n\n" + Dto.Dto(agg));
    System.out.println("\n\n\n CREATE ASSEMBLER \n\n\n");
    System.out.println(
        "\n\n\n" + Assembler.createAssembler(agg, tipos.get(c), vars.get(c), fkmoVarFinal));
    System.out.println("\n\n\n  ASSEMBLER \n\n\n");
    System.out.println("\n\n\n" + Assembler.Assembler(agg, tipos.get(c), vars.get(c), fkmoVarFinal));

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
        Dto.createDto(agg, tipos.get(c), vars.get(c), fkmoVarFinal));
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
        Assembler.createAssembler(agg, tipos.get(c), vars.get(c), fkmoVarFinal));
    Escribir.escribir(
        "C:\\Users\\pabcos\\Documents\\trains\\prubas\\proyecto seedstack base\\src\\main\\java\\ctag\\dtos\\assembler\\customer\\"
            + metodos.Capital(agg)
            + "Assembler.java",
        Assembler.Assembler(agg, tipos.get(c), vars.get(c), fkmoVarFinal));
    // FACTORUE
    Escribir.escribir(
        "C:\\Users\\pabcos\\Documents\\trains\\prubas\\proyecto seedstack base\\src\\main\\java\\ctag\\domain\\model\\aggregate\\ModelosPruebas\\"
            + metodos.Capital(agg)
            + "Factory.java",
        Factory.factory(agg, tipos.get(c), vars.get(c), fkmoVarFinal));
    Escribir.escribir(
        "C:\\Users\\pabcos\\Documents\\trains\\prubas\\proyecto seedstack base\\src\\main\\java\\ctag\\domain\\model\\customer\\"
            + metodos.Capital(agg)
            + "Factory.java",
        Factory.factory(agg, tipos.get(c), vars.get(c), fkmoVarFinal));
    Escribir.escribir(
        "C:\\Users\\pabcos\\Documents\\trains\\prubas\\proyecto seedstack base\\src\\main\\java\\ctag\\application\\factoryimpl\\customer\\"
            + metodos.Capital(agg)
            + "FactoryImpl.java",
        Factory.factoryImpl(agg, tipos.get(c), vars.get(c), fkmoVarFinal));
    // Escribir.escribir("C:\\Users\\pabcos\\Desktop\\cosas.txt",ag);

  }

  //////////////////////////////////////////////////////
  //////////////////////////////////////////////////////
  //////////////////////////////////////////////////////

}
