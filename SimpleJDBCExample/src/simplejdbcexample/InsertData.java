package simplejdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertData {
 public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Scanner sc=new Scanner(System.in);
        int id;
        String nm;
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Employee", "pal", "pal");
        PreparedStatement pst=con.prepareStatement("insert into Details values (?,?)");
        System.out.println("Enter Emp id : ");
        id=sc.nextInt();
        System.out.println("Enter Emp Name : ");
        nm=sc.next();
        pst.setInt(1, id);
        pst.setString(2, nm);
        
        if(pst.executeUpdate()>0)
            System.out.println("Data Inserted Sucessfully");
        
        con.close();
    }


}
