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
public class Cliente {
    
    private int id;
    private String rut;
    private String nombre;
    private String apPaterno;
    private String apMaterno;    
    private Date fechaNacimento;

    public Cliente() {
    }

    public Cliente(int id, String rut, String nombre, String apPaterno, String apMaterno, Date fechaNacimento) {
        this.id = id;
        this.rut = rut;
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.fechaNacimento = fechaNacimento;
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

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public Date getFechaNacimento() {
        return fechaNacimento;
    }

    public void setFechaNacimento(Date fechaNacimento) {
        this.fechaNacimento = fechaNacimento;
    }
    
    
    
}
