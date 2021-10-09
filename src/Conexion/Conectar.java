package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conectar {

    
    static String bd = "archivos";
    static String login = "admin";
    static String password = "PeLoTeRo10&";
    static String as = "archivos.cgpbkqqrcou0.us-east-2.rds.amazonaws.com";
    static String url = "jdbc:mysql://"+as+"/"+bd;
    Connection connection = null;

    public Conectar() {
        
        try {
            JOptionPane.showMessageDialog(null, "Cargando datos, espere un momento...");
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, login, password);
            if (connection != null) {
                JOptionPane.showMessageDialog(null, "Conexión exitosa");
                System.out.println("Conexión a base de datos " + bd + " OK\n");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void desconectar() {
        try {
            connection.close();
        } catch (Exception ex) {
        }
    }

}
