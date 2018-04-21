package databaseexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DataBaseExample {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Employee","pallavi","pallavi");
        
        Scanner sc=new Scanner(System.in);
        PreparedStatement pst=
                con.prepareStatement("insert into details values (?,?) ");
        
        System.out.println("Please enter employee id : ");
        int epid=sc.nextInt();
        System.out.println("Please enter employee name : ");
        String epnm=sc.next();
        
        pst.setInt(1, epid);
        pst.setString(2, epnm);
        
        int t=pst.executeUpdate();
        if(t>0)
            System.out.println("Data Inserted!!!");
        
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from details");
        
        while(rs.next())
        {
            int eid=rs.getInt(1);
            String ename=rs.getString(2);
            System.out.print(rs.getInt(1)+" --> ");
            System.out.println(rs.getString("ename"));
        }
    }
}
