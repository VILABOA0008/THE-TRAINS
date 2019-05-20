package textos;

import java.util.ArrayList;

import main.metodos;

public class AgregadosGrandes {

  public static String clas(String agg) {
    String a;
    String AggId = metodos.aggId(agg);

    a = "@Entity\n" +
        "@Table(name = " + agg + ".TABLE_NAME)\n" +
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
        "  @Column(name = FIELD_ID, nullable = false, unique = true)\n" +
        "  private Integer id;\n";

    return a;
  }

  public static String manyToOne(String FIELD_FK, String var) {
    String a;
    a = "\n  @ManyToOne(fetch = FetchType.LAZY)\n" +
        "  @JoinColumn(name = " + FIELD_FK
        + ", nullable = false, insertable = false, updatable = false)\n" +
        "  private " + metodos.Capital(var) + " " + var + ";\n\n"
        + "  @EmbeddedId\n" +
        "  @AttributeOverride(name = ID  , column = @Column(name = "
        + FIELD_FK + ", nullable = true))\n" +
        "  private " + metodos.Capital(var) + "Id  " + metodos.aggId(var) + ";\n\n"
        + "";


    return a;
  }

  public static String oneToMany(ArrayList<String>mapedByFinal,ArrayList<String>mapedByV) {
    String a="";
    for (int i=0;i<mapedByV.size();i++) {
    
    a += "\n  @OneToMany(mappedBy = "+mapedByFinal.get(i)+", cascade = CascadeType.ALL)\n" +
        "  private Set<" + metodos.Capital(mapedByV.get(i)) + "> " + mapedByV.get(i) + ";";
    
    }

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

  public static String e21(String Agg, String tabla) {
    String a;
    a = "";

    return a;
  }

  public static String e2(String Agg, String tabla) {
    String a;
    a = "";

    return a;
  }

}
