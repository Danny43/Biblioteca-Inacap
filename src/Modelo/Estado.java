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
public class Estado {
    private int id;
    private String estado;

    public Estado() {
    }

    public Estado(int id, String estado) {
        this.id = id;
        this.estado = estado;
    }

    public Estado(String estado) {
        this.estado = estado;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
