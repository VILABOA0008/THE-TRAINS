package main;

public class metodos {

  public static String Capital(String a) {

    a = a.substring(0, 1).toUpperCase() + a.substring(1);

    return a;
  }

  public static String aggId(String a) {

    a = a + "Id";

    return a;
  }

  public static String field(String a) {

    a = "FIELD_" + a.toUpperCase();

    return a;
  }

}
