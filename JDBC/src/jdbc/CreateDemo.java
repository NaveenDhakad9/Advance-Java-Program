package jdbc;

import java.sql.*;

public class CreateDemo 
{
	public static void main(String[] args)
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl","system","Naveen");
			Statement stmt = con.createStatement();
			stmt.execute(
				"create table Student(rollNo number(6),Sname varchar2(10),Marks Number(3))");
			System.out.println("Table Created Successfully.");
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}

}
