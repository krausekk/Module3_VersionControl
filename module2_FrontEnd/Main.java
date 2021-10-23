package module2_FrontEnd;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//ArrayList<String> infantClothes = new ArrayList<String>();

		//This creates the scanner object so we can take user input
				Scanner s = new Scanner(System.in);
				
				//Asks user for input
				System.out.println("Please enter your choice.  \n Enter 1 to view products, \n Enter 2 to see product prices, \n Enter 3 to add product to cart, \n Enter 4 to add product to the website");
				
				//Waits for user input and assigns it to a String variable (UsersName)
				int ViewProducts = s.nextInt();
				
				if (ViewProducts == 1) {
					System.out.println("You chose" + " " + ViewProducts + " " + "you may now view our products");
				} else if 
					(ViewProducts == 2){
						System.out.println("You chose" + " " + ViewProducts + " " + "you may now view the prices of our products");
					} else if
					 (ViewProducts == 3) {
						System.out.println("You chose" + " " + ViewProducts + " " + "you may now add your products to the cart");
						}
					}

				}