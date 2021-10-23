package module2Assignment;

import java.util.Arrays;

public class ChildClass extends BaseClass
{
	
	public void AddNumbers(int[] NumberSort)
	{	
		SortAndPrintArray(NumberSort);
		
		int total = Arrays.stream(NumberSort).sum();
		System.out.println("Total: " + total);
	}
}