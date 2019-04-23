
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import parlorathand.CustomerRegistration_frame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aspire
 */
public class DBConnection {
   public Connection getConnection(){
    Connection con=null;
    try 
    {
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/parlor","root","");
        JOptionPane.showMessageDialog(null,"Connected");
        return con;
    } 
    catch (SQLException ex) 
    {
        Logger.getLogger(CustomerRegistration_frame.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null,"Not Connected");
        return null;
    }
    }
}
