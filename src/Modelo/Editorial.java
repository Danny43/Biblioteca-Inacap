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
public class Editorial {
    
    private int id;
    private String nombre_editorial;

    public Editorial() {
    }

    
    
    public Editorial(String nombre_editorial) {
        this.nombre_editorial = nombre_editorial;
    }
    
    

    public Editorial(int id, String nombre_editorial) {
        this.id = id;
        this.nombre_editorial = nombre_editorial;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_editorial() {
        return nombre_editorial;
    }

    public void setNombre_editorial(String nombre_editorial) {
        this.nombre_editorial = nombre_editorial;
    }
    
    
    
}
