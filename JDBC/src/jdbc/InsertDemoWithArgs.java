package jdbc;
import java.sql.*;

public class InsertDemoWithArgs 
{
	public static void main(String[] args)
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl","system","Naveen");
			PreparedStatement pstmt = con.prepareStatement(
					"insert into student values(?,?,?)");
			pstmt.setInt(1,Integer.parseInt(args[0]));
			pstmt.setString(2,args[1]);
			pstmt.setInt(3,Integer.parseInt(args[2]));
			pstmt.executeUpdate();
			System.out.println("one Record inserted Successfully.");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
