package module3_Java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class addWebsiteProduct {
	

	public static void main(String[] args) {
	
		try {
			String urlConn = "jdbc:mysql://localhost:3306/sales";
			Connection connection = DriverManager.getConnection(urlConn, "root", "root");
			PreparedStatement sql = connection.prepareStatement ("Select * from addproduct");
			ResultSet rs = sql.executeQuery();
			while(rs.next()) {
				String Tops = rs.getString("Tops");
				System.out.println("The top that I have added to the website is a " + Tops);
			}
		} catch (Exception e) {
			System.out.println("Error getting data: "+ e.getMessage());
		}
		
		try {
			String urlConn = "jdbc:mysql://localhost:3306/sales";
			Connection connection = DriverManager.getConnection(urlConn, "root", "root");
			PreparedStatement sql = connection.prepareStatement("Select * from addproduct");
			ResultSet rs = sql.executeQuery();
			while(rs.next()) {
				String Bottoms = rs.getString("Bottoms");
				System.out.println("The bottom that I have added to the website is " + Bottoms);
			}
		} catch (Exception e) {
			System.out.println("Error getting data: "+ e.getMessage());
		}
	}
}
