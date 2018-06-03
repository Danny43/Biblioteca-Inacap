/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Editorial;
import Modelo.ISBN;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class ControladorISBN {
    
    public ArrayList<ISBN> listado(){
        ArrayList<ISBN> lista = new ArrayList<>();
        
        try {
            Conexion obj = new Conexion();
            Connection conn = obj.conectar();
            Statement stmt = conn.createStatement();
            String sql = "Select * from ISBN";
            ResultSet datos = stmt.executeQuery(sql);
            
            while(datos.next()){
                
                int id = datos.getInt(1);
                String ISBN = datos.getString(2);
                
                ISBN i = new ISBN(id, ISBN);
                
                lista.add(i);
                
            }
        }
        catch(Exception e){
            System.out.println("Controlador ISBN: "+ e.getMessage());
        }
        
        
        
        return lista;
    }
    
}
