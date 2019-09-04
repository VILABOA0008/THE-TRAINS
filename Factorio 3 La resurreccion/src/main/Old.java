package main;

public class Old {
  
  public static String finder(String agg) {

    
    String a="package com.ctag.paperless.rest."+agg.toLowerCase()+";\r\n" + 
        "\r\n" + 
        "import org.seedstack.business.finder.Finder;\r\n" + 
        "\r\n" + 
        "@Finder\r\n" + 
        "public interface "+agg+"Finder {\r\n" + 
        "\r\n" + 
        "  "+agg+"Representation findById(Integer id);\r\n\n" + 
        "}\r\n"; 
        
    return a;
    
  }

  
    
    
  public static String jpaFinder(String agg) {
    
    String a="package com.ctag.paperless.application.infrastructure.jpa."+agg.toLowerCase()+";\r\n" + 
        "\r\n" + 
        "import javax.persistence.EntityManager;\r\n" + 
        "\r\n" + 
        "import org.seedstack.business.assembler.FluentAssembler;\r\n" + 
        "import org.seedstack.business.domain.Repository;\r\n" + 
        "import org.seedstack.jpa.JpaUnit;\r\n" + 
        "import org.seedstack.seed.transaction.Transactional;\r\n" + 
        "\r\n" + 
        "import com.ctag.paperless.annotations.JpaFinder;\r\n" + 
        "import com.ctag.paperless.utils.Config;\r\n" + 
        "import com.google.inject.Inject;\r\n" + 
        "\r\n" + 
        "@Transactional\r\n" + 
        "@JpaUnit(Config.JPA_UNIT)\r\n" + 
        "@JpaFinder\r\n" + 
        "public class "+agg+"JpaFinder implements "+agg+"Finder {\r\n" + 
        "\r\n" + 
        "  private final EntityManager entityManager;\r\n" + 
        "\r\n" + 
        "  private final FluentAssembler fluentAssembler;\r\n" + 
        "\r\n" + 
        "  private final Repository<"+agg+", "+agg+"Id> repository;\r\n" + 
        "\r\n" + 
        "  @Inject\r\n" + 
        "  "+agg+"JpaFinder(\r\n" + 
        "      final FluentAssembler assembler,\r\n" + 
        "      final Repository<"+agg+", "+agg+"Id> repository,\r\n" + 
        "      final EntityManager entityManager) {\r\n" + 
        "    this.repository = repository;\r\n" + 
        "    fluentAssembler = assembler;\r\n" + 
        "    this.entityManager = entityManager;\r\n" + 
        "  }\r\n" + 
        "\r\n" + 
        "  @Override\r\n" + 
        "  public "+agg+"Representation findById(final Integer id) {\r\n" + 
        "\r\n" + 
        "    final "+agg+" element = repository.load(new "+agg+"Id(id));\r\n" + 
        "    if (element == null) {\r\n" + 
        "      return null;\r\n" + 
        "    }\r\n" + 
        "\r\n" + 
        "    return fluentAssembler.assemble(element).to("+agg+"Representation.class);\r\n" + 
        "  }\r\n" + 
        "}\r\n" + 
        "";
    
    
    
    return a;
  }

}


