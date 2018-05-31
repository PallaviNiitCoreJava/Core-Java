package jdbcadvexp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCAdvExp {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
          Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/StudentDetails", "pallavi", "pallavi");
        
       String str="create procedure myProc"
               + "as"
               + "begin"
               + "select sid,sname from data;"
               + "end";
        Statement st=con.createStatement();
        int i=st.executeUpdate(str);
        
        if(i>=1)
            System.out.println("Procedure is created.");
        
    }
    void tp()
    {}
    
}
