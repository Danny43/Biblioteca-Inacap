/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Editorial;
import Modelo.Estado;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class ControladorEstado {
    
    
    public ArrayList<Estado> listado(){
        ArrayList<Estado> lista = new ArrayList<>();
        
        try {
            Conexion obj = new Conexion();
            Connection conn = obj.conectar();
            Statement stmt = conn.createStatement();
            String sql = "Select * from estado_libro";
            ResultSet datos = stmt.executeQuery(sql);
            
            while(datos.next()){
                
                int id = datos.getInt(1);
                String estado = datos.getString(2);
                
                Estado e = new Estado(id, estado);
                
                lista.add(e);
                
            }
        }
        catch(Exception e){
            System.out.println("Controlador Estado: "+e.getMessage());
        }
        
        
        
        return lista;
    }
}
