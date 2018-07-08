/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Arriendo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Daniel
 */
public class ControladorArriendo {
    
    public boolean crear(Arriendo ar){
        boolean correcto = false;
        
        try{
            Conexion obj = new Conexion();
            Connection conn = obj.conectar();
            Statement stmt = conn.createStatement();
            String sql = "insert into arriendo(fecha_arriendo, fecha_devolucion, costo_arriendo, cliente_idcliente, trabajador_idtrabajadores) values('"+ar.getFechaArriendo()+"', '"+ar.getFechaDevolucion()+"','"+ar.getCostoArriendo()+"', '"+ar.getIdCliente()+"', '"+ar.getIdTrabajador()+"')";  
            int op = stmt.executeUpdate(sql);
            if(op > 0){
                correcto = true;
            }
        }catch(Exception e){
            System.out.println("Controlador Arriendo (crear): " + e.getMessage());
        }
        
        return correcto;
    }
    
    public int asignarId    (){
        int nuevoFolio = 0;
        
        try{
        
            Conexion obj = new Conexion();
            Connection conn = obj.conectar();
            Statement stmt = conn.createStatement();
            String sql = "Select * from arriendo";
            ResultSet datos = stmt.executeQuery(sql);
            
            while(datos.next()){
                nuevoFolio = datos.getInt(1);
            }
            
            nuevoFolio += 1;
            
        }catch(Exception e){
            System.out.println("Controlador Arriendo (asigarId): " + e.getMessage());
        }
        
        
        return  nuevoFolio;
    }
    
}
