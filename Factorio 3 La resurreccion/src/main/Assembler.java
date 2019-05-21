package main;

import java.util.ArrayList;

public class Assembler {

  public static String createAssembler(String agg, ArrayList<String> fieldsType,
      ArrayList<String> fieldsVar, ArrayList<String> fkmoVarFinal) {
    String a = "";
    String b = "", c = "";
    agg = metodos.Capital(agg);

    for (int i = 0; i < fieldsType.size(); i++) {
      String f = metodos.Capital(fieldsVar.get(i));

      b += "targetDto.set" + f + "(sourceAggregate.get" + f + "());\n";
    }
    for (int i = 0; i < fkmoVarFinal.size(); i++) {
      String f = metodos.Capital(fkmoVarFinal.get(i));
      b += "targetDto.setId" + f + "(sourceAggregate.get" + f + "Id().getId" + f + "());\n";
    }

    for (int i = 0; i < fieldsType.size(); i++) {
      String f = metodos.Capital(fieldsVar.get(i));

      c += "targetAggregate.set" + f + "(sourceDto.get" + f + "());\n";
    }
    for (int i = 0; i < fkmoVarFinal.size(); i++) {
      String f = metodos.Capital(fkmoVarFinal.get(i));
      c += "targetAggregate.set" + f + "Id(new " + f + "Id(sourceDto.getId" + f + "()));\n";
    }

    a += "public class " + agg + "CreateAssembler extends BaseAssembler<" + agg + ", " + agg
        + "CreateDto> {\n" +
        "\n" +
        "  @Override\n" +
        "  public void mergeAggregateIntoDto(" + agg + " sourceAggregate, " + agg
        + "CreateDto targetDto) {\n" +
        b +
        "  }\n" +
        "\n" +
        "  @Override\n" +
        "  public void mergeDtoIntoAggregate(" + agg + "CreateDto sourceDto," + agg
        + " targetAggregate) {\n" +
        c +
        "\n" +
        "  }\n" +
        "\n" +
        "}";

    return a;
  }

  public static String Assembler(String agg, ArrayList<String> fieldsType,
      ArrayList<String> fieldsVar, ArrayList<String> fkmoVarFinal) {
    String a = "";
    agg = metodos.Capital(agg);
    
    
    a += "public class "+agg+"Assembler extends BaseAssembler<"+agg+", "+agg+"Dto> {\n" +
        "\n" +
        "  private final Assembler<"+agg+", "+agg+"CreateDto> assembler;\n" +
        "\n" +
        "  @Inject\n" +
        "  public "+agg+"Assembler(\n" +
        "      Assembler<"+agg+", "+agg+"CreateDto> assembler) {\n" +
        "    this.assembler = assembler;\n" +
        "  }\n" +
        "\n" +
        "  @Override\n" +
        "  public void mergeAggregateIntoDto("+agg+" sourceAggregate, "+agg+"Dto targetDto) {\n" +
        "    assembler.mergeAggregateIntoDto(sourceAggregate, targetDto);\n" +
        "    targetDto.setId"+agg+"(sourceAggregate.getId"+agg+"());\n" +
        "  }\n" +
        "\n" +
        "  @Override\n" +
        "  public void mergeDtoIntoAggregate("+agg+"Dto sourceDto, "+agg+" targetAggregate) {\n" +
        "    assembler.mergeDtoIntoAggregate(sourceDto, targetAggregate);\n" +
        "\n" +
        "  }\n" +
        "\n" +
        "}\n" +
        "";

    return a;
  }

}
