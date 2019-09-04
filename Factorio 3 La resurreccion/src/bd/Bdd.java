package bd;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import main.metodos;

public class Bdd {

  public static void bdd(
      Map<Integer, ArrayList<String>> fields,  Map<Integer, ArrayList<String>> foreign,
      ArrayList<String> arrayprimary,ArrayList<String> tablas,
      Map<Integer, Boolean> mtm, Map<Integer,Integer>tipo )
      throws IOException {
    ArrayList<String> feas = new ArrayList<>();

    ArrayList<String> arrayforeign=new ArrayList<>();
    ArrayList<String> arrayfields=new ArrayList<>();
    boolean in = false;
    feas.addAll(Arrays.asList("INDEX", "CONSTRAINT"));
    int ctabla = 0;

    boolean no = false;
    String aux;
    // pass the path to the file as a parameter
    FileReader fr =
        new FileReader(
            "C:\\Users\\pabcos\\Documents\\trains\\Factorio 3 La resurreccion\\src\\bd\\bd_totem.txt");

    String a = "", b = "", c = "", d = "";
    int i;
    while ((i = fr.read()) != -1) {
      if (i != ' ' && i != '\n') {
        a += (char) i;
      } else {
        if (!a.equalsIgnoreCase("")) {
          c += a + "\n";
          if (feas.contains(a) || no == true) {
            no = true;
            if (i == '\n') {
              no = false;
            }

          } else {
            aux = table(a, fr);
            if (aux != null) {
              tablas.add(aux);
              in = true;
              ctabla++;
              arrayfields = new ArrayList<>();
              arrayforeign = new ArrayList<>();
            }
            if (engine(a, fr)) {
              in = false;
              d += "\n\n";
              fields.put(ctabla, arrayfields);
              foreign.put(ctabla, arrayforeign);
            }

            if (in) {
              foreign(a, fr, arrayforeign);
              fields(a, fr, arrayfields);
              aux = null;
              d += primaries(a, fr, arrayprimary,ctabla,mtm, arrayfields,tipo);
            }
            if (i == '\n') {
              b += a + "\n";
            } else {
              b += a + "   ";
            }
          }
        }

        //              a="";}
        a = "";
      }

    }

  }

  // DETECT

  public static String table(String s, FileReader fr) throws IOException {
    int i;
    String a = "";
    if (s.equals("CREATE")) {
      while ((i = fr.read()) != (char) '.') {
        a += ((char) i);
      }

      if (!a.substring(0, 5).equalsIgnoreCase("table")) {
        return null;
      }
      a = "";
      i = fr.read();
      
      while ((i = fr.read()) != (char) '`') {
        a += ((char) i);
      }
  
      return a;
    }
    return null;
  }

  public static void foreign(String s, FileReader fr, ArrayList<String> aux) throws IOException {
    int i;
    String a = s + " ";
    if (s.equalsIgnoreCase("FOREIGN")) {
      while ((i = fr.read()) != (char) '\n') {
        a += ((char) i);
      }
      aux.add(a);
      a = "";
      while ((i = fr.read()) != (char) '\n') {
        a += ((char) i);
      }
      a = a.substring(0, 6).replaceAll(" ", "") + a.substring(6); // ta bien
      aux.add(a);
    }
  }

  public static void fields(String s, FileReader fr, ArrayList<String> arrayfields)
      throws IOException {
    int i;
    String a = s + " ";
    if (s.substring(0, 1).equalsIgnoreCase("`")) {
      while ((i = fr.read()) != (char) '\n') {
        a += ((char) i);
      }
      if(!a.contains("FK")) {//QUITAR VAR FK
      arrayfields.add(a);}
    }
  }

  public static String primaries(String s, FileReader fr, ArrayList<String> arrayPrimary,int ctabla,  Map<Integer, Boolean> mtm,ArrayList<String> arrayfields , Map<Integer,Integer>tipo )
      throws IOException {
    int i,fields=arrayfields.size();;
    String aux="";
    String a = s + " ";
    if (s.equalsIgnoreCase("PRIMARY")) {


      while ((i = fr.read()) != (char) '\n') {
        a += ((char) i);
      }
      a+=" ";
//      a=metodos.word(a,3);
//      a=metodos.comillas(a);a=metodos.comillas(a);
//      a=metodos.removeSpecial(a,'`');
      tipo.put(ctabla, 0);
      if(a.contains("`,")) {
      
        if(fields>2) {
//          System.out.println(ctabla +"   "+arrayfields); 
          tipo.put(ctabla, 1);
          mtm.put(ctabla, false);
          String aux1,aux2;
          aux1=metodos.word(a, 3);
          aux1=metodos.comillas(aux1);aux1=metodos.comillas(aux1);
          aux2=metodos.word(a, 4);
          aux2=metodos.removeLast(aux2);metodos.removeLast(aux2);aux2=metodos.removeLast(aux2);
          aux2=metodos.comillas(aux2);
          aux=aux1+" "+aux2+" ";
//          System.out.println(aux ); 
        }else {

        mtm.put(ctabla, true) ;
        String aux1,aux2;
        aux1=metodos.word(a, 3);
        aux1=metodos.comillas(aux1);aux1=metodos.comillas(aux1);
        aux2=metodos.word(a, 4);
        aux2=metodos.removeLast(aux2);metodos.removeLast(aux2);aux2=metodos.removeLast(aux2);
        aux2=metodos.comillas(aux2);
        aux=aux1+" "+aux2;

        }
        
        
        }      
      else {
        mtm.put(ctabla, false);

        aux=metodos.word(a, 3);
       

        aux=metodos.removeLast(aux);
        aux=metodos.comillas(aux);aux=metodos.comillas(aux);
      
        }      
      arrayPrimary.add(aux);
    }
    return a;
  }

  public static boolean engine(String s, FileReader fr) throws IOException {
    if (s.equals("ENGINE")) {

      return true;
    }
    return false;
  }
}
