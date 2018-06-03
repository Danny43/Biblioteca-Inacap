/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Editorial;
import Modelo.Idioma;
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
