package module2;
import java.util.Scanner;


public class InsuranceCategory
{

	public static void main(String[] args) 
	{
		
		//This creates the scanner object so we can take user input
		Scanner s = new Scanner(System.in);
		
		//Asks user for input
		System.out.println("What's your name?");
		
		//Waits for user input and assigns it to a String variable (UsersName)
		String UsersName = s.nextLine();
		//Asks user for input
		System.out.println("What's your height in inches?");
		
		//Gets users height and assigns it to a string variable (UsersHeight)
		float UsersHeight = s.nextFloat();
		//Asks user for input
		System.out.println("What's your weight in pounds?");
		
		//Waits for user input and assigns it to a String variable (UsersWeight)
		float UsersWeight = s.nextFloat();
		
		// Calculating BMI
		float bmi = (UsersWeight * 703) / (UsersHeight * UsersHeight);
		
		//Declaring payment variable
		String payment = "";
		
		//Validating which BMI category the user is in
		 String result = "";
		
		if (bmi < 18.5) 
		{
            result = "underweight";
            payment = "low";
        } 
		else if (bmi < 25) 
		{
            result = "normal weight";
            payment = "low";
        } 
		else if (bmi < 30) 
		{
            result = "overweight";
            payment = "high";
        } 
		else if (bmi > 29.9)
		{
            result = "obese";
            payment = "highest";
        }
		
		// Displaying the users name and BMI category
		System.out.println();
		System.out.println(UsersName + " " + "your BMI is " + bmi + " which means you are " + result + " " + "therefore your insurance payment is" + " " + payment + ".");
		System.out.println();
		
		//Closing scanner
		s.close(); 
		
		//Let's user know that we are done with the questions
		 System.out.println("Thank you for your input!!");
	}
}