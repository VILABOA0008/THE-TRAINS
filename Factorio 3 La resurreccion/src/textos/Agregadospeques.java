package textos;

import main.metodos;

public class Agregadospeques {

  // public static final String de arriba

  public static String ffield(String var) {
    String a;
    a = "\nprivate static final String FIELD_" + var.toUpperCase() + " = \"" + metodos.Capital(var)
        + "\";";

    return a;
  }

  public static String ffk(String var) {
    String a;
    a = "   \nprivate static final String FK_" + var.toUpperCase() + " = \"" + metodos.Capital(var)
        + "\";";

    return a;
  }

  public static String ftable(String var) {
    String a;
    a = "   \nprivate static final String TABLE_NAME = \"" + var + "\";";

    return a;
  }
  
  public static String fgenertator(String agg) {
    String a;
    a = "   \nprivate static final String GENERATOR = \"" + agg+"Gen\";";

    return a;
  }

  public static String tint(String Agg, String tabla) {
    String a;
    a = "  @Column(name = FIELD_SHORT_NAME,  nullable = false)\n" +
        "  private String shortName;";

    return a;
  }

  public static String tstring(String Agg, String tabla) {
    String a;
    a = "  @Column(name = FIELD_SHORT_NAME, nullable = false, length = 10)\n" +
        "  private String shortName;";

    return a;
  }

  public static String d(String Agg, String tabla) {
    String a;
    a = "";

    return a;
  }

  public static String ef(String Agg, String tabla) {
    String a;
    a = "";

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
