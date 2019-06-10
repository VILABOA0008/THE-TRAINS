package main;

import textos.Agregadospeques;

public class AgregadoId {

  public static String id(String agg) {

    String id = metodos.Capital(agg) + "Id";

    String a=Agregadospeques.paqueteAgg(agg);

    
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
  
  
  public static String idMtm(String agg,String var0,String var1) {
    
    String id = metodos.Capital(agg) + "Id";
    
    String a=Agregadospeques.paqueteAgg(agg);
    
    
    a+=Agregadospeques.importsId();
    
    a +="@Embeddable\n" +
        "public class " + id + " extends BaseValueObject {\n" +
        "\n" +
        "\n" +
        "  private static final long serialVersionUID = 1;\n" +
        "  private Integer id"+var0+";\n"
        + "private Integer id"+var1+";\n" +
        "\n" +
        "  public " + id + "() {\n" +
        "  }\n" +
        "\n" +
        "   public "+agg+"Id(Integer id"+var0+", Integer id"+var1+") {\n" + 
        "    this.id"+var0+" = id"+var0+";\n" + 
        "    this.id"+var1+" = id"+var1+";\n" + 
        "  }\n" +
        "\n" +
        "\n" +
        "   public "+var0+"Id get"+var0+"Id() {\n" + 
        "    return new "+var0+"Id(id"+var0+");\n" + 
        "  }\n" + 
        " \n" + 
        "  public "+var1+"Id get"+var1+"Id() {\n" + 
        "    return new "+var1+"Id(id"+var1+");\n" + 
        "  }}";
    a += "";
    return a;
  }

}
