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
public class LibroCategoria {
    
    private int idCategoria;
    private String nroSerieLibro; 

    public LibroCategoria() {
    }

    public LibroCategoria(int idCategoria, String nroSerieLibro) {
        this.idCategoria = idCategoria;
        this.nroSerieLibro = nroSerieLibro;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNroSerieLibro() {
        return nroSerieLibro;
    }

    public void setNroSerieLibro(String nroSerieLibro) {
        this.nroSerieLibro = nroSerieLibro;
    }
    
    
    
}
