package jdbc;
import java.sql.*;
import java.util.*;
public class InsertDemoWithScannerClass 
{
	public static void main(String[] args)
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl","system","Naveen");
			PreparedStatement pstmt = con.prepareStatement(
					"Select * from student where rollno=?");
			Scanner s = new Scanner(System.in);
			System.out.println("Enter RollNumber : ");
			int rolllno = s.nextInt();
			pstmt.setInt(1, rolllno);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			System.out.print(rs.getInt(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.println(rs.getInt(3)+"\t");
			
			s.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
