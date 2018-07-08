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
    private float IVA;
    private float precioTotal;
    private int metodoPago;

    public Factura() {
    }

    public Factura(int folio, float precioNeto, float precioTotal, int metodoPago, float IVA) {
        this.folio = folio;
        this.precioNeto = precioNeto;
        this.precioTotal = precioTotal;
        this.IVA = IVA;
        this.metodoPago = metodoPago;
    }

    public float getIVA() {
        return IVA;
    }

    public void setIVA(float IVA) {
        this.IVA = IVA;
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

    public int getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(int metodoPago) {
        this.metodoPago = metodoPago;
    }
    
    
    
}
