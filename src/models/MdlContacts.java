
package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;


public class MdlContacts extends DBConnect {
    Connection con = getConnection();
    
    public ArrayList<Contacts> getContacts() {
        ArrayList<Contacts> contacts = new ArrayList<>();
        String sqlQuery = "SELECT id, document, fullname, email, smartphone FROM people";
        
        try {
            PreparedStatement ps = con.prepareStatement(sqlQuery);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Contacts person = new Contacts(
                        rs.getInt("id"),
                        rs.getString("document"),
                        rs.getString("fullname"),
                        rs.getString("email"),
                        rs.getString("smartphone")
                    );
                contacts.add(person);
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: No se pudo leer los contactos.");
            return (ArrayList<Contacts>) Collections.EMPTY_LIST;
            
        }
        
        return contacts;
    }
    
    public int saveContact(Contacts contact) {
        String sqlQuery = "INSERT INTO people (document, fullname, email, smartphone) VALUES (?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sqlQuery);
            ps.setString(1, contact.getDocument());
            ps.setString(2, contact.getFullname());
            ps.setString(3, contact.getEmail());
            ps.setString(4, contact.getSmartphone());
            
            return ps.executeUpdate();
            
        } catch (SQLException e) {
            return 0;
            
        }
    }
    
    public int updateContact(Contacts contact, int id) {
        String sqlQuery = "UPDATE people SET document = ?, fullname = ?, email = ?, smartphone = ? WHERE id = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sqlQuery);
            ps.setString(1, contact.getDocument());
            ps.setString(2, contact.getFullname());
            ps.setString(3, contact.getEmail());
            ps.setString(4, contact.getSmartphone());
            ps.setInt(5, id);
            
            return ps.executeUpdate();
            
        } catch (SQLException e) {
            return 0;
        }
    }
    
    public int deleteContact(int id) {
        String sqlQuery = "DELETE FROM people WHERE id = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sqlQuery);
            ps.setInt(1, id);
            
            return ps.executeUpdate();
            
        } catch (SQLException e) {
            return 0;
        }
    }
}
