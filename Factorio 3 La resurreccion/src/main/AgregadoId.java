package main;

import textos.Agregadospeques;

public class AgregadoId {

  public static String id(String agg) {

    String id = metodos.Capital(agg) + "Id";

    String a=Agregadospeques.paqueteB();

    
a+=Agregadospeques.importsId();
    
     a +="@Embeddable\n" +
        "public class " + id + " extends BaseValueObject {\n" +
        "\n" +
        "\n" +
        "  private static final long serialVersionUID = 1;\n" +
        "  private Integer id;\n" +
        "\n" +
        "  public " + id + "() {\n" +
        "  }\n" +
        "\n" +
        "  public " + id + "(Integer id) {\n" +
        "     this.id = id;\n" +
        "  }\n" +
        "\n" +
        "\n" +
        "  public Integer getId() {\n" +
        "    return id;\n" +
        "  }\n\n\n}";
    a += "";
    return a;
  }

}
