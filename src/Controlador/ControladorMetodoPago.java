/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MetodoPago;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class ControladorMetodoPago {
    
    public ArrayList<MetodoPago> listado(){
        ArrayList<MetodoPago> listado = new ArrayList<>();
        
        try{
            
            Conexion obj = new Conexion();
            Connection conn = obj.conectar();
            Statement stmt = conn.createStatement();
            String sql = "select * from metodo_pago";
            ResultSet datos = stmt.executeQuery(sql);
            
            while(datos.next()){
                int id = datos.getInt(1);
                String metodo = datos.getString(2);
                
                listado.add(new MetodoPago(id, metodo));
                
            }
            
            conn.close();
            stmt.close();
            
        }catch(Exception e){
            System.out.println("Controlador Metodo de Pago (listado): " + e.getMessage());
        }
        
        return listado;
    }
    
    public boolean registrar(MetodoPago m){
        boolean correcto = false;
        
        try{
            Conexion obj = new Conexion();
            Connection conn = obj.conectar();
            Statement stmt = conn.createStatement();
            String sql = "insert into metodo_pago(metodo) values('"+m.getMetodo()+"')";
            int op = stmt.executeUpdate(sql);
            
            if(op > 0){
                correcto = true;
            }
            
        }catch(Exception e){
            System.out.println("Controlador MetodoPago (registrar): " + e.getMessage());
        }
        
        
        return correcto;
    }
    
}
