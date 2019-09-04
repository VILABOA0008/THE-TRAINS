package main;

public class Old {
  
  public static String Resource(String agg) {
    
    String a="package com.ctag.paperless.rest."+agg.toLowerCase()+";\r\n" + 
        "\r\n" + 
        "import java.util.List; \r\n" + 
        "\r\n" + 
        "import javax.inject.Inject;\r\n" + 
        "import javax.ws.rs.GET;\r\n" + 
        "import javax.ws.rs.NotFoundException;\r\n" + 
        "import javax.ws.rs.Path;\r\n" + 
        "import javax.ws.rs.PathParam;\r\n" + 
        "import javax.ws.rs.Produces;\r\n" + 
        "import javax.ws.rs.core.Context;\r\n" + 
        "import javax.ws.rs.core.MediaType;\r\n" + 
        "import javax.ws.rs.core.UriInfo;\r\n" + 
        "\r\n" + 
        "import org.seedstack.jpa.JpaUnit;\r\n" + 
        "import org.seedstack.seed.Logging;\r\n" + 
        "import org.seedstack.seed.transaction.Transactional;\r\n" + 
        "import org.slf4j.Logger;\r\n" + 
        "\r\n" + 
        "import com.ctag.paperless.annotations.JpaFinder;\r\n" + 
        "import com.ctag.paperless.utils.Config;\r\n" + 
        "import com.ctag.paperless.utils.QueryStringParameters;\r\n" + 
        "\r\n" + 
        "import io.swagger.annotations.Api;\r\n" + 
        "\r\n" + 
        "@Api\r\n" + 
        "@Path("+agg+"Resource.REST_API)\r\n" + 
        "@Transactional\r\n" + 
        "@JpaUnit(Config.JPA_UNIT)\r\n" + 
        "@Produces({MediaType.APPLICATION_JSON, \"application/hal+json\"})\r\n" + 
        "public class "+agg+"Resource {\r\n" + 
        "\r\n" + 
        "  public static final String "+agg.toUpperCase()+"_ID = \""+agg+"_ID\";\r\n" + 
        "  public static final String "+agg.toUpperCase()+"_PARAM_URL = \"/{\" + "+agg.toUpperCase()+"_ID + \"}\";\r\n" + 
        "  static final String REST_API = \"/"+agg.toLowerCase()+"\";\r\n" + 
        "  private final "+agg+"Finder finder;\r\n" + 
        "\r\n" + 
        "  @Logging private Logger logger;\r\n" + 
        "  @Context private UriInfo uriInfo;\r\n" + 
        "\r\n" + 
        "  @Inject\r\n" + 
        "  "+agg+"Resource(@JpaFinder final "+agg+"Finder finder) {\r\n" + 
        "    this.finder = finder;\r\n" + 
        "  }\r\n" + 
        "\r\n" + 
        "  @GET\r\n" + 
        "  @Transactional\r\n" + 
        "  @JpaUnit(Config.JPA_UNIT)\r\n" + 
        "  @Path("+agg.toUpperCase()+"_PARAM_URL)\r\n" + 
        "  public "+agg+"Representation get"+agg+"ById(\r\n" + 
        "      @PathParam("+agg.toUpperCase()+"_ID) final Integer id"+agg+") {\r\n" + 
        "\r\n" + 
        "    final "+agg+"Representation "+metodos.despital(agg)+" = finder.findById(id"+agg+");\r\n" + 
        "    if ("+metodos.despital(agg)+" == null) {\r\n" + 
        "      throw new NotFoundException(\""+agg+" not found\");\r\n" + 
        "    }\r\n" + 
        "    return "+metodos.despital(agg)+";\r\n" + 
        "  }\r\n" + 
        "}\r\n" + 
        "";
    
    
    
    
    return a;
  }
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


