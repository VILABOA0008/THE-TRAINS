package main;

public class AgregadoId {

  public static String id(String agg) {

    String id = metodos.Capital(agg) + "Id";
    String idd = "id" + metodos.Capital(agg);

    String a = "@Embeddable\n" +
        "public class " + id + " extends BaseValueObject {\n" +
        "\n" +
        "\n" +
        "  private static final long serialVersionUID = 1;\n" +
        "  private Integer " + idd + ";\n" +
        "\n" +
        "  public " + id + "() {\n" +
        "  }\n" +
        "\n" +
        "  public " + id + "(Integer " + idd + ") {\n" +
        "    this." + idd + " = " + idd + ";\n" +
        "  }\n" +
        "\n" +
        "\n" +
        "  public Integer get" + id + "() {\n" +
        "    return " + idd + ";\n" +
        "  }\n\n\n}";
    a+="";
    return a;
  }

}
