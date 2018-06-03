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
public class CorreoElectronicoTrabajador {
    
    private int id;
    private String direccion;
    private int idTrabajador;

    public CorreoElectronicoTrabajador() {
    }

    public CorreoElectronicoTrabajador(int id, String direccion, int idTrabajador) {
        this.id = id;
        this.direccion = direccion;
        this.idTrabajador = idTrabajador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }
    
    
    
}
