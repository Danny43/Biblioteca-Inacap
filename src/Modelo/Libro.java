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
public class Libro {
    
    private String nro_serie;
    private int nro_paginas;
    private float precio_referencia;
    private String editorial;
    private int id_compra;
    private int id_venta;
    private String estado;
    private int anio_publicacion;
    private String titulo;
    private String ISBN;
    private int id_arriendo;
    private String utilidad;
    
    
    

    public Libro() {
    }

    public Libro(String nro_serie, int nro_paginas, float precio_referencia, String editorial, String estado, int anio_publicacion, String titulo, String ISBN, String utilidad) {
        this.nro_serie = nro_serie;
        this.nro_paginas = nro_paginas;
        this.precio_referencia = precio_referencia;
        this.editorial = editorial;
        this.estado = estado;
        this.anio_publicacion = anio_publicacion;
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.utilidad = utilidad;
    }

    public Libro(String nro_serie, int nro_paginas, float precio_referencia, String editorial, int id_compra, int id_venta, String estado, int anio_publicacion, String titulo, String ISBN, int id_arriendo, String utilidad) {
        this.nro_serie = nro_serie;
        this.nro_paginas = nro_paginas;
        this.precio_referencia = precio_referencia;
        this.editorial = editorial;
        this.id_compra = id_compra;
        this.id_venta = id_venta;
        this.estado = estado;
        this.anio_publicacion = anio_publicacion;
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.id_arriendo = id_arriendo;
        this.utilidad = utilidad;
    }

    public String getNro_serie() {
        return nro_serie;
    }

    public void setNro_serie(String nro_serie) {
        this.nro_serie = nro_serie;
    }

    public int getNro_paginas() {
        return nro_paginas;
    }

    public void setNro_paginas(int nro_paginas) {
        this.nro_paginas = nro_paginas;
    }

    public float getPrecio_referencia() {
        return precio_referencia;
    }

    public void setPrecio_referencia(float precio_referencia) {
        this.precio_referencia = precio_referencia;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getAnio_publicacion() {
        return anio_publicacion;
    }

    public void setAnio_publicacion(int anio_publicacion) {
        this.anio_publicacion = anio_publicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getId_arriendo() {
        return id_arriendo;
    }

    public void setId_arriendo(int id_arriendo) {
        this.id_arriendo = id_arriendo;
    }

    public String getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(String utilidad) {
        this.utilidad = utilidad;
    }
    
    
    
    
    
}
