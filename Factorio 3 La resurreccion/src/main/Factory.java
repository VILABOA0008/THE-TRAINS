package main;

import java.util.ArrayList;


public class Factory {

  public static String factory(String agg, ArrayList<String> fieldsType, ArrayList<String> fieldsVar, ArrayList<String> fkmoVarFinal) {
    String a;
    agg = metodos.Capital(agg);

    String b = "";
    for (int i = 0; i < fieldsType.size(); i++) {
      if (i != 0) {
        b += ",";
      }
      b += fieldsType.get(i) + " " + fieldsVar.get(i);
    }
    
    for (int i = 0; i < fkmoVarFinal.size(); i++) {
        b += ",";
      b +="Integer"+ " " + fieldsVar.get(i);
    }
    

    a = "import org.seedstack.business.domain.Factory;\n" +
        "\n" +
        "public interface " + agg + "Factory extends Factory<" + agg + "> {\n" +
        "  \n" +
        " "+agg+" create" + agg + "(" + b + ");\n" +
        "\n" +
        "\n" +
        "}\n" +
        "";

    return a;
  }
  
  
  public static String factoryImpl(String agg, ArrayList<String> fieldsType, ArrayList<String> fieldsVar, ArrayList<String> fkmoVarFinal) {

    
    
    agg = metodos.Capital(agg);
    

    String b = "",c="";
    for (int i = 0; i < fieldsType.size(); i++) {
      if (i != 0) {
        b += ",";
      }
      b += fieldsType.get(i) + " " + fieldsVar.get(i);
    }
    
    for (int i = 0; i < fkmoVarFinal.size(); i++) {
    
        b += ",";
        
      b +="Integer"+ " id" + metodos.Capital(fieldsVar.get(i));
    }
    
    
    
    
    for (int i = 0; i < fieldsType.size(); i++) {
 
      c += "\n  tmp"+agg+".set"+metodos.Capital(fieldsVar.get(i))+"("+fieldsVar.get(i)+")";
    }
    
    for (int i = 0; i < fieldsVar.size(); i++) {
      
      c += "\n  tmp"+agg+".setPageId(new "+fieldsVar.get(i)+"Id(id"+ metodos.Capital(fieldsVar.get(i))+"));";
    }
    
    
    
    String a="\n" + 
        "import org.seedstack.business.domain.BaseFactory; \n" + 
        "\n" + 
        "public class "+agg+"FactoryImpl extends BaseFactory<"+agg+"> implements "+agg+"Factory {\n" + 
        "\n" + 
        "  @Override\n" + 
        "  public "+agg+" create"+agg+"("+b+") {\n" + 
        "\n" + 
        "    "+agg+" tmp"+agg+" = create();\n" + 
        "\n"+c + 
        "\n" + 
        "\n    return tmp"+agg+";\n" + 
        "  }\n" + 
        "\n" + 
        "}\n" + 
        "";
a+="";

    return a;
  }
  
}
