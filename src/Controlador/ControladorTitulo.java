/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Modelo.Autor;
import Modelo.TituloLibro;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class ControladorTitulo {
    
    public ArrayList<TituloLibro> listado(){
        ArrayList<TituloLibro> lista = new ArrayList<>();
        
        try {
            Conexion obj = new Conexion();
            Connection conn = obj.conectar();
            Statement stmt = conn.createStatement();
            String sql = "select * from titulo_libro";
            ResultSet datos = stmt.executeQuery(sql);
            
            while(datos.next()){
                
                int id = datos.getInt(1);
                String titulo = datos.getString(2);
                
                TituloLibro t = new TituloLibro(id, titulo);
                
                lista.add(t);
                
            }
        }
        catch(Exception e){
            System.out.println("Controlador Titulo: "+e.getMessage());
        }
        
        
        
        return lista;
    }
    
    public ArrayList<Autor> buscarAutores(TituloLibro tituloL){
        ArrayList<Autor> autores = new ArrayList<>();
        
        try{
            Conexion obj = new Conexion();
            Connection conn = obj.conectar();
            Statement stmt = conn.createStatement();
            String sql = "select autor.idautor as id, autor.nombres as Nombre, autor.ap_paterno as Apellido_Paterno, ap_materno as Apellido_Materno from titulo_libro_has_autor\n" +
"   inner join autor on autor.idautor = autor_idautor\n" +
"   where titulo_libro_idtitulo_libro = '"+tituloL.getId()+"'";
            ResultSet datos = stmt.executeQuery(sql);
            
            while(datos.next()){
                
                int id = datos.getInt(1);
               String Nombres = datos.getString(2);
               String apPaterno = datos.getString(3);
               String apMaterno = datos.getString(4);
               
               Autor a = new Autor(id, Nombres, apPaterno, apMaterno);
                
                autores.add(a);
                
            }
            
        }
        catch(Exception e){
            System.out.println("Controlador Titulo (buscarAutores): "+ e.getMessage());
        }
        
        
        return autores;
    }
    
    public TituloLibro buscarTitulo(String tituloBuscar){
        TituloLibro buscado = null;
        
        try{
            Conexion obj = new Conexion();
            Connection conn = obj.conectar();
            Statement stmt = conn.createStatement();
            String sql = "select * from titulo_libro where titulo = '"+ tituloBuscar +"'";
            ResultSet datos = stmt.executeQuery(sql);
            
            if(datos.next()){
                int id = datos.getInt(1);
                String titulo = datos.getString(2);
                
                buscado = new TituloLibro(id, titulo);
            }
            
        }
        catch(Exception e){
            System.out.println("Controlador Titulo (buscarTitulo): " + e.getMessage());
        }
        
        return buscado;
    }
    
    public boolean agregarTitulo(TituloLibro t){
        boolean correcto = false;
        
        try{
            
            Conexion obj = new Conexion();
            Connection conn = obj.conectar();
            Statement stmt = conn.createStatement();
            String sql ="insert into titulo_libro(titulo) values('"+t.getTitulo()+"')";
            int op = stmt.executeUpdate(sql);
            
            if(op > 0){
                correcto = true;
            }
            
            stmt.close();
            conn.close();
            
        }catch(Exception e){
            System.out.println("Controlador Titulo (agregarTitulo): " + e.getMessage());
        }
        
        return correcto;
    }
    
    public int buscarID(String titulo){
        int ID = 0;
        
        try{
        
            Conexion obj = new Conexion();
            Connection conn = obj.conectar();
            Statement stmt = conn.createStatement();
            String sql = "select idtitulo_libro from titulo_libro where titulo = '"+titulo+"' ";
            ResultSet datos = stmt.executeQuery(sql);
            
            if(datos.next()){
                ID = datos.getInt(1);
            }
            
           
            
        }catch(Exception e){
            System.out.println("Controlador Factura (asigarFolio): " + e.getMessage());
        }
        
        
        return  ID;
    }
    
}
