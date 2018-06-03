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
public class IdiomaLibro {
    
    private int idIdioma;
    private String nroSerieLibro;

    public IdiomaLibro() {
    }

    public IdiomaLibro(int idIdioma, String nroSerieLibro) {
        this.idIdioma = idIdioma;
        this.nroSerieLibro = nroSerieLibro;
    }

    public int getIdIdioma() {
        return idIdioma;
    }

    public void setIdIdioma(int idIdioma) {
        this.idIdioma = idIdioma;
    }

    public String getNroSerieLibro() {
        return nroSerieLibro;
    }

    public void setNroSerieLibro(String nroSerieLibro) {
        this.nroSerieLibro = nroSerieLibro;
    }
    
    
    
}
