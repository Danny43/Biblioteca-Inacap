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
public class DireccionTrabajador {
    
    private int idDireccion;
    private int idTrabajador;

    public DireccionTrabajador() {
    }

    public DireccionTrabajador(int idDireccion, int idTrabajador) {
        this.idDireccion = idDireccion;
        this.idTrabajador = idTrabajador;
    }

    public int getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(int idDireccion) {
        this.idDireccion = idDireccion;
    }

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }
    
    
    
}
