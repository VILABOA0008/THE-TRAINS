package textos;

import main.metodos;

public class AgregadosGrandes {

  public static String clas(String agg) {
    String a;
    String AggId = metodos.aggId(agg);

    a = "@Entity\n" +
        "@Table(name = " + agg + ".TABLENAME)\n" +
        "@IdClass("+AggId+".class)\n" +
        "public class " + agg + " extends BaseAggregateRoot<" + AggId + "> {\n";

    return a;
  }

  public static String tableGenerator(String Agg, String tabla) {
    String a;

    a = "@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GENERATOR)\n" +
        "@TableGenerator(name = GENERATOR, table = SEQUENCE, pkColumnName = KEY_VAL, \n" +
        "    valueColumnName = VALUE, pkColumnValue = TABLE_NAME, allocationSize = 1)\n" +
        "\n" +
        "@Id\n" +
        "@Column(name = ID_MANUFACTURINGORDER, nullable = false, unique = true)\n" +
        "private Integer id;";

    return a;
  }

  public static String a(String Agg, String tabla) {
    String a;
    a = "";

    return a;
  }

  public static String b(String Agg, String tabla) {
    String a;
    a = "";

    return a;
  }

  public static String c(String Agg, String tabla) {
    String a;
    a = "";

    return a;
  }

  public static String d(String Agg, String tabla) {
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
