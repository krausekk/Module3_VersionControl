package module3_Java;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ViewProduct {

	public static void main(String[] args) {
			
				try {
					String urlConn = "jdbc:mysql://localhost:3306/sales";
					Connection connection = DriverManager.getConnection(urlConn, "root", "root");
					PreparedStatement sql = connection.prepareStatement ("Select * from viewproducts");
					ResultSet rs = sql.executeQuery();
					while(rs.next()) {
						String Tops = rs.getString("Tops");
						System.out.println("Here are the tops that we have in stock " + Tops);
					}
				} catch (Exception e) {
					System.out.println("Error getting data: "+ e.getMessage());
				}
				
				try {
					String urlConn = "jdbc:mysql://localhost:3306/sales";
					Connection connection = DriverManager.getConnection(urlConn, "root", "root");
					PreparedStatement sql = connection.prepareStatement("Select * from viewproducts");
					ResultSet rs = sql.executeQuery();
					while(rs.next()) {
						String Bottoms = rs.getString("Bottoms");
						System.out.println("Here are the bottoms that we have in stock " + Bottoms);
					}
				} catch (Exception e) {
					System.out.println("Error getting data: "+ e.getMessage());
				}
	}

}
