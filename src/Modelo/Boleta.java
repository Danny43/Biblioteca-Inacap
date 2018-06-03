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
public class Boleta {
    
    private int folio;
    private float precioNeto;
    private float precioTotal;
    private float IVA;
    private Date fechaVenta;
    private Date horaVenta;
    private int idCliente;
    private int idMetodoPago;
    private int idTrabajador;

    public Boleta() {
    }

    public Boleta(int folio, float precioNeto, float precioTotal, float IVA, Date fechaVenta, Date horaVenta, int idCliente, int idMetodoPago, int idTrabajador) {
        this.folio = folio;
        this.precioNeto = precioNeto;
        this.precioTotal = precioTotal;
        this.IVA = IVA;
        this.fechaVenta = fechaVenta;
        this.horaVenta = horaVenta;
        this.idCliente = idCliente;
        this.idMetodoPago = idMetodoPago;
        this.idTrabajador = idTrabajador;
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

    public float getIVA() {
        return IVA;
    }

    public void setIVA(float IVA) {
        this.IVA = IVA;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Date getHoraVenta() {
        return horaVenta;
    }

    public void setHoraVenta(Date horaVenta) {
        this.horaVenta = horaVenta;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdMetodoPago() {
        return idMetodoPago;
    }

    public void setIdMetodoPago(int idMetodoPago) {
        this.idMetodoPago = idMetodoPago;
    }

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }
    
    
    
}
