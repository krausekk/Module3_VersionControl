package module3_Java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		
		try {
		String urlConn = "jdbc:mysql://localhost:3306/sales";
		Connection connection = DriverManager.getConnection(urlConn, "root", "root");
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your first name");
		String firstName = s.nextLine();
		
		System.out.println("Enter your last name");
		String lastName = s.nextLine();
		
		System.out.println("Enter your email address");
		String email = s.nextLine();
		
		System.out.println("Enter your city");
		String city = s.nextLine();
		
		// input users answers into database
		String sql1 = "INSERT INTO customer (Last_name, First_name, Email, City) VALUES(?, ?, ?, ?)";
		
		
		PreparedStatement sql2 = connection.prepareStatement(sql1);
		
		sql2.setString(1, lastName);
		sql2.setString(2, firstName);
		sql2.setString(3, email);
		sql2.setString(4, city);
		
		sql2.executeUpdate();
		
		} catch (Exception e) {
				System.out.println("Error getting data: "+ e.getMessage());
		}
	

	}

}
