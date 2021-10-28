package module3_Java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class seePrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String urlConn = "jdbc:mysql://localhost:3306/sales";
			Connection connection = DriverManager.getConnection(urlConn, "root", "root");
			PreparedStatement sql = connection.prepareStatement ("Select * from seeprices");
			ResultSet rs = sql.executeQuery();
			while(rs.next()) {
				String price = rs.getString("TopsPrices");
				System.out.println("Prices for the tops are $" + price);
			}
		} catch (Exception e) {
			System.out.println("Error getting data: "+ e.getMessage());
			
		}
		
		
		try {
			String urlConn = "jdbc:mysql://localhost:3306/sales";
			Connection connection = DriverManager.getConnection(urlConn, "root", "root");
			PreparedStatement sql = connection.prepareStatement("Select * from seeprices");
			ResultSet rs = sql.executeQuery();
			while(rs.next()) {
				String price1 = rs.getString("BottomsPrices");
				System.out.println("Prices for the bottoms are $" + price1);
			}
		} catch (Exception e) {
			System.out.println("Error getting data: "+ e.getMessage());
		}
	}
	}