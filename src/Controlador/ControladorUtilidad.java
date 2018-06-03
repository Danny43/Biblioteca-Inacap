/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Utilidad;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class ControladorUtilidad{

    
    public boolean crear(Object ob) {
        boolean correcto = false;

        return correcto;
    }

    public ArrayList<Utilidad> listado() {
        ArrayList<Utilidad> lista = new ArrayList<Utilidad>();

        try {
            Conexion obj = new Conexion();
            Connection conn = obj.conectar();
            Statement stmt = conn.createStatement();
            String sql = "Select * from utilidad";
            ResultSet datos = stmt.executeQuery(sql);
            
            while(datos.next()){
                
                int id = datos.getInt(1);
                String descripcion = datos.getString(2);
                
                Utilidad i = new Utilidad(id, descripcion);
                
                lista.add(i);
                
            }
            
            
        } catch (Exception e) {
            System.out.println("Controlador Utilidad: "+e.getMessage());
        }

        return lista;
    }


    public Utilidad buscar(String busca) {
        Utilidad u = new Utilidad();
        
        
        return u;
    }


    public boolean borrar(Utilidad ob) {
        boolean correcto = false;
        
        return correcto;
        
    }

}
