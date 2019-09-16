package textos;

import java.util.ArrayList;

import main.metodos;

public class Agregadospeques {

  public static String finalFields(String FIELD, String var) {
    String a;
    a = "\nprivate static final String " + FIELD + " = \"" + metodos.Capital(var) + "\";";

    return a;
  }

  private Integer idPart;

  public static String finalFk(String var) {
    String a;
    a = "   \npublic static final String "
        + var.toUpperCase()
        + " = \""
        + metodos.Capital(var)
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
    a = "   \npublic static final String TABLE_NAME = \"" + var + "\";";

    return a;
  }

  public static String finalManytoMany(String agg, String clase, String id, String tabla) {

    String a = "";

    a += "   \nprivate static final String TABLE_"
        + agg.toUpperCase()
        + "_"
        + clase.toUpperCase()
        + " = \""
        + tabla
        + "\";";

    return a;
  }

  public static String finalManytoManyId(String agg, String clase, String id, String tabla) {
    String a = "   \nprivate static final String ID_" + clase.toUpperCase() + " = \"" + id + "\";";

    return a;
  }

  public static String finalGenerator(String agg) {
    String a;
    a = "   \nprivate static final String GENERATOR = \"" + agg + "Gen\";\n\n";

    return a;
  }

  public static String basicVar(String FIELD, String tipo, String var) {
    String a;
    a = "\n  @Column(name = "
        + FIELD
        + ",unique = false,  nullable = false)\n"
        + "  private "
        + tipo
        + " "
        + var
        + ";\n";

    return a;
  }

  public static String finalId(String ID, String id) {
    String a;
    a = "\nprivate static final String "
        + ID
        + " = \" "
        + id
        + " \";";

    return a;
  }

  public static String ID() {
    String a;
    a = "\nprivate static final String ID = \"id\"; \n";
    return a;
  }

  public static String tableStatic() {
    String a;
    a = "private static final String KEY_VAL = \"KeyVal\";\n"
        + "private static final String SEQUENCE = \"SEQUENCE\";\n"
        + "private static final String VALUE = \"Value\";";

    return a;
  }

  public static String constructorEmpty(String agg) {
    String a;
    a = "\n  " + agg + "() {\n" + "    // Required by Hibernate\n" + "  }\n";

    return a;
  }

  public static String importBlob() {

    return "import com.mysql.cj.jdbc.Blob;";
  }

  public static String importAgg(String agg, String url) {

    String a = url + "domain.model." + agg.toLowerCase() + "." + agg;

    return a;
  }

  public static String importsMto(ArrayList<Integer> mto, ArrayList<Integer> otm,
      ArrayList<String> tablas, String url) {
    String a = "";
    if (mto != null) {
      for (Integer i : mto) {
        String mtoAgg = tablas.get(i);
        a += url + "domain.model." + mtoAgg.toLowerCase() + "." + mtoAgg + "Id;\n" +
            url + "domain.model." + mtoAgg.toLowerCase() + "." + mtoAgg + ";\n";
      }
    }
    if (otm != null) {
      for (Integer i : otm) {
        String otmAgg = tablas.get(i);
        a += "import ctag.domain.model." + otmAgg.toLowerCase() + "." + otmAgg + "Id;\n" +
            "import ctag.domain.model." + otmAgg.toLowerCase() + "." + otmAgg + ";\n";
      }
    }

    return a;

  }

  public static String imports() {
    String a;
    a = "import java.util.Collections;\n"
        + "import java.util.HashSet;\n"
        + "import java.util.Set;\n"
        + "import javax.persistence.AttributeOverride;\n"
        + "import javax.persistence.CascadeType;\n"
        + "import javax.persistence.Column;\n"
        + "import javax.persistence.EmbeddedId;\n"
        + "import javax.persistence.Entity;\n"
        + "import javax.persistence.FetchType;\n"
        + "import javax.persistence.GeneratedValue;\n"
        + "import javax.persistence.GenerationType;\n"
        + "import javax.persistence.Id;\n"
        + "import javax.persistence.IdClass;\n"
        + "import javax.persistence.JoinColumn;\n"
        + "import javax.persistence.ManyToOne;\n"
        + "import javax.persistence.OneToMany;\n"
        + "import javax.persistence.JoinTable;\n"
        + "import javax.persistence.ManyToMany;\n"
        + "import javax.persistence.Table;\n"
        + "import javax.persistence.TableGenerator;\n"
        + "import org.seedstack.business.domain.BaseAggregateRoot;\n\n";

    return a;
  }

  public static String acabalo() {
    String a;
    a = "\n\n}";

    return a;
  }

  public static String paqueteAgg(String agg) {
    String a;
    a = "package ctag.domain.model." + agg.toLowerCase() + ";\n\n";

    return a;
  }

  public static String importsId() {
    String a;
    a = "import javax.persistence.Embeddable;\n"
        + "import org.seedstack.business.domain.BaseValueObject;\n";

    return a;
  }

  public static String getBasics(ArrayList<String> types, ArrayList<String> vars) {
    String a = "";
    int c = 0;
    String type;
    for (String var : vars) {
      type = types.get(c);
      a += "  public "
          + type
          + " get"
          + metodos.Capital(var)
          + "() {\n"
          + "    return "
          + var
          + ";\n"
          + "  }\n";
      c++;
    }
    return a;
  }

  public static String setBasics(ArrayList<String> types, ArrayList<String> vars) {
    String a = "";
    int c = 0;
    String type;
    for (String var : vars) {
      type = types.get(c);
      a += "  public void set"
          + metodos.Capital(var)
          + "("
          + type
          + " "
          + var
          + ") {\n"
          + "    this."
          + var
          + " = "
          + var
          + ";\n"
          + "  }\n";
      c++;
    }
    return a;
  }

  public static String getIdBaseEntity(String Agg, ArrayList<String> primaryKeys) {
    String a;
    String b = "";
    for (int i = 0; i < primaryKeys.size(); i++) {

      b += "get" + primaryKeys.get(i) + "Id().getId()";
      if (i != primaryKeys.size() - 1) {
        b += ",";
      }

    }

    a = "    @Override\n" +
        "  public " + Agg + "Id getId() {\n" +
        "    return new " + Agg + "Id(" + b + ");\n" +
        "\n" +
        "  }";

    return a;
  }

  public static String getId(String Agg) {
    String a;
    a = "  @Override\n"
        + "  public "
        + metodos.aggId(Agg)
        + " getId() {\n"
        + "    return new "
        + metodos.aggId(Agg)
        + "(id);\n"
        + "  }\n\n";

    return a;
  }

  public static String finalManytoManyMapped(String clase, String map) {
    String a = "";

    a += "   \nprivate static final String MAPPED_BY_"
        + map.toUpperCase()
        + " = \""
        + metodos.despital(clase)
        + "\";";

    return a;
  }

  public static String manyToManyMappedBy(String Agg, ArrayList<String> mapped) {
    String a = "", c = "";
    int b = 1;

    for (String i : mapped) {
      if (a.contains(i + c)) {
        b++;
        c = String.valueOf(b);
      } else {
        c = "";
      }
      a += "  \n@ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY, mappedBy =  MAPPED_BY_"
          + i.toUpperCase()
          + c + ")\n"
          + "  private Set<"
          + metodos.Capital(i)
          + "> "
          + i
          + "s" + c + ";\n";
    }
    return a;
  }

  public static String DtoPackage(String agg) {
    String a;
    a = "package ctag.dtos.dto." + agg.toLowerCase() + ";\n\n";

    return a;
  }

  public static String CreateDtoImport(String importAgg) {
    String a;
    a = "\n" + importAgg + ";\n" +
        "import org.seedstack.business.assembler.DtoOf; \n" +
        "import org.seedstack.business.assembler.FactoryArgument;\n" +
        "import com.fasterxml.jackson.annotation.JsonProperty;\n" +
        "import io.swagger.annotations.ApiModel;\n" +
        "import io.swagger.annotations.ApiModelProperty;\n";

    return a;
  }

  public static String DtoImport() {
    String a;
    a = "\nimport org.seedstack.business.assembler.AggregateId;\n" +
        "import com.fasterxml.jackson.annotation.JsonIgnore;\n" +
        "import com.fasterxml.jackson.annotation.JsonProperty;\n" +
        "import io.swagger.annotations.ApiModel;";

    return a;
  }

  public static String AssemblerPackage(String agg) {
    String a;
    a = "  package ctag.dtos.assembler." + agg.toLowerCase() + ";\n" +
        "\n";

    return a;
  }

  public static String CreateAssemblerImport(String importAgg) {
    String a;
    a = importAgg + ";\n" +
        "import org.seedstack.business.assembler.BaseAssembler;\n";

    return a;
  }

  public static String AssemblerImport(String importAgg) {
    String a;
    a = importAgg + ";\n" +
        "import javax.inject.Inject; \n" +
        "import org.seedstack.business.assembler.Assembler;\n" +
        "import org.seedstack.business.assembler.BaseAssembler;\n";

    return a;
  }

  public static String FactoryImplPackage(String agg) {
    String a;
    a = "package ctag.application.factoryimpl." + agg.toLowerCase() + ";\n\n";

    return a;
  }

  public static String dgr(String Agg, String tabla) {
    String a;
    a = "";

    return a;
  }

  public static String dg(String Agg, String tabla) {
    String a;
    a = "";

    return a;
  }

  public static String gd(String Agg, String tabla) {
    String a;
    a = "";

    return a;
  }

}
