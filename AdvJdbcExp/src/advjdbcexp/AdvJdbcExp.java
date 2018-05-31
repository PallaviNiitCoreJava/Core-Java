/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advjdbcexp;

import java.sql.Connection;
import java.sql.DriverAction;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class AdvJdbcExp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=User","sa","faculty");
        System.out.println("Connection Successful!!!");
        
        PreparedStatement pst=con.prepareStatement("insert into Details values (?,?)");
        
        pst.setString(1, "u001");
        pst.setString(2, "Pallavi");
        
        long l=pst.executeUpdate();
        if(l>0)
        {
            System.out.println("Inserted Successfully!!!");
        }
    }
    
}
