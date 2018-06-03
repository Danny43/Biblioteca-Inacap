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
public class Factura {
    
    private int folio;
    private float precioNeto;
    private float precioTotal;
    private float costo;
    private Date fecha;
    private Date hora;
    private int idDistribuidor;
    private int metodoPago;

    public Factura() {
    }

    public Factura(int folio, float precioNeto, float precioTotal, float costo, Date fecha, Date hora, int idDistribuidor, int metodoPago) {
        this.folio = folio;
        this.precioNeto = precioNeto;
        this.precioTotal = precioTotal;
        this.costo = costo;
        this.fecha = fecha;
        this.hora = hora;
        this.idDistribuidor = idDistribuidor;
        this.metodoPago = metodoPago;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public float getPrecioNeto() {
        return precioNeto;
    }

    public void setPrecioNeto(float precioNeto) {
        this.precioNeto = precioNeto;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public int getIdDistribuidor() {
        return idDistribuidor;
    }

    public void setIdDistribuidor(int idDistribuidor) {
        this.idDistribuidor = idDistribuidor;
    }

    public int getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(int metodoPago) {
        this.metodoPago = metodoPago;
    }
    
    
    
}
