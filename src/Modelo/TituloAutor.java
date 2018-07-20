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
public class TituloAutor {

    private int idTituloLibro;
    private int idAutor;

    public TituloAutor() {
    }
    
    

    public TituloAutor(int idTituloLibro, int idAutor) {
        this.idTituloLibro = idTituloLibro;
        this.idAutor = idAutor;
    }
    
    

    public int getIdTituloLibro() {
        return idTituloLibro;
    }

    public void setIdTituloLibro(int idTituloLibro) {
        this.idTituloLibro = idTituloLibro;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }
    
    
    
    
    
    

}
