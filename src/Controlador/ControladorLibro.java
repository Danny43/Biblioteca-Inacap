/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Compra;
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
                    + "   inner join utilidad on utilidad.idutilidad = utilidad_idutilidad where nro_serie = '" + nroserie + "'";
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
            System.out.println("Controlador Libro (Buscar): " + e.getMessage());
        }

        return l;
    }

    public boolean modificar(Libro obL, int idIdioma) {
        boolean correcto = false;

        try {
            Conexion obj = new Conexion();
            Connection conn = obj.conectar();
            Statement stmt = conn.createStatement();
            String sql = "update libro set nro_paginas = '"+obL.getNro_paginas()+"', precio_referencia = '"+obL.getPrecio_referencia()+"', Editorial_idEditorial = '"+obL.getIDeditorial()+"', estado_libro_idestado_libro = '"+obL.getIDestado()+"', anio_publicacion_idanio_publicacion = '"+obL.getIDanio_publicacion()+"', titulo_libro_idtitulo_libro = '"+obL.getIDtitulo()+"', ISBN_idISBN = '"+obL.getIDISBN()+"', utilidad_idutilidad = '"+obL.getIDutilidad()+"' where nro_serie = '"+obL.getNro_serie()+"' ";
            int op = stmt.executeUpdate(sql);
            sql = "update idioma_has_libro set idioma_ididioma = '"+idIdioma+"' where libro_nro_serie = '"+obL.getNro_serie()+"' ";
            int op2 = stmt.executeUpdate(sql);
            if(op > 0 & op2 > 0){
                correcto = true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return correcto;
    }

    public boolean agregarIdCompra(Libro libro, Compra compra) {
        boolean correcto = false;

        try {
            Conexion obj = new Conexion();
            Connection conn = obj.conectar();
            Statement stmt = conn.createStatement();
            String sql = "update libro set compra_idcompra = '" + compra.getId() + "' where nro_serie = '" + libro.getNro_serie() + "'";
            int op = stmt.executeUpdate(sql);

            if (op > 0) {
                correcto = true;
            }

        } catch (Exception e) {
            System.out.println("Controlador Libro (agregarIdCompra): " + e.getMessage());
        }

        return correcto;
    }

    public boolean agregarIdArriendo(String nroSerie, int idArriendo) {
        boolean correcto = false;
        try {
            Conexion obj = new Conexion();
            Connection conn = obj.conectar();
            Statement stmt = conn.createStatement();
            String sql = "update libro set arriendo_idarriendo = '" + idArriendo + "', estado_libro_idestado_libro = '" + 3 + "' where nro_serie = '" + nroSerie + "'";
            int op = stmt.executeUpdate(sql);
            if (op > 0) {
                correcto = true;
            }
            obj.conectar();
            conn.close();
        } catch (Exception e) {
            System.out.println("Controlador Libro (asignarIdArriendo): " + e.getMessage());
        }
        return correcto;
    }

    public boolean asociadoACompra(String nro_serie) {
        boolean asociado = false;
        int idcompra = 0;
        try {
            Conexion obj = new Conexion();
            Connection conn = obj.conectar();
            Statement stmt = conn.createStatement();
            String sql = "select * from libro where nro_serie = '" + nro_serie + "'";
            ResultSet dato = stmt.executeQuery(sql);
            if (dato.next()) {
                try {
                    idcompra = dato.getInt(5);
                } catch (Exception ex) {
                    idcompra = 0;
                }

            }
        } catch (Exception e) {
            System.out.println("Controlador Libro (asociadoACompra):" + e.getMessage());
        }

        if (idcompra > 0) {
            asociado = true;
        }

        return asociado;
    }

    public ArrayList<Libro> LibrosArriendo() {
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
                    + "   inner join utilidad on utilidad.idutilidad = utilidad_idutilidad where utilidad_idutilidad = 2 and estado_libro_idestado_libro = 1;";
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

            stmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("Controlador Libro (LibrosArriendo): " + e.getMessage());
        }

        return lista;
    }

    public boolean eliminar(String nroSerie) {
        {
            boolean correcto = false;

            try {

                Conexion obj = new Conexion();
                Connection conn = obj.conectar();
                Statement stmt = conn.createStatement();
                String sql = "delete from libro where nro_serie = '" + nroSerie + "'";
                int op = stmt.executeUpdate(sql);

                if (op > 0) {
                    correcto = true;
                }

            } catch (Exception e) {
                System.out.println("Controlador Libro (eliminar): " + e.getMessage());
            }

            return correcto;
        }

    }

}
