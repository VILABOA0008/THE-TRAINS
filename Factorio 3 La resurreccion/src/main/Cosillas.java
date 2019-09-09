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

    System.err.println(a);
  }

  public void getAll() {

    String a = "  \r\n" +
        "  @GET\r\n" +
        "  @Transactional\r\n" +
        "  @JpaUnit(Config.JPA_UNIT)\r\n" +
        "  @Produces(MediaType.APPLICATION_JSON)\r\n" +
        "  public List<" + Agg + "Representation> get" + Agg + "() {\r\n" +
        "    return finder.findAll" + Agg + "();\r\n" +
        "  }\r\n" +
        "";

    System.err.println(a);
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

    System.err.println(a);

  }

  public void Finder() {

    String a = " List<" + Agg + "Representation> findAll" + Agg + "();";

    System.err.println(a);
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

    System.err.println(a);
  }

}
