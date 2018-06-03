/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Editorial;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class ControladorEditorial {
    
    
    public ArrayList<Editorial> listado(){
        ArrayList<Editorial> lista = new ArrayList<>();
        
        try {
            Conexion obj = new Conexion();
            Connection conn = obj.conectar();
            Statement stmt = conn.createStatement();
            String sql = "select * from editorial";
            ResultSet datos = stmt.executeQuery(sql);
            
            while(datos.next()){
                
                int id = datos.getInt(1);
                String nombre_editorial = datos.getString(2);
                
                Editorial i = new Editorial(id, nombre_editorial);
                
                lista.add(i);
                
            }
        }
        catch(Exception e){
            System.out.println("Controlador Editorial: "+e.getMessage());
        }
        
        
        
        return lista;
    }
    
}
