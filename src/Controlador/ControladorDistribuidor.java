/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Distribuidor;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author daniel
 */
public class ControladorDistribuidor {

    public boolean registrar(Distribuidor d) {
        boolean correcto = false;

        try {

            Conexion obj = new Conexion();
            Connection conn = obj.conectar();
            Statement stmt = conn.createStatement();
            String sql = "insert into distribuidor(rut, nombre_empresa, direccion, telefono, anio_de_asociacion) values('" + d.getRut() + "', '" + d.getNombre() + "', '" + d.getDireccion() + "', '" + d.getTelefono() + "', '" + d.getAnioAsociacion().getYear() + '-' + d.getAnioAsociacion().getMonth() + '-' + d.getAnioAsociacion().getDay() + "')";
            int op = stmt.executeUpdate(sql);

            if (op > 0) {
                correcto = true;
            }

        } catch (Exception e) {
            System.out.println("Controlador Distribuidor (registrar): " + e.getMessage());
        }

        return correcto;
    }

    public boolean existe(String rut) {
        boolean existe = false;

        try {
            Conexion obj = new Conexion();
            Connection conn = obj.conectar();
            Statement stmt = conn.createStatement();
            String sql = "select * from distribuidor where rut = '" + rut + "'";

            ResultSet datos = stmt.executeQuery(sql);

            if (datos.next()) {
                System.out.println(datos.getString(2));
                existe = true;
            }

            conn.close();
            stmt.close();

        } catch (Exception e) {
            System.out.println("Controlador Distribuidor (existe): " + e.getMessage());
        }

        return existe;

    }

    public ArrayList<Distribuidor> listado() {
        ArrayList<Distribuidor> listado = new ArrayList<>();

        try {
            Conexion obj = new Conexion();
            Connection conn = obj.conectar();
            Statement stmt = conn.createStatement();
            String sql = "select * from distribuidor";

            ResultSet datos = stmt.executeQuery(sql);

            while (datos.next()) {
                int id = datos.getInt(1);
                String rut = datos.getString(2);
                String nombre = datos.getString(3);
                String direccion = datos.getString(4);
                String telefono = datos.getString(5);
                Date AnioAsociacion = datos.getDate(6);
                
                Distribuidor d = new Distribuidor(id, rut, nombre, direccion, telefono, AnioAsociacion);
                
                listado.add(d);
                
            }
            
            conn.close();
            stmt.close();

        } catch (Exception e) {
            System.out.println("Controlador Distribuidor (listado): " + e.getMessage());
        }

        return listado;
    }

}
