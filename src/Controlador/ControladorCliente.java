/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class ControladorCliente {
    
    public ArrayList<Cliente> listado(){
        ArrayList<Cliente> listado = new ArrayList<>();
        try{
            Conexion obj = new Conexion();
            Connection conn = obj.conectar();
            Statement stmt = conn.createStatement();
            String sql = "select * from cliente";
            ResultSet datos = stmt.executeQuery(sql);
            while(datos.next()){
                int id = datos.getInt(1);
                String rut = datos.getString(2);
                String nombre = datos.getString(3);
                String apPaterno = datos.getString(4);
                String apMaterno = datos.getString(5);
                Date fechaNacimiento = datos.getDate(6);
                
                Cliente c = new Cliente(id, rut, nombre, apPaterno, apMaterno, fechaNacimiento);
                listado.add(c);
                
            }
        }catch(Exception e){
            System.out.println("Controlador Cliente (listado): " + e.getMessage());
        }
        return listado;
    }
}
