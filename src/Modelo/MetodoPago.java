/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Daniel
 */
public class MetodoPago {
    
    private int id;
    private String metodo;

    public MetodoPago() {
    }

    public MetodoPago(String metodo) {
        this.metodo = metodo;
    }
    
    

    public MetodoPago(int id, String metodo) {
        this.id = id;
        this.metodo = metodo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }
    
    
    
}
