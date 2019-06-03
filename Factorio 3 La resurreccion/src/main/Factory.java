package main;

import java.util.ArrayList;

import textos.Agregadospeques;

public class Factory {

  public static String factory(String agg, ArrayList<String> fieldsType,
      ArrayList<String> fieldsVar, ArrayList<String> fkmoVarFinal) {
    String a="";
    agg = metodos.Capital(agg);
    
    a+=Agregadospeques.paqueteAgg(agg);

    String b = "";
    for (int i = 0; i < fieldsType.size(); i++) {
      if (i != 0) {
        b += ",";
      }
      b += fieldsType.get(i) + " " + fieldsVar.get(i);
    }

    for (int i = 0; i < fkmoVarFinal.size(); i++) {
      b += ",";
      b += "Integer" + " id" + metodos.Capital(fkmoVarFinal.get(i));
    }

    a += "import org.seedstack.business.domain.Factory;\n" +
        "\n" +
        "public interface " + agg + "Factory extends Factory<" + agg + "> {\n" +
        "  \n" +
        " " + agg + " create" + agg + "(" + b + ");\n" +
        "\n" +
        "\n" +
        "}\n" +
        "";

    return a;
  }

  public static String factoryImpl(String agg, ArrayList<String> fieldsType,
      ArrayList<String> fieldsVar, ArrayList<String> fkmoVarFinal) {

    agg = metodos.Capital(agg);
    String a="";
    a+=Agregadospeques.FactoryImplPackage(agg);
    
    String b = "", c = "";
    for (int i = 0; i < fieldsType.size(); i++) {
      if (i != 0) {
        b += ",";
      }
      b += fieldsType.get(i) + " " + fieldsVar.get(i);
    }

    for (int i = 0; i < fkmoVarFinal.size(); i++) {
      b += ",";
      b += "Integer" + " id" + metodos.Capital(fkmoVarFinal.get(i));
    }

    for (int i = 0; i < fieldsType.size(); i++) {

      c += "\n  tmp" + agg + ".set" + metodos.Capital(fieldsVar.get(i)) + "(" + fieldsVar.get(i)
          + ");";
    }

    for (int i = 0; i < fkmoVarFinal.size(); i++) {

      c += "\n  tmp" + agg + ".setId"+ metodos.Capital(fkmoVarFinal.get(i)) +"(new "
          + metodos.Capital(fkmoVarFinal.get(i)) + "Id(id"
          + metodos.Capital(fkmoVarFinal.get(i)) + "));";
    }

     a += "\n" +
        "import org.seedstack.business.domain.BaseFactory; \n" +
        "\n" +
        "public class " + agg + "FactoryImpl extends BaseFactory<" + agg + "> implements " + agg
        + "Factory {\n" +
        "\n" +
        "  @Override\n" +
        "  public " + agg + " create" + agg + "(" + b + ") {\n" +
        "\n" +
        "    " + agg + " tmp" + agg + " = create();\n" +
        "\n" + c +
        "\n" +
        "\n    return tmp" + agg + ";\n" +
        "  }\n" +
        "\n" +
        "}\n" +
        "";
    a += "";

    return a;
  }

}
