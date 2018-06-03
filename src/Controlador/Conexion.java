package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    public Connection conectar()
    {
        try
        {

            Class.forName("com.mysql.jdbc.Driver").newInstance();

            return DriverManager.getConnection("jdbc:mysql://localhost/Biblioteca?user=root");
        }
        catch (Exception except)
        {
            except.printStackTrace();
        }
        return null;
    }
}
