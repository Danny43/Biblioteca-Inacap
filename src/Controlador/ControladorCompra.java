/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Compra;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Daniel
 */
public class ControladorCompra {
    
    public boolean agregar(Compra compra){
        boolean correcto = false;
        
        try{
            Conexion obj = new Conexion();
            Connection conn = obj.conectar();
            Statement stmt = conn.createStatement();
            String sql = "insert into compra(idcompra, distribuidor_iddistribuidor, factura_folio) values('"+compra.getId()+"', '"+compra.getIdDistribuidor()+"', '"+compra.getIdFactura()+"')";
            int op = stmt.executeUpdate(sql);
            
            if(op > 0){
                correcto = true;
            }
            
        }catch(Exception e){
            System.out.println("Controlador Compra (agregar): " + e.getMessage());
        }
        
        return correcto;
    }
    
    public int obtenerID(){
        int id= 0;
        
        try{
            
            Conexion obj = new Conexion();
            Connection conn = obj.conectar();
            Statement stmt = conn.createStatement();
            String sql = "select * from compra";
            ResultSet datos = stmt.executeQuery(sql);
            
            while(datos.next()){
                id = datos.getInt(1);
            }
            
            id += 1;
            
        }catch(Exception e){
            System.out.println("Controlador Compra (obtenerID): +" + e.getMessage());
        }
        
        return id;
    }
    
}
