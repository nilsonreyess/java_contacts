
package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBConnect {
    public final String URLDB = "jdbc:mysql://localhost:3306/";
    public final String USERDB = "root";
    public final String PASSDB = "";
    public final String DBNAME = "contacts";
    
    public Connection getConnection() {
        Connection con = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URLDB + DBNAME, USERDB, PASSDB);
            
        } catch (ClassNotFoundException|SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: NO fue posible conectarme a la base de datos.");
            System.exit(0);
            
        }
        
        return con;
        
    }
}
