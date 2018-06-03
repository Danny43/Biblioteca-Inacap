/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.AnioPublicacion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class ControladorAnio {
    
    public ArrayList<AnioPublicacion> listado(){
        ArrayList<AnioPublicacion> lista = new ArrayList<>();
        
        try {
            Conexion obj = new Conexion();
            Connection conn = obj.conectar();
            Statement stmt = conn.createStatement();
            String sql = "Select * from anio_publicacion";
            ResultSet datos = stmt.executeQuery(sql);
            
            while(datos.next()){
                
                int id = datos.getInt(1);
                int anio = datos.getInt(2);
                
                AnioPublicacion aP = new AnioPublicacion(id, anio);
                
                lista.add(aP);
                
            }
        }
        catch(Exception e){
            System.out.println("Controlador Año: "+e.getMessage());
        }
        
        
        
        return lista;
    }
    
}
