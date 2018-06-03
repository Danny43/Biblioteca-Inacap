/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Autor;
import Modelo.Editorial;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class ControladorAutor {
    
    public boolean registrar(Autor registro){
        boolean correcto = false;
        
        
        try{
            
            Conexion obj = new Conexion();
            Connection conn = obj.conectar();
            Statement stmt = conn.createStatement();
            String sql = "insert into autor(nombres, ap_paterno, ap_materno) values('"+registro.getNombres()+"','"+registro.getApPaterno()+"', '"+registro.getApMaterno()+"')";
            int op = stmt.executeUpdate(sql);
            
            if(op > 0){
                correcto = true;
            }
            
        }
        catch(Exception e){
            System.out.println("Controlador (registrar): " + e.getMessage());
            
        }
        
        return correcto;
    }
    
    public boolean existe(Autor existe){
        boolean existeAutor = false;
        
        try{
            Conexion obj = new Conexion();
            Connection conn = obj.conectar();
            Statement stmt = conn.createStatement();
            String sql = "select * from autor where nombres = '"+existe.getNombres()+"' and ap_paterno = '"+existe.getApPaterno()+"' and ap_materno = '"+existe.getApMaterno()+"'";
            
            ResultSet datos = stmt.executeQuery(sql);
            
            if(datos.next()){
                existeAutor = true;
            }
            
        }
        catch(Exception e){
            System.out.println("Controlador Autor(existe): "+ e.getMessage());
        }
        
        
        return existeAutor;
    }
    
    
    public ArrayList<Autor> listado(){
        ArrayList<Autor> lista = new ArrayList<>();
        try{
            
            Conexion obj = new Conexion();
            Connection conn = obj.conectar();
            Statement stmt = conn.createStatement();
            String sql = "select * from autor";
            ResultSet datos = stmt.executeQuery(sql);
            
            while(datos.next()){
                
                int id = datos.getInt(1);
                String nombres = datos.getString(2);
                String apPaterno = datos.getString(3);
                String apMaterno = datos.getString(4);
                
                Autor a = new Autor(id, nombres, apPaterno, apMaterno);
                
                lista.add(a);
            }
        }
        catch(Exception e){
            System.out.println("Controlador Autor (listado): "+ e.getMessage());
        }
        
        return lista;
    }
}
