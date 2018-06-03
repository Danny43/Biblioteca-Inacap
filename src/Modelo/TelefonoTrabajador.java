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
public class TelefonoTrabajador {

    private int id;
    private String nroTelefono;
    private int idTrabajador;

    public TelefonoTrabajador() {
    }

    public TelefonoTrabajador(int id, String nroTelefono, int idTrabajador) {
        this.id = id;
        this.nroTelefono = nroTelefono;
        this.idTrabajador = idTrabajador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNroTelefono() {
        return nroTelefono;
    }

    public void setNroTelefono(String nroTelefono) {
        this.nroTelefono = nroTelefono;
    }

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }
    
    
    
    
}
