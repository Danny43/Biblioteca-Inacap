/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Daniel
 */
public class Arriendo {
    
    private int id;
    private float costoTotal;
    private String fechaArriendo;
    private String fechaDevolucion;
    private String fechaEntregaReal;
    private int diasRetraso;
    private float multa;
    private float costoArriendo;
    private int idCliente;
    private int idTrabajador;

    public Arriendo() {
    }

    public Arriendo(int id, String fechaArriendo, String fechaDevolucion, float costoArriendo, int idCliente, int idTrabajador) {
        this.id = id;
        this.fechaArriendo = fechaArriendo;
        this.fechaDevolucion = fechaDevolucion;
        this.costoArriendo = costoArriendo;
        this.idCliente = idCliente;
        this.idTrabajador = idTrabajador;
    }

    public Arriendo(int id, float costoTotal, String fechaArriendo, String fechaDevolucion, String fechaEntregaReal, int diasRetraso, float multa, float costoArriendo, int idCliente, int idTrabajador) {
        this.id = id;
        this.costoTotal = costoTotal;
        this.fechaArriendo = fechaArriendo;
        this.fechaDevolucion = fechaDevolucion;
        this.fechaEntregaReal = fechaEntregaReal;
        this.diasRetraso = diasRetraso;
        this.multa = multa;
        this.costoArriendo = costoArriendo;
        this.idCliente = idCliente;
        this.idTrabajador = idTrabajador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(float costoTotal) {
        this.costoTotal = costoTotal;
    }

    public String getFechaArriendo() {
        return fechaArriendo;
    }

    public void setFechaArriendo(String fechaArriendo) {
        this.fechaArriendo = fechaArriendo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getFechaEntregaReal() {
        return fechaEntregaReal;
    }

    public void setFechaEntregaReal(String fechaEntregaReal) {
        this.fechaEntregaReal = fechaEntregaReal;
    }

    public int getDiasRetraso() {
        return diasRetraso;
    }

    public void setDiasRetraso(int diasRetraso) {
        this.diasRetraso = diasRetraso;
    }

    public float getMulta() {
        return multa;
    }

    public void setMulta(float multa) {
        this.multa = multa;
    }

    public float getCostoArriendo() {
        return costoArriendo;
    }

    public void setCostoArriendo(float costoArriendo) {
        this.costoArriendo = costoArriendo;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }
    
    
    
    
    
    
}
