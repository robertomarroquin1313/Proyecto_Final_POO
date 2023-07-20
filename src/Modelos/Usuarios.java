/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author Ariel Carbajal
 */
public class Usuarios {
    
    private int id;
    private String nombreUs;
    private String pass;
    private int tipoUs;

    public Usuarios() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreUs() {
        return nombreUs;
    }

    public void setNombreUs(String nombreUs) {
        this.nombreUs = nombreUs;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getTipoUs() {
        return tipoUs;
    }

    public void setTipoUs(int tipoUs) {
        this.tipoUs = tipoUs;
    }
    
    
    
    
    
}

