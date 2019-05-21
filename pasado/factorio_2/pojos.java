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
public class pojos {
    private String nombre;
    private String key;
    private boolean ke=false;
    private String[] keys;
    private boolean constr;
    private boolean constrvacio;
    private ArrayList<String[]> p=new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
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


    public boolean isConstr() {
        return constr;
    }

    public void setConstr(boolean constr) {
        this.constr = constr;
    }

    public boolean isConstrvacio() {
        return constrvacio;
    }

    public void setConstrvacio(boolean constrvacio) {
        this.constrvacio = constrvacio;
    }

    public ArrayList<String[]> getP() {
        return p;
    }

    public void setP(ArrayList<String[]> p) {
        this.p = p;
    }


    
    
}
