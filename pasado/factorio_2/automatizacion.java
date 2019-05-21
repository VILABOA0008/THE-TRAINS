/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorio_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author mi
 */
public class automatizacion {  
    
  public static void autommatizacion (Basicos b,String tipo){ 
  String a="";
  boolean si=false;
  int op;
 
switch(tipo){
    case "abmc":        
  b.getSwi().add("Altas");
    b.getSwi().add("Bajas");
      b.getSwi().add("Modificaciones");
        b.getSwi().add("Consultas");
            b.getSwi().add("Main");
        b.getSwi().add("Comprobaciones");si=true;break;
    case "pojo":a=pojos(b);si=false;escribir(b, a,'j');break;
    case"base":a=base(b);si=false;escribir(b, a,'j');break;
    case"mapeo":si=false;escribir(b, b.getMap(),'m');break;
}
if(si){
  for(int i=0;i<b.getSwi().size();i++){
        b.setAuxclase(b.getSwi().get(i));
         System.out.println("alalal  "+b.getSwi().get(i));System.out.println(i);
switch(b.getSwi().get(i)){
   
    case "Comprobaciones":a=comprobaciones(b);break;
    case "Main":a=main(b);break;
    case "Bajas":
    case "Modificaciones":;
    case "Consultas":;
    case "Altas":op=b.getOpswi().get(i);a=altas(b,op);break;

}escribir(b, a,'j');}}
   
 

  //borrar(b);
     b.getSwi().clear();
  }
    public static void borrar(Basicos b){
        
        System.out.println("clase "+b.getClase());
      File archivo=new File(b.getArchivo()+"/"+b.getClase());      
        System.out.println("arc  "+  archivo.getPath());
        archivo.delete();

    }
  
  public static void escribir(Basicos b,String a,char c){
      

    File archivo=new File(b.getArchivo()+"/"+peques.crearclase(b.getAuxclase(),c));  
      int response =1;
         if(archivo.exists()){
                  response = JOptionPane.showConfirmDialog(null, "LA CLASE "+b.getAuxclase()+" EXISTE QUIERE SOBREESCRIBIR?", "Confirm",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);}
    if (!archivo.exists()||response == JOptionPane.YES_OPTION) {
      
    try {
      FileWriter aWriter = new FileWriter(archivo, false);     
      aWriter.write(a);   
      aWriter.flush();      
      aWriter.close();
      JOptionPane.showMessageDialog(null,    "COSA  CREADA");
      }
    catch(IOException e){      
         JOptionPane.showMessageDialog(null, "Ruta Erronea Cambiela Plis.",  "ERROR",  JOptionPane.ERROR_MESSAGE);       
      }
         }

     
  }

    public static String comprobaciones (Basicos b){ 
  
  String a=peques.paquete(b.getPaquete());
  a+=peques.importcomprobaciones();
  a+=peques.publiclas(b.getAuxclase());
  //a+=b.getStati(b.getAuxclase());
  a+=Grandes.comprobaciones();
      
 return a;
  }
      public static String main (Basicos b){ 

  String a=peques.paquete(b.getPaquete());
  a+=peques.impoerdriver();
 // a+=b.getImcomprobaciones();
  a+="\n public class "+b.getAuxclase()+"{\n \n";
  a+=peques.stati(b.getAuxclase().toLowerCase()+"(String[] args) {");
  a+=peques.driver();
  a+=Grandes.main();
  a+=peques.llave(2);
      
 return a;
  }
              public static String base (Basicos b){ 
            
                   System.out.println("baseee");
  String a=peques.paquete(b.getPaquete());
  a+=Grandes.crearbase(b.getNombrebase(),b.getAuxclase());
  for(tabla i:b.getBases()){
  a+=peques.creartabla(i.getT(), i.getNombre());
    for( String[] j:i.getF()){
  a+=peques.foreing(j); }  
a+=peques.primary(i.getKey());

  }
a+=peques.catchsql();
a+=peques.llave(1);
return a;
}
      
      
               public static String pojos (Basicos b){ 
                   System.out.println("pojosssss");
  String a=peques.paquete(b.getPaquete());

  a+="\n public class "+b.getAuxclase()+"{\n \n";

for(String[]i:b.getPoj().get(b.getCp()).getP()){
a+=peques.privat(i[1],i[0]);
}


 ArrayList<String> t=new ArrayList<>();
 ArrayList<String> n=new ArrayList<>();
if(b.isCons()){  

for(String[]i:b.getPoj().get(b.getCp()).getP()){
    if(i[4].equalsIgnoreCase("Si")){
n.add(i[0]);t.add(i[1]);}}
    
      a+=Grandes.constructor(t, n,b.getAuxclase());}


if(b.isConsvacio()){a+=peques.constructorsin(b.getAuxclase());}
a+="\n\n";
for(String[]i:b.getPoj().get(b.getCp()).getP()){
     if(i[2].equalsIgnoreCase("Si")){a+=peques.get(i[1],i[0] );}
     if(i[3].equalsIgnoreCase("Si")){a+=peques.set(i[1],i[0] );}
}


 a+=peques.llave(1);
 return a;
  }
            public static String altas (Basicos b,int op){ 

  String a=peques.paquete(b.getPaquete());
 // a+=b.getImcomprobaciones();

  a+="\n public class "+b.getAuxclase()+"{\n \n";
  a+=peques.stati(b.getAuxclase().toLowerCase()+"(){");
  a+=Grandes.abmc(op, b);
  System.out.println("alalal222");
  //a+=Grandes.comprobaciones();
 a+=peques.llave(2);
 return a;
  }

}

