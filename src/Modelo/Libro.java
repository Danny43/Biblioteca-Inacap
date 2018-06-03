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
    private int IDeditorial;
    private int id_compra;
    private int id_venta;
    private String estado;
    private int IDestado;
    private int anio_publicacion;
    private int IDanio_publicacion;
    private String titulo;
    private int IDtitulo;
    private String ISBN;
    private int IDISBN;
    private int id_arriendo;
    private String utilidad;
    private int IDutilidad;
    
    
    

    public Libro() {
    }

    public Libro(String nro_serie, int nro_paginas, float precio_referencia, int IDeditorial, int IDestado, int IDanio_publicacion, int IDtitulo, int IDISBN, int IDutilidad) {
        this.nro_serie = nro_serie;
        this.nro_paginas = nro_paginas;
        this.precio_referencia = precio_referencia;
        this.IDeditorial = IDeditorial;
        this.IDestado = IDestado;
        this.IDanio_publicacion = IDanio_publicacion;
        this.IDtitulo = IDtitulo;
        this.IDISBN = IDISBN;
        this.IDutilidad = IDutilidad;
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

    public int getIDeditorial() {
        return IDeditorial;
    }

    public void setIDeditorial(int IDeditorial) {
        this.IDeditorial = IDeditorial;
    }

    public int getIDestado() {
        return IDestado;
    }

    public void setIDestado(int IDestado) {
        this.IDestado = IDestado;
    }

    public int getIDanio_publicacion() {
        return IDanio_publicacion;
    }

    public void setIDanio_publicacion(int IDanio_publicacion) {
        this.IDanio_publicacion = IDanio_publicacion;
    }

    public int getIDtitulo() {
        return IDtitulo;
    }

    public void setIDtitulo(int IDtitulo) {
        this.IDtitulo = IDtitulo;
    }

    public int getIDISBN() {
        return IDISBN;
    }

    public void setIDISBN(int IDISBN) {
        this.IDISBN = IDISBN;
    }

    public int getIDutilidad() {
        return IDutilidad;
    }

    public void setIDutilidad(int IDutilidad) {
        this.IDutilidad = IDutilidad;
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
