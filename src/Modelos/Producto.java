/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;


/**
 *
 * @author Roberto Marroquín
 */
public class Producto {
    
    
      
    private int id;
    private String nombreProd;
    private float  PrecioProd;
    private int  stock;
    

    public Producto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreProd() {
        return nombreProd;
    }

    public void setNombreProd(String nombreProd) {
        this.nombreProd = nombreProd;
    }

    public float getPrecioProd() {
        return PrecioProd;
    }

    public void setPrecioProd(float PrecioProd) {
        this.PrecioProd = PrecioProd;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

  
    
   
    
    
    
    
}
