package Module6;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Module6ClassProject implements PatientInfo {

	@Override
	public double BMI(String UsersWeight, String UsersHeight) {
		// Calculating BMI
		double bmi = ((Double.parseDouble(UsersWeight) * 703) / Math.pow(Double.parseDouble(UsersHeight), 2));
		return bmi;
	}

	public static void main(String[] args) {
		// This creates the scanner object so we can take user input
		Scanner s = new Scanner(System.in);
		Module6ClassProject object = new Module6ClassProject();

		try (BufferedWriter bWriter = new BufferedWriter(
				new FileWriter("C:\\Users\\kksab\\OneDrive\\Documents\\Java Programming\\BMICalculations.csv")))

		{
			// Create list that contains lists of strings
			Queue<List<String>> outputValue = new LinkedList<>();
			
			while (true) {
				List<String> output = new ArrayList<>();

				// Asks user for input
				System.out.println("What's your name?");
				String UsersName = s.nextLine();
				output.add(UsersName);

				// Asks user for input
				System.out.println("What's your height in inches?");
				String UsersHeight = s.nextLine();
				output.add(UsersHeight);

				// Asks user for input
				System.out.println("What's your weight in pounds?");
				String UsersWeight = s.nextLine();
				output.add(UsersWeight);

				double bmi = object.BMI(UsersWeight, UsersHeight);
				
				//Validating which BMI category the user is in
				String result = "";

				//Declaring payment variable
				String payment = "";

				if (bmi < 18.5) {
					result = "underweight";
					payment = "low";
				} else if (bmi < 25) {
					result = "normal weight";
					payment = "low";
				} else if (bmi < 30) {
					result = "overweight";
					payment = "high";
				} else if (bmi > 29.9) {
					result = "obese";
					payment = "highest";
				}

				output.add(result);
				output.add(payment);
				outputValue.add(output);
				
				System.out.println("Press any key to continue or 'q' to quit.");
				if (s.nextLine().equals("q")) {
					break;
				}
			}

			StringBuilder sb = new StringBuilder();
			sb.append("Name");
			sb.append(",");
			sb.append("Height");
			sb.append(",");
			sb.append("Weight");
			sb.append(",");
			sb.append("BMI Category");
			sb.append(",");
			sb.append("Insurance Category");
			sb.append(",");
			sb.append(System.lineSeparator());

			// Add the headers to the file
			bWriter.write(sb.toString());

			
			while(! outputValue.isEmpty()) 
			{
				List<String> L = new ArrayList<String>();
				L= outputValue.remove();
				
				// Clear out the StringBuilder
				sb.delete(0, sb.length());

				sb.append(L.get(0));// Name
				sb.append(",");
				sb.append(L.get(1));// Height
				sb.append(",");
				sb.append(L.get(2));// Weight
				sb.append(",");
				sb.append(L.get(3));// BMI Category
				sb.append(",");
				sb.append(L.get(4));// Insurance Category
				sb.append(System.lineSeparator());

				// Writes to the file
				bWriter.write(sb.toString());
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}

		finally {
			// Close scanner
			s.close();
			System.out.println("Scanner Closed");
		}
	}
}