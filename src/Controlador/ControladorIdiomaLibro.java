/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author Daniel
 */
public class ControladorIdiomaLibro {
    
    
    public boolean registrar(int idioma, String libro){
        boolean correcto = false;
        
        try{
            Conexion obj = new Conexion();
            Connection conn = obj.conectar();
            Statement stmt = conn.createStatement();
            String sql = "insert into idioma_has_libro(idioma_ididioma, libro_nro_serie) values('"+idioma+"', '"+libro+"')";
            int op = stmt.executeUpdate(sql);
            
            if(op > 0){
                correcto = true;
            }
            
        }catch (Exception e){
            System.out.println("Controlador Idioma Libro: " + e.getMessage());
        }
        
        return correcto;
    }
    
}
