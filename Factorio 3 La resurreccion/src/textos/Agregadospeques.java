package textos;

import main.metodos;

public class Agregadospeques {

  // public static final String de arriba

  public static String finalFields(String FIELD, String var) {
    String a;
    a = "\nprivate static final String " + FIELD + " = \"" + metodos.Capital(var) + "\";";

    return a;
  }

  public static String finalFk(String var) {
    String a;
    a = "   \nprivate static final String FK_" + var.toUpperCase() + " = \"" + metodos.Capital(var)
        + "\";";

    return a;
  }

  public static String MappedBy(String fina, String var) {
    String a;
    a = "   \nprivate static final String " + fina + " = \"" + (var) + "\";";

    return a;
  }

  public static String finalTable(String var) {
    String a;
    a = "   \nprivate static final String TABLE_NAME = \"" + var + "\";";

    return a;
  }

  public static String finalGenerator(String agg) {
    String a;
    a = "   \nprivate static final String GENERATOR = \"" + agg + "Gen\";\n\n";

    return a;
  }

  public static String basicVar(String FIELD, String tipo, String var) {
    String a;
    a = "\n  @Column(name = " + FIELD + ",unique = false,  nullable = false)\n" +
        "  private " + tipo + " " + var + ";\n";

    return a;
  }

  public static String finalId(String agg) {
    String a;
    a = "\npublic static final String FIELD_ID = \" Id" + metodos.Capital(agg) + " \";";

    return a;
  }

  public static String d(String Agg, String tabla) {
    String a;
    a = "";

    return a;
  }

  public static String constructorEmpty(String agg) {
    String a;
    a = "\n  " + agg + "() {\n" +
        "    // Required by Hibernate\n" +
        "  }\n";

    return a;
  }

  public static String dg(String Agg, String tabla) {
    String a;
    a = "";

    return a;
  }

  public static String he(String Agg, String tabla) {
    String a;
    a = "";

    return a;
  }

  public static String jd(String Agg, String tabla) {
    String a;
    a = "";

    return a;
  }

  public static String e(String Agg, String tabla) {
    String a;
    a = "";

    return a;
  }

}
