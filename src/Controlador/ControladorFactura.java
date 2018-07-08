/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Factura;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Daniel
 */
public class ControladorFactura {
    
    
    public int asignarFolio(){
        int nuevoFolio = 0;
        
        try{
        
            Conexion obj = new Conexion();
            Connection conn = obj.conectar();
            Statement stmt = conn.createStatement();
            String sql = "Select * from factura";
            ResultSet datos = stmt.executeQuery(sql);
            
            while(datos.next()){
                nuevoFolio = datos.getInt(1);
            }
            
            nuevoFolio += 1;
            
        }catch(Exception e){
            System.out.println("Controlador Factura (asigarFolio): " + e.getMessage());
        }
        
        
        return  nuevoFolio;
    }
    
    public boolean agregar(Factura factura){
        boolean correcto = false;
        
        try{
            
            Conexion obj = new Conexion();
            Connection conn = obj.conectar();
            Statement stmt = conn.createStatement();
            String sql = "insert into factura(folio, precio_neto, IVA, precio_total, metodo_pago_idmetodo_pago) values('"+factura.getFolio()+"', '"+factura.getPrecioNeto()+"', '"+factura.getIVA()+"', '"+factura.getPrecioTotal()+"', '"+factura.getMetodoPago()+"')";
            int op = stmt.executeUpdate(sql);
            
            if(op > 0){
                correcto = true;
            }
            conn.close();
            stmt.close();
        }catch(Exception e){
            System.out.println("Controlador Factura (agregar): " + e.getMessage());
        }
        
        
        return correcto;
    }
}
