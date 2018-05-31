package simplejdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SimpleJDBCExample {

    String str;

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Employee e=new Employee();
                
        
        e.insertData();
        
        
        
        
        
        
        
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Employee", "pal", "pal");
        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("select * from Details");

        while (rs.next()) {
            System.out.println("Emp ID : " + rs.getInt("eid") + " Emp name : " + rs.getString(2));
        }
        con.close();
    }

}
