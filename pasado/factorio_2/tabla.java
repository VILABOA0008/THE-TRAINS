/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorio_2;

import java.util.ArrayList;

/**
 *
 * @author a16pablovc
 */
public class tabla {
    private String nombre,key;
        private boolean ke=false;
    private String[] keys;
   private ArrayList<String[]> t=new ArrayList<>();
   private ArrayList<String[]> f=new ArrayList<>();

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ArrayList<String[]> getF() {
        return f;
    }

    public void setF(ArrayList<String[]> f) {
        this.f = f;
    }

    public boolean isKe() {
        return ke;
    }

    public void setKe(boolean ke) {
        this.ke = ke;
    }

    public String[] getKeys() {
        return keys;
    }

    public void setKeys(String[] keys) {
        this.keys = keys;
    }
   
   
    public ArrayList<String[]> getT() {
        return t;
    }

    public void setT(ArrayList<String[]> t) {
        this.t = t;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
   
    
}
