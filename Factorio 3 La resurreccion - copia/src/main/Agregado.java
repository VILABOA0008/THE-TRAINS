package main;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import cosas.Escribir;
import textos.AgregadosGrandes;
import textos.Agregadospeques;

public class Agregado {


  public static void test()
      throws IOException {

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
    ArrayList<String> fieldsVar = new ArrayList<>();
    ArrayList<String> fieldsType = new ArrayList<>();
    // NOMBRE DE LA TABLA DE L AGREGADO Y DEL ID
    String tabla, agg;

    // DISTINTAS VARIABLES
    String MappedBy, mappedByV;
    

    agg = AgregadoMetodos.NombreAggregado();

    ag += Agregadospeques.paqueteAgg(agg);

    ag += Agregadospeques.imports();

    ag += AgregadosGrandes.clas(agg);

    tabla = AgregadoMetodos.NombreTabla();

    ag += Agregadospeques.finalTable(tabla);

    ag += Agregadospeques.ID();

    ag += Agregadospeques.finalId(agg);

    ag += AgregadoMetodos.Fields(fieldsType, fieldsFinal, fieldsVar);//ECHO
    ag += AgregadoMetodos.ManysToOnes(fkmoFinal, fkmoVarFinal);
    ag += AgregadoMetodos.OnesToManys(mapedBy, mapedByV, mapedByFinal);
    ag += AgregadoMetodos.ManyToMany(agg, mtmVar);
    ag += AgregadoMetodos.ManyToManyMapped(agg, mtmappedVar);

    ag += Agregadospeques.finalGenerator(agg);
    ag += AgregadosGrandes.tableGenerator(agg);

    System.out.println("\n\n \n\n\n");

    ag += AgregadoMetodos.VariablesBasicas(fieldsFinal, fieldsType, fieldsVar);
    ag += Agregadospeques.constructorEmpty(agg);
    ag += AgregadoMetodos.ManyToOne(fkmoFinal, fkmoVarFinal);

    if (!mapedByV.isEmpty()) {
      ag += AgregadosGrandes.oneToMany(mapedByFinal, mapedByV);
    }
    ag += AgregadosGrandes.ManysToManys(agg, mtmVar);
    ag += Agregadospeques.manyToManyMappedBy(agg, mtmappedVar);

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

    // ENTITY , ID
    agg=metodos.Capital(agg);
    System.out.println(new File("C:\\Users\\pabcos\\Documents\\trains\\prubas\\proyecto seedstack base\\src\\main\\java\\ctag\\domain\\model\\customer\\"+agg).mkdir() ); 
    
    Escribir.escribir(
        "C:\\Users\\pabcos\\Documents\\trains\\prubas\\proyecto seedstack base\\src\\main\\java\\ctag\\domain\\model\\customer\\"+ agg+".java",
        ag);
    
    Escribir.escribir(
        "C:\\Users\\pabcos\\Documents\\trains\\prubas\\proyecto seedstack base\\src\\main\\java\\ctag\\domain\\model\\customer\\"+ agg+".java",
        ag);
    Escribir.escribir(
        "C:\\Users\\pabcos\\Documents\\trains\\prubas\\proyecto seedstack base\\src\\main\\java\\ctag\\domain\\model\\customer\\"+ agg+"Id.java",
        AgregadoId.id(agg));
    // DTOS
    Escribir.escribir(
        "C:\\Users\\pabcos\\Documents\\trains\\prubas\\proyecto seedstack base\\src\\main\\java\\ctag\\dtos\\dto\\customer\\"
            + agg
            + "CreateDto.java",
        Dto.createDto(agg, fieldsType, fieldsVar, fkmoVarFinal));
    Escribir.escribir(
        "C:\\Users\\pabcos\\Documents\\trains\\prubas\\proyecto seedstack base\\src\\main\\java\\ctag\\dtos\\dto\\customer\\"
            + agg
            + "Dto.java",
        Dto.Dto(agg));
    // ASSEMBLERS
    Escribir.escribir(
        "C:\\Users\\pabcos\\Documents\\trains\\prubas\\proyecto seedstack base\\src\\main\\java\\ctag\\dtos\\assembler\\customer\\"
            + agg
            + "CreateAssembler.java",
        Assembler.createAssembler(agg, fieldsType, fieldsVar, fkmoVarFinal));
    Escribir.escribir(
        "C:\\Users\\pabcos\\Documents\\trains\\prubas\\proyecto seedstack base\\src\\main\\java\\ctag\\dtos\\assembler\\customer\\"
            + agg
            + "Assembler.java",
        Assembler.Assembler(agg, fieldsType, fieldsVar, fkmoVarFinal));
    // FACTORUE
    Escribir.escribir(
        "C:\\Users\\pabcos\\Documents\\trains\\prubas\\proyecto seedstack base\\src\\main\\java\\ctag\\domain\\model\\aggregate\\ModelosPruebas\\"
            + agg
            + "Factory.java",
        Factory.factory(agg, fieldsType, fieldsVar, fkmoVarFinal));
    Escribir.escribir(
        "C:\\Users\\pabcos\\Documents\\trains\\prubas\\proyecto seedstack base\\src\\main\\java\\ctag\\domain\\model\\customer\\"
            + agg
            + "Factory.java",
        Factory.factory(agg, fieldsType, fieldsVar, fkmoVarFinal));
    Escribir.escribir(
        "C:\\Users\\pabcos\\Documents\\trains\\prubas\\proyecto seedstack base\\src\\main\\java\\ctag\\application\\factoryimpl\\customer\\"
            + agg
            + "FactoryImpl.java",
        Factory.factoryImpl(agg, fieldsType, fieldsVar, fkmoVarFinal));
    // Escribir.escribir("C:\\Users\\pabcos\\Desktop\\cosas.txt",ag);

  }

  //////////////////////////////////////////////////////
  //////////////////////////////////////////////////////
  //////////////////////////////////////////////////////

}
