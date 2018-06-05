/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ControladorUsuario {

    public Usuario iniciarSesion(Usuario u) {
        Usuario user = null;

        try {

            Conexion obj = new Conexion();
            Connection conn = obj.conectar();
            Statement stmt = conn.createStatement();
            String sql = "select * from usuario where username = '" + u.getUserName() + "' and password = '" + u.getPassword()+ "'";
            ResultSet datos = stmt.executeQuery(sql);

            if (datos.next()) {
                int id = datos.getInt(1);
                String userName = datos.getString(2);
                String password = datos.getString(3);
                String rol = datos.getString(4);

                user = new Usuario(id, userName, password, rol);

            }

        } catch (Exception e) {
            System.out.println("Controlador Usuario (inciarSesion): " + e.getMessage());
        }

        return user;
    }

    public boolean registrarUsuario(Usuario u) {
        boolean correcto = false;
        try {
            Conexion obj = new Conexion();
            Connection conn = obj.conectar();
            Statement stmt = conn.createStatement();
            String sql = "insert into usuario(username, password, rol) values('"+u.getUserName()+"', '"+u.getPassword()+"', '"+u.getRol()+"')";
            int op = stmt.executeUpdate(sql);
            if(op > 0){
                correcto = true;
            }
            
            
        } catch (Exception e) {
            System.out.println("Controlador Usuario (registrar): "+ e.getMessage());
        }

        return correcto;
    }

}
