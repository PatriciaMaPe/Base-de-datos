package basesdatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {

    Connection conexion;
    String error;

    /*Creamos un constructor que recibe cuatro parametros:
     direccion del servidor MySQL, usuario, contraseña del servidor y
     nombre de la base de datos
     */
    public Conector(String host, String usuario, String pw, String base) {
        try {
            /*Creamos una asociacion entre nuestra aplicacion y la clase
             Driver que esta empaquetada en el jar de conexion
             */
            Class.forName("com.mysql.jdbc.Driver");
            /*La conexion se obtiene con una cadena que usa los 
             parametros que recibe el constructor
             */
            conexion = DriverManager.getConnection("jdbc:mysql://" + host + "/" + base, usuario, pw);
        } //Si no se encuentra el Driver se lanza la excepcion:
        catch (ClassNotFoundException e) {
            System.out.println("No se ha podido crear asociacion");
            System.out.println("Error" + e.getMessage());
            error=e.getMessage();
        } //Si no se puede crear la conexion se lanza la excepcion:
        catch (SQLException e) {
            System.out.println("No se ha podido crear conexion");
            System.out.println("Error" + e.getMessage());
            error=e.getMessage();
        }
    }

    //Metodo que devuelve la conexion
    public Connection getConexion() {
        return conexion;
    }

    //Metodo que cierra la conexion
    public void cerrarConexion() {
        try {
            conexion.close();
        } catch (Exception ex) {
            System.out.println("Error" + ex.getMessage());
        }
    }

    public String getError() {
        return error;
    }
    
    

}
