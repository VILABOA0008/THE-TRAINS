package prubabd.main;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map; 
public class main {

  public static void main(String[] args) throws IOException {
    Map<Integer, ArrayList<String>> fields = new HashMap<Integer, ArrayList<String>>();
    ArrayList<String>arrayfields=new ArrayList<>();
    Map<Integer, ArrayList<String>> foreign = new HashMap<Integer, ArrayList<String>>();
    ArrayList<String>arrayforeign=new ArrayList<>();
    ArrayList<String>arrayprimary=new ArrayList<>();
    ArrayList<String>tablas=new ArrayList<>();
   ArrayList<String>feas=new ArrayList<>();


   boolean in=false;
   feas.addAll(
       Arrays.asList(
           "INDEX", "CONSTRAINT"));
   int ctabla=0;
   
boolean no=false;
String aux;
        // pass the path to the file as a parameter 
        FileReader fr = 
          new FileReader("C:\\Users\\pabcos\\Documents\\trains\\prubabd\\src\\prubabd\\main\\bd.txt"); 
        
        
      String a="",b="",c="",d="";
        int i; 
        while ((i=fr.read()) != -1) {
          if(i!=' '&&i!='\n' ) {a+=(char)i;}else {
            if(!a.equalsIgnoreCase("")) {
              c+=a+"\n";
              if(feas.contains(a)||no==true) {no=true;
              if(i=='\n' ) {no=false;}
              
              
              }else {
                aux=table(a, fr); if(aux!=null) {   tablas.add(aux);in=true;ctabla++;arrayfields=new ArrayList<>();arrayforeign=new ArrayList<>();}
                if(engine(a, fr)) {in=false;d+="\n\n";fields.put(ctabla,arrayfields);foreign.put(ctabla,arrayforeign);}
               
                if(in) {
                  foreign(a, fr, arrayforeign);         
                fields(a, fr,arrayfields);          
                aux=null;
                d+=primaries(a, fr, arrayprimary);
                }
              if(i=='\n' ) {
                b+=a+"\n";
              }else {
                b+=a+"   ";
              }
              }
              }
              
//              a="";}
            a="";
          
          }
      
        //  System.out.print((char) i); 
      }
        int cc=1;
        System.out.println("PREUBAS\n\n\n" ); 
  System.out.println(b);      
  System.out.println("\n\n\nTABLAS\n" ); 


for(String q:tablas) {
  System.out.println("\n"+q);
  fields.get(cc).forEach(n->System.out.println(n));
  System.out.println("            FOREIGN");
  foreign.get(cc).forEach(n->System.out.println(n));
  System.out.println("             PRIMARY");
 System.out.println(arrayprimary.get(cc-1));
  cc++;
}

  
  
  }
  
  //DETECT
  
  public static String table(String s,     FileReader  fr) throws IOException {
int i;
String a="";
    if(s.equals("CREATE")) {
      while ((i=fr.read()) !=(char)'.' ) {
        a+=((char) i);
      }
      
      if(!a.substring(0,5).equalsIgnoreCase("table")) {return null;}
      a="";
      i=fr.read();
      while ((i=fr.read()) !=(char)'`' ) {
        a+=((char) i);
      }
      
      return a;}
      return null;
  }
  
  public static void foreign(String s,     FileReader  fr,ArrayList<String>aux) throws IOException {
int i;
String a=s+" ";
    if(s.equalsIgnoreCase("FOREIGN")) {
      while ((i=fr.read()) !=(char)'\n' ) {
        a+=((char) i);
      }
      aux.add(a);
      a="";
      while ((i=fr.read()) !=(char)'\n' ) {
        a+=((char) i);
      }
      a=a.substring(0, 6).replaceAll(" ","")+a.substring(6);  //ta bien
      aux.add(a);

    }

  }
  
  public static void fields(String s,     FileReader  fr,ArrayList<String>arrayfields) throws IOException {
int i;
String a=s+" ";
    if(s.substring(0,1).equalsIgnoreCase("`")) {
      while ((i=fr.read()) !=(char)'\n' ) {
        a+=((char) i);
      }

      arrayfields.add(a);
    }

  }

  public static String primaries(String s,     FileReader  fr,ArrayList<String>arrayPrimary) throws IOException {
    int i;
    String a=s+" ";
    if(s.equalsIgnoreCase("PRIMARY")) {
      while ((i=fr.read()) !=(char)'\n' ) {
        a+=((char) i);
      }
      
      arrayPrimary.add(a);
    }
    return a;
    
  }
  
  public static boolean engine(String s,     FileReader  fr) throws IOException {
if(s.equals("ENGINE")) {

      return true;}
      return false;
  }
  
}
