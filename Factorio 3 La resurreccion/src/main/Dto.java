package main;

import java.util.ArrayList;

import textos.Agregadospeques;

public class Dto {

  public static String createDto(String agg, ArrayList<String> fieldsType,
      ArrayList<String> fieldsVar, ArrayList<String> fks,String importagg) {
    String a = "";
    agg = metodos.Capital(agg);

    a += Agregadospeques.DtoPackage(agg);
    a += Agregadospeques.CreateDtoImport(importagg);

    a += "\n@DtoOf(" + agg + ".class)\n" +
        "@ApiModel(value = \" " + agg + " \")\n" +
        "public class " + agg + "CreateDto {\n\n";

    for (int i = 0; i < fieldsType.size(); i++) {
      a += "private " + fieldsType.get(i) + " " + fieldsVar.get(i) + ";\n";
    }
    if (fks != null) {
      for (int i = 0; i < fks.size(); i++) {
        a += "private Integer" + " id" + metodos.Capital(fks.get(i) + ";\n");
      }
    }

    a += "\n\n";

    for (int i = 0; i < fieldsType.size(); i++) {
      a += "  @JsonProperty(value = \"" + fieldsVar.get(i) + "\")\n" +
          "  @ApiModelProperty(value = \"" + fieldsVar.get(i) + "\")\n "
          + " @FactoryArgument(index = " + i + ")\n" +
          "  public " + fieldsType.get(i) + " get" + metodos.Capital(fieldsVar.get(i)) + "() {\n" +
          "    return " + fieldsVar.get(i) + ";" +
          "  }\n\n";
    }
    
    if (fks != null) {
    for (int i = 0; i < fks.size(); i++) {
      String cap = metodos.Capital(fks.get(i));
      a += "  @JsonProperty(value = \"id" + cap + "\")\n" +
          "  @ApiModelProperty(value = \"id" + cap + "\") \n"
          + "  @FactoryArgument(index = " + (fieldsType.size() + i) + ")\n" +
          "  public Integer get" + cap + "Id() {\n" +
          "    return id" + cap + ";" +
          "  }\n\n";
    }}

    for (int i = 0; i < fieldsType.size(); i++) {
      a += "  public void set" + metodos.Capital(fieldsVar.get(i)) + "(" + fieldsType.get(i) + "  "
          + fieldsVar.get(i) + ") {\n" +
          "    this." + fieldsVar.get(i) + " = " + fieldsVar.get(i) + ";" +
          "  }\n\n";
    }
    
    if (fks != null) {
    for (int i = 0; i < fks.size(); i++) {
      String cap = metodos.Capital(fks.get(i));
      a += "  public void set" + metodos.Capital(cap) + "Id(Integer  id" + cap + ") {\n" +
          "    this.id" + cap + " = id" + cap + ";" +
          "  }\n\n";
    }}
    a += "\n}";

    return a;
  }

  public static String Dto(String agg) {
    String a = "";
    agg = metodos.Capital(agg);

    a += Agregadospeques.DtoPackage(agg);
    a += Agregadospeques.DtoImport();

    a += "\n\n@ApiModel(value = \" " + agg + "  \")" +
        "public class " + agg + "Dto extends " + agg + "CreateDto {\n" +
        "\n" +
        "  private Integer id" + agg + ";\n" +
        "\n" +
        "  @JsonIgnore\n"
        + "@AggregateId\n" +
        "  private " + agg + "Id getId() {\n" +
        "    return new " + agg + "Id(id" + agg + ");\n" +
        "  }\n" +
        "\n" +
        "  @JsonProperty(\"id" + agg + "\")\n" +
        "  public Integer get" + agg + "Id() {\n" +
        "    return id" + agg + ";\n" +
        "  }\n" +
        "\n" +
        "  public void set" + agg + "Id(Integer id" + agg + ") {\n" +
        "    this.id" + agg + " = id" + agg + ";\n" +
        "  }";

    a += "\n}";

    return a;
  }

}
