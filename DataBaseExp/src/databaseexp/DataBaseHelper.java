package databaseexp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataBaseHelper {

    Connection con;
    Statement st;
    ResultSet rs;
    Scanner sc;
    PreparedStatement pst;

    public DataBaseHelper() {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/Emp", "pal", "pal");
            pst = con.prepareStatement("insert into Details values (?,?)");
            sc = new Scanner(System.in);
            st = con.createStatement();
        } catch (ClassNotFoundException ex) {
        } catch (SQLException ex) {
        }
    }

    public boolean insertData() {
        try {
            System.out.println("Please Enter a Employee Id : ");
            String eid = sc.next();
            System.out.println("Please Enter a Employee Name : ");
            String enm = sc.next();
            pst.setString(1, eid);
            pst.setString(2, enm);
            pst.executeUpdate();
        } catch (SQLException ex) 
        {     
        }
        return true;
    }

}
