package module3;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) 
	{
		Random random = new Random();
		int arrayCount = 1000;
		int minimumValue = 1;
		int maximumValue = 10000;
				
		int[] randomArray = random.ints(arrayCount, minimumValue, maximumValue + 1).toArray();
		System.out.println(Arrays.toString(randomArray));
		

		Arrays.sort(randomArray);
		System.out.println(Arrays.toString(randomArray));
		
		try
		{
		Arrays.sort(randomArray);
		System.out.println("Maximum number = " + randomArray[randomArray.length - 1]);
		System.out.println("Minimum number = " + randomArray[0]);
		OptionalDouble average = Arrays.stream(randomArray).average();
        System.out.println("Average: " + average); 	
		}
		catch(Exception e) 
		{
			System.out.println("Something went wrong.");
			System.out.println("Exception: '" + e.getMessage() + "'");
			return;
		}

		finally 
		{	
			System.out.println("Finally Block executed");
		}
		}
		
	}
