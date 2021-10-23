package module4;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileOperationsAssignment {
	public static void main(String[] args) {
		//Declare filepath of CSV file (can be .txt or .csv)
		String filePath = "C:\\Users\\kksab\\OneDrive\\Documents\\Java Programming\\File Operations Data Set.csv";
		
		//Creates buffered stream for better efficiency.
		//Uses try-with-resources to make sure resources get closed properly.
		try (BufferedReader bReader = new BufferedReader(new FileReader(filePath))){
			//Create List of Lists
			List<List<String>> fileValues = new ArrayList<>();
			
    		//Reads through every line and adds values into an array.
    		//The values in each line are split up based on the ",".
    		//The array is then converted to a list and added to the parent list.
			String readerLine;
    		while ((readerLine = bReader.readLine()) != null) {
    			String[] lineValues = readerLine.split(",");
    			fileValues.add(Arrays.asList(lineValues));
    		}

    		//Loops through each "row" and prints the values out.
    		for(int i=0;i<fileValues.size();i++) {
    			System.out.println(fileValues.get(i));
    		}
    		//fileValues.forEach(value -> System.out.println(value));
    		
    		//Find the report year total.
    		int reportYearTotal = 0;
    		//We just want the values in the last row so we first find the index of the last row
			int lastColumnIndex = fileValues.get(0).size()-1;
    		//Starts at index of 1 because of headers.
    		for(int i=1; i< fileValues.size();i++) {
    			//Good place to check if value is a number
    			reportYearTotal += Integer.parseInt(fileValues.get(i).get(lastColumnIndex));
    		}
    		
    		StringBuilder sb = new StringBuilder();
			sb.append("Report Year Total: ");
		
			sb.append(reportYearTotal);//Report Year Total
			
			try(BufferedWriter bWriter = new BufferedWriter(new FileWriter("C:\\Users\\kksab\\OneDrive\\Documents\\Java Programming\\ReportYearTotal.csv")))
					{
			//Writes to the file
			bWriter.write(sb.toString());
					}
    	} 
    	catch (Exception e){
    		System.out.print(e.getMessage());
    	}
		finally {
			System.out.println("The program is exiting...");
		}
    }
}