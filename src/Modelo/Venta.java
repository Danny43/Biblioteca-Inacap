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
public class Venta {
    
    private int id;
    private int idCliente;
    private int idBoleta;

    public Venta() {
    }

    public Venta(int id, int idCliente, int idBoleta) {
        this.id = id;
        this.idCliente = idCliente;
        this.idBoleta = idBoleta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdBoleta() {
        return idBoleta;
    }

    public void setIdBoleta(int idBoleta) {
        this.idBoleta = idBoleta;
    }
    
    
    
}
