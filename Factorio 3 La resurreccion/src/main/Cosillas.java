package main;

public class Cosillas {

  String Agg, agg, AGG;

  public Cosillas(String Agg) {
    this.Agg = Agg;
    this.agg = metodos.despital(Agg);
    this.AGG = Agg.toUpperCase();
  }

  public void constructor() {

    String a = "  private final FluentAssembler fluentAssembler;\r\n" +
        "  private static final String EXCEPTION = \"Error while updating a " + agg + "\";\r\n" +
        "  @Logging\r\n" +
        "  private Logger logger;\r\n" +
        "\r\n" +
        "  private final Repository<" + Agg + ", " + Agg + "Id> repository;\r\n" +
        "  @Context\r\n" +
        "  private UriInfo uriInfo;\r\n" +
        "\r\n" +
        "  @Inject\r\n" +
        "  " + Agg + "Resource(\r\n" +
        "      @JpaFinder final " + Agg + "Finder finder,\r\n" +
        "      final FluentAssembler fluentAssembler,\r\n" +
        "      final Repository<" + Agg + ", " + Agg + "Id> repository) {\r\n" +
        "    this.finder = finder;\r\n" +
        "    this.fluentAssembler = fluentAssembler;\r\n" +
        "    this.repository = repository;\r\n" +
        "  }";

    System.out.println(a);
  }

  public void getAll() {

    String a = "  \r\n" +
        "  @GET\r\n" +
        "  @Transactional\r\n" +
        "  @JpaUnit(Config.JPA_UNIT)\r\n" +
        "  @Produces(MediaType.APPLICATION_JSON)\r\n" +
        "  public List<" + Agg + "Representation> getAll" + Agg + "() {\r\n" +
        "    return finder.findAll" + Agg + "();\r\n" +
        "  }\r\n" +
        "";

    System.out.println(a);
  }
  

  public void getAllWithFiltersResource(String params) {

    String[] parameters = params.split(",");
    String b = "";
    String query="";
    for (int i = 0; i < parameters.length; i++) {
      String var=parameters[i].split(" ")[1];
      String type=parameters[i].split(" ")[0];
      query +="@QueryParam(\""+var+"\") "+ type+" "+var;
      b += var;
      if (i != parameters.length - 1) {
        b += ",";query+=",";
      }
    }

    String a = "  \r\n" +
        "  @GET\r\n" +
        "  @Transactional\r\n" +
        "  @JpaUnit(Config.JPA_UNIT)\r\n" +
        "  @Produces(MediaType.APPLICATION_JSON)\r\n" +
        "  public List<" + Agg + "Representation> findAll" + Agg + "WithFilters(" + query
        + ") {\r\n" +
        "    return finder.findAll" + Agg + "WithFilters(" + b + ");\r\n" +
        "  }\r\n" +
        "";

    System.out.println(a);
  }

  public void getAllFinder() {

    String a = "  @Override\r\n" +
        "  public List<" + Agg + "Representation> findAll" + Agg + "() {\r\n" +
        "\r\n" +
        "    final CriteriaBuilder cb = entityManager.getCriteriaBuilder();\r\n" +
        "    final CriteriaQuery<" + Agg + "> q = cb.createQuery(" + Agg + ".class);\r\n" +
        "\r\n" +
        "    q.select(q.from(" + Agg + ".class));\r\n" +
        "\r\n" +
        "    final List<" + Agg + "> " + agg + "= entityManager.createQuery(q).getResultList();\r\n"
        +
        "\r\n" +
        "    return fluentAssembler.assemble(" + agg + ").to(" + Agg + "Representation.class);\r\n"
        +
        "  }";

    System.out.println(a);
  }

  public void getAllFinderWithParams(String params) {

    String[] parameters = params.split(",");
    String b = "";
    for (int i = 0; i < parameters.length; i++) {
      String var = parameters[i].split(" ")[1];
      String type = parameters[i].split(" ")[0];

      b += "    if (" + var + " != null) {\r\n" +
          "      predicates.add(cb.equal(root" + Agg + ".get(" + Agg + "_." + var + "), " + var
          + "));\r\n" +
          "    }\n";
    }

    String a = "  @Override\r\n" +
        "  public List<" + Agg + "Representation> findAll" + Agg + "WithFilters(" + params + ") {\r\n" +
        "\r\n" +
        "    final CriteriaBuilder cb = entityManager.getCriteriaBuilder();\r\n" +
        "    final CriteriaQuery<" + Agg + "> q = cb.createQuery(" + Agg + ".class);\r\n" +
        "\r\n" +
        "    final List<Predicate> predicates = new ArrayList<>();" +
        "    Root<" + Agg + "> root" + Agg + "= q.from(" + Agg + ".class);\r\n" +
        "    q.select(root" + Agg + ");\r\n\n" +
        "" + b +
        "\r\n" +
        "    if (!predicates.isEmpty()) {\r\n" +
        "      q.where(predicates.toArray(new Predicate[] {}));\r\n" +
        "    }\n\n"+
        "final List<" + Agg + "> " + agg + "= entityManager.createQuery(q).getResultList();\r\n"
        +
        "\r\n" +
        "    return fluentAssembler.assemble(" + agg + ").to(" + Agg + "Representation.class);\r\n"
        +
        "  }";

    System.out.println(a);
  }

  public void create() {

    String a = "  @POST\r\n" +
        "  @Transactional\r\n" +
        "  @JpaUnit(Config.JPA_UNIT)\r\n" +
        "  @Produces(MediaType.APPLICATION_JSON)\r\n" +
        "  @Consumes(MediaType.APPLICATION_JSON)\r\n" +
        "  public " + Agg + "Representation create" + Agg + "(final " + Agg + "Representation new"
        + Agg + ") {\r\n" +
        "    final " + Agg + " " + agg + "= fluentAssembler.merge(new" + Agg + ").into(" + Agg
        + ".class).fromFactory();\r\n" +
        "    repository.persist(" + agg + ");\r\n" +
        "    return fluentAssembler.assemble(" + agg + ").to(" + Agg + "Representation.class);\r\n"
        +
        "  }";

    System.out.println(a);

  }

  public void Finder(String params) {

    String a = "";

    if (!params.isEmpty()) {
      a += " List<" + Agg + "Representation> findAll" + Agg + "WithFilters(" + params + ");";
    } else {
      a = " List<" + Agg + "Representation> findAll" + Agg + "();";
    }

    System.out.println(a);
  }

  public void update() {

    String a = "  @PUT\r\n" +
        "  @Transactional\r\n" +
        "  @JpaUnit(Config.JPA_UNIT)\r\n" +
        "  @Produces(MediaType.APPLICATION_JSON)\r\n" +
        "  @Consumes(MediaType.APPLICATION_JSON)\r\n" +
        "  @Path(" + AGG + "_PARAM_URL)\r\n" +
        "  public " + Agg + "Representation update" + Agg + "(\r\n" +
        "      final " + Agg + "Representation updated" + Agg + ",\r\n" +
        "      @PathParam(" + AGG + "_ID) final Integer " + agg + "Id) {\r\n" +
        "    if (!updated" + Agg + ".getId" + Agg + "().equals(" + agg + "Id)) {\r\n" +
        "      throw new NotFoundException(EXCEPTION);\r\n" +
        "    }\r\n" +
        "\r\n" +
        "    " + Agg + " " + agg + ";\r\n" +
        "    try {\r\n" +
        "      " + agg + " = fluentAssembler.merge(updated" + Agg + ").into(" + Agg
        + ".class).fromRepository()\r\n"
        +
        "          .orFail();\r\n" +
        "    } catch (final AggregateNotFoundException ex) {\r\n" +
        "      logger.debug(\"Aggregate already exists\", ex);\r\n" +
        "      throw new NotFoundException(EXCEPTION);\r\n" +
        "    }\r\n" +
        "    " + agg + " = repository.save(" + agg + ");\r\n" +
        "    if (" + agg + " == null) {\r\n" +
        "      throw new NotFoundException(EXCEPTION);\r\n" +
        "    }\r\n" +
        "    return fluentAssembler.assemble(" + agg + ").to(" + Agg + "Representation.class);\r\n"
        +
        "  }";

    System.out.println(a);
  }

}
