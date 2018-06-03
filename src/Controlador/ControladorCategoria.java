/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Categoria;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class ControladorCategoria {
    
    public ArrayList<Categoria> listado(){
        ArrayList<Categoria> lista = new ArrayList<>();
        
        try{
            Conexion obj = new Conexion();
            Connection conn = obj.conectar();
            Statement stmt = conn.createStatement();
            String sql ="select * from categoria";
            ResultSet datos = stmt.executeQuery(sql);
            
            while(datos.next()){
                int id = datos.getInt(1);
                String nombreCategoria = datos.getString(2);
                
                Categoria c = new Categoria(id, nombreCategoria);
                lista.add(c);
            }
            
        }catch(Exception e){
            System.out.println("Controlador Categoria (listado): " + e.getMessage());
        }
        
        return lista;
    }
    
    public boolean crear(Categoria c){
        boolean correcto = false;
        
        try{           
            Conexion obj = new Conexion();
            Connection conn = obj.conectar();
            Statement stmt = conn.createStatement();
            String sql = "insert into categoria(nombre_categoria) values('"+ c.getCategoria() +"')";
            
            int op = stmt.executeUpdate(sql);
            
            if (op > 0){
                correcto = true;
            }
            
        }catch(Exception e){
            System.out.println("Controlador Categoria (crear): " + e.getMessage());
        }
        
        return correcto;
    }
    
}
