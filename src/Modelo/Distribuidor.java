/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;

/**
 *
 * @author Daniel
 */
public class Distribuidor {
    private int id;
    private String rut;
    private String nombre;
    private String direccion;
    private String telefono;
    private Date AnioAsociacion;

    public Distribuidor() {
    }

    public Distribuidor(int id, String rut, String nombre, String direccion, String telefono, Date AnioAsociacion) {
        this.id = id;
        this.rut = rut;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.AnioAsociacion = AnioAsociacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getAnioAsociacion() {
        return AnioAsociacion;
    }

    public void setAnioAsociacion(Date AnioAsociacion) {
        this.AnioAsociacion = AnioAsociacion;
    }
    
    
}
