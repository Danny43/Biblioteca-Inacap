/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Editorial;
import Modelo.Idioma;
import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class ControladorIdioma {
    
    public ArrayList<Idioma> listado(){
        ArrayList<Idioma> lista = new ArrayList<>();
        
        try {
            Conexion obj = new Conexion();
            Connection conn = obj.conectar();
            Statement stmt = conn.createStatement();
            String sql = "select * from idioma";
            ResultSet datos = stmt.executeQuery(sql);
            
            while(datos.next()){
                
                int id = datos.getInt(1);
                String idioma = datos.getString(2);
                
                Idioma i = new Idioma(id, idioma);
                
                lista.add(i);
                
            }
        }
        catch(Exception e){
            System.out.println("Controlador Idioma (listado): "+e.getMessage());
        }
        
        
        
        return lista;
    }
    
    
    public int buscar(String nroserie){
        int id = 0;
        
        try{
            Conexion obj = new Conexion();
            Connection conn = obj.conectar();
            Statement stmt = conn.createStatement();
            String sql = "select idioma_ididioma from idioma_has_libro where libro_nro_serie = '"+nroserie+"'";
            ResultSet datos  = stmt.executeQuery(sql);
            if(datos.next()){
                id = datos.getInt(1);
            }
            
            conn.close();
            stmt.close();
            
        }catch(Exception e){
            System.out.println("Controlador Idioma (buscar): " + e.getMessage());
        }
        
        
        return id;
    }
    
    
    public boolean crear(Idioma i){
        boolean correcto = false;
        
        try{
            Conexion obj = new Conexion();
            Connection conn = obj.conectar();
            Statement stmt = conn.createStatement();
            String sql = "insert into idioma(idioma) values('"+i.getIdioma()+"')";
            
            int op = stmt.executeUpdate(sql);
            if(op > 0){
                correcto = true;
            }
        }catch(Exception e){
            
        }
        
        
        return correcto;
    }
    
}
