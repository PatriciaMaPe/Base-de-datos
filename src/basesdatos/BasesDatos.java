/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basesdatos;

import java.sql.Connection;

/**
 *
 * @author Patripon
 */
public class BasesDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conector conector = new Conector("127.0.0.1", "root", "123", "usuarios");
        ConsultasSQL consulta = new ConsultasSQL(conector.getConexion(), "select * from usuarios");
        System.out.println(consulta.getDatosDevueltos());
        System.out.println(consulta.getNombresColumnas());
        
    }
    
}
