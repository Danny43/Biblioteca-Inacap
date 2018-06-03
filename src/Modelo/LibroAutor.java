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
public class LibroAutor {
    
    private String nroSerieLibro;
    private int idAutor;

    public LibroAutor() {
    }

    public LibroAutor(String nroSerieLibro, int idAutor) {
        this.nroSerieLibro = nroSerieLibro;
        this.idAutor = idAutor;
    }

    public String getNroSerieLibro() {
        return nroSerieLibro;
    }

    public void setNroSerieLibro(String nroSerieLibro) {
        this.nroSerieLibro = nroSerieLibro;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }
    
    
    
}
