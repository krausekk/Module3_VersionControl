package module2OS;

import java.util.ArrayList;

public class pages {
  
 public static void main(String[] args) 
 {
     int frame = 4;
     int pages[] = {5, 1, 2, 2, 1, 3, 1, 6, 3, 4, 1, 3, 3};
		
		  //Creating an ArrayList for FIFO
     ArrayList<Integer> a = new ArrayList<>(frame); 
     int  faults=0;
		 
		  // Calculate FIFO 
     for(int i=0;i<pages.length;i++) 
     { 
    	 if(!a.contains(pages[i]))
		  { 
    		 faults++; 
    	  }
		  
		  // Check if the set can hold equal pages 
     if(a.size()==frame) 
     { 
    	  a.remove(0);
		  a.add(pages[i]);
     } 
     else 
     { 
    	 a.add(pages[i]); 
     } 
   }
		  
		  System.out.println("Number of Faults using FIFO = " + faults);
			  
				 
		  
		  //Creating an ArrayList for LRU 
			     ArrayList<Integer> array = new ArrayList<>(frame);
			     
			     int fault=0;
			     int count=0;
				  
			     
			  // Calculate LRU
			     for(int i: pages)  
			     {
			         
			         if(!array.contains(i))
			         {
			          
			         if(array.size()==frame)
			         {
			             array.remove(0);
			             array.add(frame-1,i);
			         }
			         else
			             array.add(count,i);
			             // add page faults
			             fault++;
			             ++count;
			         }
			         
			         else
			         { 
			            array.remove((Object)i);
			            array.add(array.size(),i);        
			         }   
}
			     System.out.println("Number of Faults using LRU = " + fault);    
     }

}