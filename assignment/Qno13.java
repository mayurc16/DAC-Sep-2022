
package assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Qno13 {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/Assignment?useSSL=false","root","password");
			System.out.println("Enter Empid You Want to search");
			int id= sc.nextInt();
			PreparedStatement s=con.prepareStatement("select * from employee join eaddress on employee.Empid=eaddress.Empid where Employee.EmpID=?");
			s.setInt(1,id);
			ResultSet rs=s.executeQuery();
			if (rs.next()) 
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getInt(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getInt(8));
			}
			else 
			{
				System.out.println("No Records Found");
			}
		
			s.close();
			con.close();
			 
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}

	}
	

}
