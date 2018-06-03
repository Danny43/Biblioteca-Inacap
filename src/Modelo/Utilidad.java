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
public class Utilidad{
    
    private int id;
    private String utilidad;

    public Utilidad() {
    }

    public Utilidad(int id, String utilidad) {
        this.id = id;
        this.utilidad = utilidad;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return utilidad;
    }

    public void setDescripcion(String utilidad) {
        this.utilidad = utilidad;
    }
    
    
    
    
}
