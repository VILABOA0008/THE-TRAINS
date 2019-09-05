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

  public static String tableGenerator(String ID) {
    String a;

    a = "  @TableGenerator(name = GENERATOR, table = SEQUENCE, pkColumnName = KEY_VAL, valueColumnName = VALUE, pkColumnValue = TABLE_NAME, allocationSize = 1)\n"
        +
        "  @Id\n" +
        "  @GeneratedValue(strategy = GenerationType.TABLE, generator = GENERATOR)\n" +
        "  @Column(name = " + ID + ", nullable = false, unique = true)\n" +
        "  private Integer id;\n";

    return a;
  }

  public static String manyToOne(String fk, String FIELD_FK, String var, int tipo) {

    String a;
    
    

    a = "\n  @ManyToOne(fetch = FetchType.LAZY)\n" +
        "  @JoinColumn(name = " + FIELD_FK
        + ", nullable = false, insertable = false, updatable = false)\n" +
        "  private " + metodos.Capital(var) + " " + metodos.despital(fk) + ";\n\n";

    if (tipo != 3) {
      a += "  @EmbeddedId\n" +
          "  @AttributeOverride(name = ID  , column = @Column(name = "
          + FIELD_FK + ", nullable = true))\n" +
          "  private " + metodos.Capital(var) + "Id  " + metodos.despital(fk) + "Id;\n\n"
          + "";
    } else {
      a += "@Id\n" +
          " @Column(name = " + FIELD_FK + ")\n" +
          "  private Integer " + metodos.despital(fk) + "Id;\n\n"
          + "";

    }

    return a;
  }

  public static String oneToMany(ArrayList<String> mapedByFinal, ArrayList<String> mapedByV) {

    String a = "";
    int c = 0;
    for (String i : mapedByV) {
      a += "\n  @OneToMany(mappedBy = " + mapedByFinal.get(c)
          + ", cascade = CascadeType.ALL, fetch = FetchType.LAZY)\n" +
          "  private Set<" + metodos.Capital(i) + "> " + i + "s;\n";
      c++;
    }

    return a;
  }

  public static String setAddSets(ArrayList<String> mappedV) {
    String a = "";
    for (String i : mappedV) {
      String cap = metodos.Capital(i);

      a += "  public Set<" + cap + "> get" + metodos.Capital(i) + "s() {\n" +
          "    if (" + i + "s == null) {\n" +
          "      return Collections.<" + cap + ">emptySet();\n" +
          "    }\n" +
          "    return Collections.unmodifiableSet(" + i + "s);\n" +
          "  }\n" +
          "\n" +
          "  public void add" + cap + "(" + cap + " " + i + ") {\n" +
          "    if (" + i + "s == null) {\n" +
          "      this." + i + "s = new HashSet<>();\n" +
          "    }\n" +
          "    this." + i + "s.add(" + i + ");\n" +
          "  }\n";
    }
    return a;
  }

  public static String getSetEntities(ArrayList<String> fk, ArrayList<String> fkmoVarFinal,
      Integer tipo) {
    String a = "";
    int c = -1;
    for (String i : fkmoVarFinal) {
      c++;
      String cap = metodos.Capital(i);
      String fkdecap = metodos.despital(fk.get(c));
      String fkcap = fk.get(c);
      if (tipo != 3) {

        a += "   public " + cap + " get" + fkcap + "() {\n" +
            "    return " + fkdecap + ";\n" +
            "  }\n";
        a += "  public " + cap + "Id getId" + fkcap + "() {\n" +
            "    return " + fkdecap + "Id;\n" +
            "  }\n"
            + "  public void setId" + fkcap + "(" + cap + "Id " + fkdecap + "Id) {\n" +
            "    this." + fkdecap + "Id = " + fkdecap + "Id;\n" +
            "  }\n";
      } else {

        a += "   public " + cap + "Id get" + fkcap + "Id() {\n" +
            "    return new " + cap + "Id(" + fkdecap + "Id);\n" +
            "  }\n"
            + "  public void setId" + fkcap + "(" + cap + "Id " + fkdecap + "Id) {\n" +
            "    this." + fkdecap + "Id = " + fkdecap + "Id.getId();\n" +
            "  }\n";

      }
    }
    return a;
  }

  public static String ManysToManys(String ID,String agg, ArrayList<String> mtmVar) {
    String a = "", c = "";
    int b = 1;
    for (String i : mtmVar) {
      if (a.contains(i + c)) {
        b++;
        c = String.valueOf(b);
      } else {
        c = "";
      }
      a += " \n @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)\n" +
          "  @JoinTable(\n" +
          "      name = TABLE_" + agg.toUpperCase() + "_" + i.toUpperCase() + c + ",\n" +
          "      joinColumns = {@JoinColumn(name = " + ID
          + ", nullable = false, updatable = false)},\n" +
          "      inverseJoinColumns = {@JoinColumn(name = ID_" + i.toUpperCase()
          + ", nullable = false, updatable = false)})\n" +
          "  private Set<" + metodos.Capital(i) + "> " + i + "s" + c + ";\n";

    }
    return a;
  }

  public static String we2(String Agg, String tabla) {
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
