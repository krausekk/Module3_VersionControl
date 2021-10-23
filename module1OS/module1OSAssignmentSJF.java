package module1OS;

public class module1OSAssignmentSJF {

	public static void main(String[] args) {
		// Shortest Job First
		String Process[] = {"p1", "p2", "p3", "p4", "p5"};int AT2[] = {0,1,2,3,4};
				int BT2[] = {4,13,29,6,19};
				int CT2 = 0;
				int WT2 = 0;
				int TWT2 = 0;
				int Avg2 = 0;
				// Shortest Job First Calculations
			 	for(int i=0;i<Process.length;i++) 
				 {
					CT2 = CT2 + BT2[i];
					System.out.println("Completion Time for: " + Process[i] + " " + "is" + " "+ CT2);
					
					WT2 = CT2 - AT2[i] - BT2[i];
					System.out.println("Wait Time for: " + Process[i] + " " + "is" + " " + WT2);
					
				 	TWT2 = TWT2 + WT2;
				 	System.out.print(System.lineSeparator());
				 }
			 	
			 		System.out.println("The total wait time for this process is: " + TWT2);
			 		System.out.print(System.lineSeparator());
				
				 	Avg2 = TWT2/Process.length;
				 	System.out.println("The average wait time for this process is:" + " " + Avg2);
	}

}
