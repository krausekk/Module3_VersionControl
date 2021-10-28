package module3_Java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class addProduct {
	

	public static void main(String[] args) {
	
		try {
			String urlConn = "jdbc:mysql://localhost:3306/sales";
			Connection connection = DriverManager.getConnection(urlConn, "root", "root");
			PreparedStatement sql = connection.prepareStatement ("Select * from addtocart");
			ResultSet rs = sql.executeQuery();
			while(rs.next()) {
				String Tops = rs.getString("product");
				System.out.println("The top that you have added to the cart is a " + Tops);
			}
		} catch (Exception e) {
			System.out.println("Error getting data: "+ e.getMessage());
		}
		
		try {
			String urlConn = "jdbc:mysql://localhost:3306/sales";
			Connection connection = DriverManager.getConnection(urlConn, "root", "root");
			PreparedStatement sql = connection.prepareStatement("Select * from addtocart");
			ResultSet rs = sql.executeQuery();
			while(rs.next()) {
				String Bottoms = rs.getString("product");
				System.out.println("The bottom that you have added to the cart is " + Bottoms);
			}
		} catch (Exception e) {
			System.out.println("Error getting data: "+ e.getMessage());
		}
	}
}
