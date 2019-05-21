/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorio_2;

import java.util.ArrayList;

/**
 *
 * @author mi
 */
public class Basicos {
    
    private String archivo;
    private int opcion;
    private String paquete,clase,auxclase;
    private String nombrebase;
    private boolean consvacio;
    private boolean cons;
    private int cp=0;
    private String map;
    private ArrayList<tabla> bases=new ArrayList<>();
    private ArrayList<pojos> poj=new ArrayList<>();
 private ArrayList<String[]> auxfore =new ArrayList<>();
  private ArrayList<maps> mapis =new ArrayList<>();

       private ArrayList<String> swi =new ArrayList<>();
       private ArrayList<Integer> opswi =new ArrayList<>();

    public ArrayList<pojos> getPoj() {
        return poj;
    }

    public void setPoj(ArrayList<pojos> poj) {
        this.poj = poj;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public ArrayList<String[]> getAuxfore() {
        return auxfore;
    }

    public void setAuxfore(ArrayList<String[]> auxfore) {
        this.auxfore = auxfore;
    }

    public ArrayList<maps> getMapis() {
        return mapis;
    }

    public void setMapis(ArrayList<maps> mapis) {
        this.mapis = mapis;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }


    public String getNombrebase() {
        return nombrebase;
    }

    public void setNombrebase(String nombrebase) {
        this.nombrebase = nombrebase;
    }       
       
    public boolean isConsvacio() {
        return consvacio;
    }

    public void setConsvacio(boolean consvacio) {
        this.consvacio = consvacio;
    }

    public boolean isCons() {
        return cons;
    }

    public void setCons(boolean cons) {
        this.cons = cons;
    }
 
    public ArrayList<tabla> getBases() {
        return bases;
    }

    public void setBases(ArrayList<tabla> bases) {
        this.bases = bases;
    }


    public ArrayList<String> getSwi() {
        return swi;
    }

    public void setSwi(ArrayList<String> swi) {
        this.swi = swi;
    }

    public ArrayList<Integer> getOpswi() {
        return opswi;
    }

    public void setOpswi(ArrayList<Integer> opswi) {
        this.opswi = opswi;
    }
    

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

  
    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

       
       
    public String getAuxclase() {
        return auxclase;
    }

    public void setAuxclase(String auxclase) {
        this.auxclase = auxclase;
    }

    
       
    public String getPaquete() {
        return paquete;
    }

    public void setPaquete(String paquete) {
        this.paquete = paquete;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }



    
}
