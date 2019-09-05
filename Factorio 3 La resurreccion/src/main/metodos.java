package main;

import java.util.ArrayList;

public class metodos {

  public static String word(String a, int c) {
    String b = "";
    a += " ";
    int cc = 0, ccc = 0, cccc = 0;
    while (cc < c) {
      cccc++;
      if (cccc > 200) {
        return null;
      }
      b = "";
      for (int i = ccc; i < a.length(); i++) {
        if (a.charAt(i) == ' ' || i == a.length()) {
          ccc = (i + 1);
          cc++;
          break;
        }
        b += a.charAt(i);

      }
    }
    if (b.length() < 1) {
      return null;
    }
    return b;
  }

  public static String removeLast(String a) {

    a = a.substring(0, a.length() - 1);

    return a;
  }

  public static String mayusq(String a) {
    String b = "";
    b = "";
    for (int i = 0; i < a.length(); i++) {
      String aux = a.substring(i, i + 1);
      
      if (i>0&&aux.equals(aux.toUpperCase())) {
          String preaux=a.substring(i-1, i);
          if(preaux.equals(preaux.toLowerCase())) {b+="_";}
      }

      b += aux;
    }
    return b;
  }

  public static String removeSpecial(String a, char c) {
    String b = "";
    b = "";
    for (int i = 0; i < a.length(); i++) {
      if (a.charAt(i) == '`' || i == a.length()) {
      } else {
        b += a.charAt(i);
      }
    }

    return b;
  }

  public static String specialword(String a, char c) {
    String b = "";
    b = "";
    boolean ok = false;
    for (int i = 0; i < a.length(); i++) {
      if (a.charAt(i) == c) {
        ok = true;
        i++;
      }
      if (ok && (a.charAt(i) == ' ' || i == a.length())) {
        break;
      }
      if (ok) {
        b += a.charAt(i);
      }

    }
    return b;
  }

  public static String replace(String a, char c1, char c2) {

    a = a.replace(c1, c2);

    return a;
  }

  public static String varchar(String a) {

    if (a.contains("VARCHAR")) {
      return "VARCHAR";
    }
    return a;
  }

  public static String comillas(String a) {

    a = a.substring(1);
    a = a.substring(0, a.length() - 1);
    return a;
  }

  public static String despital(String a) {

    a = a.substring(0, 1).toLowerCase() + a.substring(1);

    return a;
  }

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

  public static int idByTable(String a, ArrayList<String> tablas) {
    int c = 1;
    for (String i : tablas) {
      if (i.equalsIgnoreCase(a)) {
        break;
      }
      c++;
    }

    return c;
  }

  public static String h5(String a) {

    a = "";

    return a;
  }

  public static String fi4eld(String a) {

    a = "";

    return a;
  }

  public static String f34ield(String a) {

    a = "";

    return a;
  }

  public static boolean detectManyToMany(String a) {

    if (a.substring(a.length() - 1).equalsIgnoreCase(",")) {

      return true;
    }

    return false;
  }

}
