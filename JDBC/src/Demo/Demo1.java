package Demo;
import java.sql.*;

public class Demo1
{
	public static void main(String[] args)
	{
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:xe","System","Naveen");
			System.out.println("Connection established Successfully");
			
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}
}
