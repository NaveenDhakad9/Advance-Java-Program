package jdbc;
import java.sql.*;
public class DemoDate 
{
     public static void main(String args[])
     {
    	 try
    	 {
    		 Class.forName("oracle.jdbc.driver.OracleDriver");
    		 Connection con = DriverManager.getConnection(
    				 "jdbc:oracle:thin:@localhost:1521:orcl","system","Naveen");
    		 
    		 PreparedStatement pstmt = con.prepareStatement(
    				 "insert into emp value(?,?,?)");
    		 pstmt.setInt(1, Integer.parseInt(args[0]));
    		 pstmt.setString(2,args[1]);
    		 pstmt.setDate(3,Date.valueOf(args[2]));
    		 pstmt.executeUpdate();
    		 System.out.println("One Record Inserted Successfully");		 
    	 }
    	 catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
     }
}
