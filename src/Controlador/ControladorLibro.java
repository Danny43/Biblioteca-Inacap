/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Modelo.Libro;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class ControladorLibro {

    public boolean crear(Libro obL) {
        boolean correcto = false;

        try {
            Conexion obj = new Conexion();
            Connection conn = obj.conectar();
            Statement stmt = conn.createStatement();
            String sql = "Insert into Libro(nro_serie, nro_paginas, precio_referencia, Editorial_idEditorial, estado_libro_idestado_libro, anio_publicacion_idanio_publicacion, titulo_libro_idtitulo_libro, ISBN_idISBN, utilidad_idUtilidad)"
                    + "   values('" + obL.getNro_serie() + "', '" + obL.getNro_paginas() + "', '" + obL.getPrecio_referencia() + "', '" + obL.getIDeditorial() + "', '" + obL.getIDestado() + "', '" + obL.getIDanio_publicacion() + "', '" + obL.getIDtitulo() + "', '" + obL.getIDISBN() + "', '" + obL.getIDutilidad() + "')";
            int op = stmt.executeUpdate(sql);

            if (op > 0) {
                correcto = true;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return correcto;

    }

    public ArrayList<Libro> listado() {
        ArrayList<Libro> lista = new ArrayList<>();

        try {
            Conexion obj = new Conexion();
            Connection conn = obj.conectar();
            Statement stmt = conn.createStatement();
            String sql = "select nro_serie as Numero_de_Serie, nro_paginas as Numero_de_Paginas, precio_referencia as Precio_de_Referencia, Editorial.nombre_editorial as Editorial, estado_libro.estado as Estado, anio_publicacion.anio as Año_de_Publicacion, titulo_libro.titulo as Titulo, ISBN.ISBN as ISBN, utilidad.utilidad as Utilidad from libro\n"
                    + "   inner join Editorial on Editorial.idEditorial = Editorial_idEditorial\n"
                    + "   inner join estado_libro on estado_libro.idestado_libro = estado_libro_idestado_libro\n"
                    + "   inner join anio_publicacion on anio_publicacion.idanio_publicacion = anio_publicacion_idanio_publicacion\n"
                    + "   inner join titulo_libro on titulo_libro.idtitulo_libro = titulo_libro_idtitulo_libro\n"
                    + "   inner join ISBN on ISBN.idISBN = ISBN_idISBN\n"
                    + "   inner join utilidad on utilidad.idutilidad = utilidad_idutilidad;";
            ResultSet datos = stmt.executeQuery(sql);

            while (datos.next()) {

                String nroSerie = datos.getString(1);
                int nroPaginas = datos.getInt(2);
                float precioReferencia = datos.getFloat(3);
                String editorial = datos.getString(4);
                String Estado = datos.getString(5);
                int anioPublicacion = datos.getInt(6);
                String titulo = datos.getString(7);
                String ISBN = datos.getString(8);
                String utilidad = datos.getString(9);

                Libro l = new Libro(nroSerie, nroPaginas, precioReferencia, editorial, Estado, anioPublicacion, titulo, ISBN, utilidad);

                lista.add(l);

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return lista;
    }

    public Libro buscar(int nroserie) {
        Libro l = null;

        try {
            Conexion obj = new Conexion();
            Connection conn = obj.conectar();
            Statement stmt = conn.createStatement();
            String sql = "select nro_serie as Numero_de_Serie, nro_paginas as Numero_de_Paginas, precio_referencia as Precio_de_Referencia, editorial.nombre_editorial as Editorial, estado_libro.estado as Estado, anio_publicacion.anio as Año_de_Publicacion, titulo_libro.titulo as Titulo, ISBN.ISBN as ISBN, utilidad.utilidad as Utilidad from libro\n"
                    + "   inner join editorial on editorial.idEditorial = Editorial_idEditorial\n"
                    + "   inner join estado_libro on estado_libro.idestado_libro = estado_libro_idestado_libro\n"
                    + "   inner join anio_publicacion on anio_publicacion.idanio_publicacion = anio_publicacion_idanio_publicacion\n"
                    + "   inner join titulo_libro on titulo_libro.idtitulo_libro = titulo_libro_idtitulo_libro\n"
                    + "   inner join ISBN on ISBN.idISBN = ISBN_idISBN\n"
                    + "   inner join utilidad on utilidad.idutilidad = utilidad_idutilidad where nro_serie = '"+ nroserie +"'";
            ResultSet datos = stmt.executeQuery(sql);

            if (datos.next()) {
                String nroSerie = datos.getString(1);
                int nroPaginas = datos.getInt(2);
                float precioReferencia = datos.getFloat(3);
                String editorial = datos.getString(4);
                String Estado = datos.getString(5);
                int anioPublicacion = datos.getInt(6);
                String titulo = datos.getString(7);
                String ISBN = datos.getString(8);
                String utilidad = datos.getString(9);

                l = new Libro(nroSerie, nroPaginas, precioReferencia, editorial, Estado, anioPublicacion, titulo, ISBN, utilidad);
                
            }

        } catch (Exception e) {
            System.out.println("Controlador Libro (Buscar): "+ e.getMessage());
        }

        return l;
    }
    
    public boolean modificar(Libro obL){
        boolean correcto = false;
        
        try{
            Conexion obj = new Conexion();
            Connection conn = obj.conectar();
            Statement stmt = conn.createStatement();
            String sql = "update libro set ";
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return correcto;
    }
}
