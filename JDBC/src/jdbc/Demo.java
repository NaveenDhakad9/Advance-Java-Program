package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo
{
        public static void main(String[] args)
        {
        	try {
        	Class.forName("oracle.jdbc.driver.OracleDriver");
        	Connection con = DriverManager.getConnection(
        			"jdbc:oracle:thin:@localhost:1521:orcl","system","Naveen");
        	System.out.println("Connection established Successfully.");
        	}
        	catch(ClassNotFoundException | SQLException e)
        	{
        		e.printStackTrace();
        	}
        }
}
