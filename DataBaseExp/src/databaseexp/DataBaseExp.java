package databaseexp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DataBaseExp {
    
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        
        DataBaseHelper dbh=new DataBaseHelper();
        if(dbh.insertData())
        {
            System.out.println("Data Inserted!");
        }
        
        /*
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Emp", "pal", "pal");
        
        
        PreparedStatement pst=con.prepareStatement("insert into Details values (?,?)");
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter a Employee Id : ");
        String eid=sc.next();
        System.out.println("Please Enter a Employee Name : ");
        String enm=sc.next();
        pst.setString(1, eid);
        pst.setString(2, enm);
        
        pst.executeUpdate();
        
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from Details");
        while(rs.next())
        {
            System.out.print(rs.getString("eid")+"    ");
            System.out.println(rs.getString("ename"));
        }

        */
        
    }
    
}
