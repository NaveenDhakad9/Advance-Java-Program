package jdbc;

import java.sql.*;

public class Demo
{
        public static void main(String[] args)
        {
        	try {
        	Class.forName("oracle.jdbc.driver.OracleDriver");
        	DriverManager.getConnection(
        			"jdbc:oracle:thin:@localhost:1521:orcl","system","Naveen");
        	System.out.println("Connection established Successfully.");
        	}
        	catch(ClassNotFoundException | SQLException e)
        	{
        		e.printStackTrace();
        	}
        }
}
