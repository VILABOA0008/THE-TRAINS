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
        "  @Column(name = ID_"+agg.toUpperCase()+", nullable = false, unique = true)\n" +
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
        "  private " + metodos.Capital(var) + "Id  id" + metodos.Capital(var) + ";\n\n"
        + "";


    return a;
  }

  public static String oneToMany(ArrayList<String>mapedByFinal,ArrayList<String>mapedByV) {
    

    String a="";
    int c=0;
      for(String i:mapedByV) {
    a += "\n  @OneToMany(mappedBy = "+mapedByFinal.get(c)+", cascade = CascadeType.ALL, fetch = FetchType.EAGER)\n" +
        "  private Set<" + metodos.Capital(i) + "> " + i + "s;\n";
    c++;
    }
    

    return a;
  }

  public static String setAddSets(ArrayList<String> mappedV) {
    String a="";
    for(String i:mappedV) {
      String cap=metodos.Capital(i);
      
      
    a += "  public Set<"+cap+"> get"+metodos.Capital(i)+"s() {\n" + 
        "    if ("+i+"s == null) {\n" + 
        "      return Collections.<"+cap+">emptySet();\n" + 
        "    }\n" + 
        "    return Collections.unmodifiableSet("+i+"s);\n" + 
        "  }\n" + 
        "\n" + 
        "  public void add"+cap+"("+cap+" "+i+") {\n" + 
        "    if ("+i+"s == null) {\n" + 
        "      this."+i+"s = new HashSet<>();\n" + 
        "    }\n" + 
        "    this."+i+"s.add("+i+");\n" + 
        "  }\n";
  }
  return a;
  }

  public static String getSetEntities(ArrayList<String> fkmoVarFinal) {
    String a="";
    for(String i:fkmoVarFinal) {
      String cap=metodos.Capital(i);
      
    a+= "  public "+cap+"Id getId"+cap+"() {\n" + 
        "    return id"+cap+";\n" + 
        "  }\n"
        + "  public void setId"+cap+"("+cap+"Id id"+cap+") {\n" + 
        "    this.id"+cap+" = id"+cap+";\n" + 
        "  }\n";
    }
    return a;
  }

  public static String ManysToManys(String agg,ArrayList<String>mtmVar) {
    String a="";
    for(String i:mtmVar) {
    
    a += " \n @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)\n" + 
        "  @JoinTable(\n" + 
        "      name = TABLE_"+agg.toUpperCase()+"_"+i.toUpperCase()+",\n" + 
        "      joinColumns = {@JoinColumn(name = ID_"+agg.toUpperCase()+", nullable = false, updatable = false)},\n" + 
        "      inverseJoinColumns = {@JoinColumn(name = ID_"+i.toUpperCase()+", nullable = false, updatable = false)})\n" + 
        "  private Set<"+metodos.Capital(i)+"> "+i+"s;\n";

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
