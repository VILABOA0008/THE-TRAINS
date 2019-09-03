package main;

import java.util.ArrayList;

import textos.Agregadospeques;

public class Assembler {

  public static String createAssembler(
      String agg,
      ArrayList<String> fieldsType,
      ArrayList<String> fieldsVar,
      ArrayList<String> fks,ArrayList<String> fkmo) {
    String a = "";
    String b = "", c = "";
    agg = metodos.Capital(agg);

    a += Agregadospeques.AssemblerPackage(agg);
    a += Agregadospeques.CreateAssemblerImport();

    for (int i = 0; i < fieldsType.size(); i++) {
      String f = metodos.Capital(fieldsVar.get(i));

      b += "targetDto.set" + f + "(sourceAggregate.get" + f + "());\n";
    }
    if(fks!=null) {
    for (int i = 0; i < fks.size(); i++) {
      String f = metodos.Capital(fks.get(i));
      b += "targetDto.setId" + f + "(sourceAggregate.getId" + f + "().getId());\n";
    }}

    for (int i = 0; i < fieldsType.size(); i++) {
      String f = metodos.Capital(fieldsVar.get(i));

      c += "targetAggregate.set" + f + "(sourceDto.get" + f + "());\n";
    }
    
    if(fks!=null) {
    for (int i = 0; i < fks.size(); i++) {
      String f = metodos.Capital(fks.get(i));
      String fkmovar=metodos.Capital(fkmo.get(i));
      c += "targetAggregate.setId" + f + "(new " + fkmovar + "Id(sourceDto.getId" + f + "()));\n";
    }}

    a +=
        "public class "
            + agg
            + "CreateAssembler extends BaseAssembler<"
            + agg
            + ", "
            + agg
            + "CreateDto> {\n"
            + "\n"
            + "  @Override\n"
            + "  public void mergeAggregateIntoDto("
            + agg
            + " sourceAggregate, "
            + agg
            + "CreateDto targetDto) {\n"
            + b
            + "  }\n"
            + "\n"
            + "  @Override\n"
            + "  public void mergeDtoIntoAggregate("
            + agg
            + "CreateDto sourceDto,"
            + agg
            + " targetAggregate) {\n"
            + c
            + "\n"
            + "  }\n"
            + "\n"
            + "}";

    return a;
  }

  public static String Assembler(
      String agg) {
    String a = "";
    agg = metodos.Capital(agg);

    a += Agregadospeques.AssemblerPackage(agg);
    a += Agregadospeques.AssemblerImport();

    a +=
        "\npublic class "
            + agg
            + "Assembler extends BaseAssembler<"
            + agg
            + ", "
            + agg
            + "Dto> {\n"
            + "\n"
            + "  private final Assembler<"
            + agg
            + ", "
            + agg
            + "CreateDto> assembler;\n"
            + "\n"
            + "  @Inject\n"
            + "  public "
            + agg
            + "Assembler(\n"
            + "      Assembler<"
            + agg
            + ", "
            + agg
            + "CreateDto> assembler) {\n"
            + "    this.assembler = assembler;\n"
            + "  }\n"
            + "\n"
            + "  @Override\n"
            + "  public void mergeAggregateIntoDto("
            + agg
            + " sourceAggregate, "
            + agg
            + "Dto targetDto) {\n"
            + "    assembler.mergeAggregateIntoDto(sourceAggregate, targetDto);\n"
            + "    targetDto.setId"
            + agg
            + "(sourceAggregate.getId().getId());\n"
            + "  }\n"
            + "\n"
            + "  @Override\n"
            + "  public void mergeDtoIntoAggregate("
            + agg
            + "Dto sourceDto, "
            + agg
            + " targetAggregate) {\n"
            + "    assembler.mergeDtoIntoAggregate(sourceDto, targetAggregate);\n"
            + "\n"
            + "  }\n"
            + "\n"
            + "}\n"
            + "";

    return a;
  }
}
