/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.TituloAutor;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author Daniel
 */
public class ControladorTituloAutor {
    
    
    public boolean crear(TituloAutor TA){
        boolean correcto = false;
        try{
            
            Conexion obj = new Conexion();
            Connection conn = obj.conectar();
            Statement stmt = conn.createStatement();
            String sql = "insert into titulo_libro_has_autor(titulo_libro_idtitulo_libro, autor_idautor) values('"+TA.getIdTituloLibro()+"', '"+TA.getIdAutor()+"')";
            int op = stmt.executeUpdate(sql);
            
            if (op > 0){
                correcto = true;
            }
            
            conn.close();
            stmt.close();
            
        }catch(Exception e){
            System.out.println("ControladorTituloAutor (crear): " + e.getMessage() );
        }
        
        
        return correcto;
    }
    
    
}
