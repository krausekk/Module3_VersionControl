package module2_FrontEnd;

import java.util.ArrayList;
import java.util.Scanner;

public class FrontEnd {

	public static void main(String[] args) {
		
		ArrayList<String> boutique = new ArrayList<String>();
		
	//This creates the scanner object so we can take user input
		Scanner s = new Scanner(System.in);
		
		int input = 0;
		System.out.println("Please enter your choice.  \n Enter 1 to view products, \n Enter 2 to see product prices, \n Enter 3 to add product to cart, \n Enter 4 to add product to the website, \n Enter 5 to remove an item from the website, \n Enter 6 to add payment type");
		
		input = s.nextInt();
		
		if (input ==1) {
			ViewProduct(boutique);
		}
		else if (input == 2) 
			{
			SeePrices("$7.99", boutique);
			SeePrices("$10.99", boutique);
			SeePrices("$4.99", boutique);
			} 
		else if (input == 3) 
			{
				AddToCart("Booties", boutique);
				AddToCart("Onesie", boutique);
				AddToCart("Sleeper", boutique);
			}
		else if (input == 4)
			{
				AddProduct(boutique);
			}
			
		else if (input == 5)
		{
			RemoveProduct(boutique);
		}
		else
		{
			PaymentType(boutique);
		}
	}
		
	private static void PaymentType(ArrayList<String> boutique) {
		System.out.println("Please enter your payment information");
	}

	public static void RemoveProduct(ArrayList<String> boutique) {
		System.out.println("This item is no longer available");
	}
	public static void SeePrices(String price, ArrayList<String> boutique) {
		System.out.println("You are now able to view the product prices");
		System.out.println(price);
	}

	public static void ViewProduct(ArrayList<String> boutique) {
		System.out.println("Viewing the products");
	}

	public static void AddProduct(ArrayList<String> boutique) {
		System.out.println("Adding product to the website");
	}

	public static void AddToCart(String productDesc, ArrayList<String> boutique) {
		System.out.println("Added a Product to the cart");
		boutique.add(productDesc);
	}
}
