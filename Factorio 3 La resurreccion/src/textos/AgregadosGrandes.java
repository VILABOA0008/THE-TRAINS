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

    a = "  @TableGenerator(name = GENERATOR, table = SEQUENCE, pkColumnName = KEY_VAL, valueColumnName = VALUE, pkColumnValue = TABLE_NAME, allocationSize = 1)\n"+
        "  @Id\n" +
        "  @GeneratedValue(strategy = GenerationType.TABLE, generator = GENERATOR)\n" +
        "  @Column(name = ID_"+agg.toUpperCase()+", nullable = false, unique = true)\n" +
        "  private Integer id;\n";

    return a;
  }

  public static String manyToOne(String FIELD_FK, String var,Integer tipo) {

    
    String a;
    if(tipo!=3) {
    a = "\n  @ManyToOne(fetch = FetchType.LAZY)\n" +
        "  @JoinColumn(name = " + FIELD_FK
        + ", nullable = false, insertable = false, updatable = false)\n" +
        "  private " + metodos.Capital(var) + " " + var + ";\n\n"
        + "  @EmbeddedId\n" +
        "  @AttributeOverride(name = ID  , column = @Column(name = "
        + FIELD_FK + ", nullable = true))\n" +
        "  private " + metodos.Capital(var) + "Id  id" + metodos.Capital(var) + ";\n\n"
        + "";
}else {
  a = "\n  @ManyToOne(fetch = FetchType.LAZY)\n" +
      "  @JoinColumn(name = " + FIELD_FK
      + ", nullable = false, insertable = false, updatable = false)\n" +
      "  private " + metodos.Capital(var) + " " + var + ";\n\n"+      
      "@Id\n" + 
      "  @Column(name = "+FIELD_FK+")\n" + 
      "  private Integer  id" + metodos.Capital(var) + ";\n\n";
  
}

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

  public static String getSetEntities(ArrayList<String> fkmoVarFinal,Integer tipo) {
    String a="";
    for(String i:fkmoVarFinal) {
      String descap=metodos.Capital(i);
      String cap=metodos.Capital(i);
      if(tipo!=3) {
      
    a+= "  public "+cap+"Id getId"+cap+"() {\n" + 
        "    return id"+cap+";\n" + 
        "  }\n"
        + "  public void setId"+cap+"("+cap+"Id id"+cap+") {\n" + 
        "    this.id"+cap+" = id"+cap+";\n" + 
        "  }\n";
    }else {
      
      a+="  public "+cap+"Id getId"+cap+"() {\n" + 
          "    return new "+cap+"Id(id"+cap+");\n" + 
          "  }\n" + 
          "  public void setId"+cap+"("+cap+"Id "+descap+"Id) {\n" + 
          "    if ("+descap+"Id != null) {\n" + 
          "      id"+cap+" = "+descap+"Id.getId();\n" + 
          "    } else {\n" + 
          "      id"+cap+" = null;\n" + 
          "    }\n" + 
          "  }\n";
      
      
    }}
    return a;
  }

  public static String ManysToManys(String agg,ArrayList<String>mtmVar) {
    String a="",c="";
    int b=1;
    for(String i:mtmVar) {
    if (a.contains(i+c)) {b++;c=String.valueOf(b);}else {c="";}
    a += " \n @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)\n" + 
        "  @JoinTable(\n" + 
        "      name = TABLE_"+agg.toUpperCase()+"_"+i.toUpperCase()+c+",\n" + 
        "      joinColumns = {@JoinColumn(name = ID_"+agg.toUpperCase()+", nullable = false, updatable = false)},\n" + 
        "      inverseJoinColumns = {@JoinColumn(name = ID_"+i.toUpperCase()+", nullable = false, updatable = false)})\n" + 
        "  private Set<"+metodos.Capital(i)+"> "+i+"s"+c+";\n";

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
