package module1_SingletonPattern;

import java.util.Scanner;

public class PersonType {
	
	private static PersonType personType = new PersonType();

	public String fName;
	public String mName;
	public String lName;
	
	public String getName() 
	{
		return mName;
	}
	
	private PersonType()
	{
		
	}
	
	public static PersonType getInstance(){
		
		return personType;
	}
	
	public void Name()
	{
		System.out.println("You will be asked to enter your name in the following prompts");
		
		//This creates the scanner object so we can take user input
		Scanner s = new Scanner(System.in);
				
		//Asks user for input
		System.out.println("What is your first name?");
				
		//Waits for user input and assigns it to a String variable (fName)
		fName = s.nextLine();
		
		//Asks user for input
		System.out.println("What is your middle name?");
						
		//Waits for user input and assigns it to a String variable (fName)
		mName = s.nextLine();
		
		//Asks user for input
		System.out.println("What is your last name?");
				
		//Waits for user input and assigns it to a String variable (fName)
		lName = s.nextLine();
		
		System.out.println("First name: " + fName);
		System.out.println("Middle name: " + mName);
		System.out.println("Last name: " + lName);
	
		System.out.println("Your full name is: " + fName + " "+ mName + " " + lName);
		
		//Closing scanner
		s.close();
	}
}