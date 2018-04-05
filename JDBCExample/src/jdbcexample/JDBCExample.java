
package jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.derby.iapi.reference.ClassName;

public class JDBCExample {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/StudentDetails","pallavi","pallavi");
        
        Statement st=con.createStatement();
        
        ResultSet rs=st.executeQuery("select * from Data");
        
        while(rs.next())
        {
            System.out.println(rs.getInt("sid"));
            System.out.println(rs.getString("sname"));
        }
        
    }
    
}
