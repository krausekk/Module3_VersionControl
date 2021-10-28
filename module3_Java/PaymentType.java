package module3_Java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PaymentType {

	public static void main(String[] args) {
		try {
			String urlConn = "jdbc:mysql://localhost:3306/sales";
			Connection connection = DriverManager.getConnection(urlConn, "root", "root");
			PreparedStatement sql = connection.prepareStatement ("Select * from paymenttype");
			ResultSet rs = sql.executeQuery();
			while(rs.next()) {
				String amount = rs.getString("amount");
				System.out.println("You are paying for your items with " + amount);
			}
		} catch (Exception e) {
			System.out.println("Error getting data: "+ e.getMessage());
		}

	}

}
