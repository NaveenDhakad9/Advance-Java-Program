package jdbc;
import java.sql.*;

public class InsertDemo 
{
    public static void main(String[] args) 
    {
    	try
    	{
    	   Class.forName("oracle.jdbc.driver.OracleDriver");
    	   Connection con = DriverManager.getConnection(
    			 "jdbc:oracle:thin:@localhost:1521:orcl","system","Naveen");
    	   Statement stmt = con.createStatement();
    	   stmt.executeUpdate("insert into student values(1,'Naveen',98)");
    	   System.out.println("One Record Inserted Successfully.");
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
}
