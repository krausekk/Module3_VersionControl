package module1OS;

public class module1OSAssignmentFCFS {

	public static void main(String[] args) {
		//First Come First Serve
		String Process[] = {"p1", "p2", "p3", "p4", "p5"};
		int AT[] = {0,1,2,3,4};
		int BT[] = {4,11,21,23,29};
		int CT = 0;
		int WT = 0;
		int TWT = 0;
		int Avg = 0;
		
		//First Come First Serve Calculations
		 for(int i=0;i<Process.length;i++) 
		 {
			 //Calculating Completion Time
			CT = CT + BT[i];
			System.out.println("Completion Time for: " + Process[i] + " " + "is" + " "+ CT);
			
			//Calculating Wait Time
			WT = CT - AT[i] - BT[i];
			System.out.println("Wait Time for: " + Process[i] + " " + "is" + " " + WT);
			
			//Calculating Total Weight Time
			TWT = TWT + WT;
			System.out.print(System.lineSeparator());
			
		 }
		 
		 System.out.println("The total wait time for this process is: " + TWT);
		 System.out.print(System.lineSeparator());
		 
		 //Calculating the Average wait time of First Come First Serve
		 	Avg = TWT/Process.length;
		 	System.out.println("The average wait time for this process is:" + " " + Avg);	 	
	}

}
