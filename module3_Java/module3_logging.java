package module3_Java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;


public class module3_logging 
{		
	private static Logger logger = Logger.getLogger(module3_logging.class.getName());
	        
	public static void main(String[] args) 
	{
		logger.info("Logger Name: "+logger.getName());
		logger.warning("Can cause ArrayIndexOutOfBoundsException \n");
		LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME).setLevel(Level.FINE);
			
		try {
			String urlConn = "jdbc:mysql://localhost:3306/sales";
			Connection connection = DriverManager.getConnection(urlConn, "root", "root");
			System.out.println("Connection Successful \n");
		} catch (Exception e) {
			System.out.println("Error Connecting to database:" + e.getMessage());
		}
		
		ArrayList<String> boutique = new ArrayList<String>();
			
			
			//This creates the scanner object so we can take user input
			Scanner s = new Scanner(System.in);
			
			int input = 0;
			System.out.println("\nWelcome to Bambino's Children's Boutique please enter your choice to continue.  \n Enter 1 to view products, \n Enter 2 to see product prices, \n Enter 3 to add product to cart, \n Enter 4 to add product to the website, \n Enter 5 to remove an item from the website, \n Enter 6 to add payment type");
			
			input = s.nextInt();
			
			logger.config("input is set to  " +input);
			
			try {
				if (input ==1) {
					ViewProduct.main(args);
				}
				else if (input == 2) 
					{
					seePrices.main(args);
					//SeePrices("$7.99", boutique);
					//SeePrices("$10.99", boutique);
					//SeePrices("$4.99", boutique);
					} 
				else if (input == 3) 
					{
						addProduct.main(args);
						//AddToCart("Booties", boutique);
						//AddToCart("Onesie", boutique);
						//AddToCart("Sleeper", boutique);
					}
				else if (input == 4)
					{
						addWebsiteProduct.main(args);
					}
					
				else if (input == 5)
				{
					RemoveProduct.main(args);
				}
				else
				{
					PaymentType.main(args);
				}
			}
				catch (ArrayIndexOutOfBoundsException ex)
				{
						logger.log(Level.SEVERE, "Exception occur", ex);
				}
			
				MyFormatter.main(args);
				MyHandler.main(args);
			}
//		// Enter customer payment information
//		private static void PaymentType(ArrayList<String> boutique) {
//			System.out.println("Please enter your payment information");
//		}
//		// Remove products from the website
//		public static void RemoveProduct(ArrayList<String> boutique) {
//			System.out.println("This item is no longer available");
//		}
//		// Customer can view product prices
//		public static void SeePrices(String price, ArrayList<String> boutique) {
//			System.out.println("You are now able to view the product prices");
//			System.out.println(price);
//		}
//		// Customer can view the products on the website
//		public static void ViewProduct(ArrayList<String> boutique) {
//			System.out.println("Viewing the products");
//		}
//		// Owner can add product to the website
//		public static void AddProduct(ArrayList<String> boutique) {
//			System.out.println("Adding product to the website");
//		}
//		// Customer can add an item to the cart
//		public static void AddToCart(String productDesc, ArrayList<String> boutique) {
//			System.out.println("Added a Product to the cart");
//			boutique.add(productDesc);
//		}
}