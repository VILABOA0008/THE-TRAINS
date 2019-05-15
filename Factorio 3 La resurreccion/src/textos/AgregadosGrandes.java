package textos;

import main.metodos;

public class AgregadosGrandes {

  public static String clas(String agg) {
    String a;
    String AggId = metodos.aggId(agg);

    a = "@Entity\n" +
        "@Table(name = " + agg + ".TABLENAME)\n" +
        "@IdClass(" + AggId + ".class)\n" +
        "public class " + agg + " extends BaseAggregateRoot<" + AggId + "> {\n";

    return a;
  }

  public static String tableGenerator(String agg) {
    String a;

    a = "  @TableGenerator(name = GENERATOR, table = SEQUENCE, pkColumnName = KEY_VAL, valueColumnName = VALUE, pkColumnValue = TABLE_NAME, allocationSize = 1)\n"
        +
        " \n" +
        "  @Id\n" +
        "  @GeneratedValue(strategy = GenerationType.TABLE, generator = GENERATOR)\n" +
        "  @Column(name = ID_" + agg + ", nullable = false, unique = true)\n" +
        "  private Integer id;\n";

    return a;
  }

  public static String manyToOne(String FIELD_FK, String var) {
    String a;
    a = "\n  @ManyToOne(fetch = FetchType.LAZY)\n" + 
        "  @JoinColumn(name = "+FIELD_FK+", nullable = false, insertable = false, updatable = false)\n" + 
        "  private "+metodos.Capital(var)+" "+var+";\n";

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
