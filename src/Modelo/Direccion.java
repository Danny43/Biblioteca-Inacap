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
public class Direccion {
    
    private int id;
    private String ciudad;
    private String calle;
    private int nro;
    private String departamento;

    public Direccion() {
    }

    public Direccion(int id, String ciudad, String calle) {
        this.id = id;
        this.ciudad = ciudad;
        this.calle = calle;
    }

    public Direccion(int id, String ciudad, String calle, int nro, String departamento) {
        this.id = id;
        this.ciudad = ciudad;
        this.calle = calle;
        this.nro = nro;
        this.departamento = departamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
    
}
