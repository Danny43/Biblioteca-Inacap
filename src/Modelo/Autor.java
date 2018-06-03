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
public class Autor {
    
    private int id;
    private String Nombres;
    private String apPaterno;
    private String apMaterno;

    public Autor() {
    }

    public Autor(String Nombres, String apPaterno) {
        this.Nombres = Nombres;
        this.apPaterno = apPaterno;
    }

    public Autor(String Nombres, String apPaterno, String apMaterno) {
        this.Nombres = Nombres;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
    }
    
    

    public Autor(int id, String Nombres, String apPaterno, String apMaterno) {
        this.id = id;
        this.Nombres = Nombres;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
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
    
    
    
}
