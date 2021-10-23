package module2OS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class FIFO {
	
public static void main(String[] args) 
{
}

     static int pageFaults(int pages[], int n, int capacity)
     {
    	 int frame = 4;
	     int pages1[] = {5, 1, 2, 2, 1, 3, 1, 6, 3, 4, 1, 3, 3};
    	 
         // To represent set of current pages. We use
         // an unordered_set so that we quickly check
         // if a page is present in set or not
         HashSet<Integer> s = new HashSet<>(capacity);
        
         // To store the pages in FIFO manner
         Queue<Integer> indexes = new LinkedList<>() ;
        
         // Start from initial page
         int page_faults = 0;
         for (int i=0; i<n; i++)
         {
             // Check if the set can hold more pages
             if (s.size() < capacity)
             {
                 // Insert it into set if not present
                 // already which represents page fault
                 if (!s.contains(pages1[i]))
                 {
                     s.add(pages1[i]);
        
                     // increment page fault
                     page_faults++;
        
                     // Push the current page into the queue
                     indexes.add(pages1[i]);
                 }
             }
        
             // If the set is full then need to perform FIFO
             // i.e. remove the first page of the queue from
             // set and queue both and insert the current page
             else
             {
                 // Check if current page is not already
                 // present in the set
                 if (!s.contains(pages1[i]))
                 {
                     //Pop the first page from the queue
                     int val = indexes.peek();
        
                     indexes.poll();
        
                     // Remove the indexes page
                     s.remove(val);
        
                     // insert the current page
                     s.add(pages1[i]);
        
                     // push the current page into
                     // the queue
                     indexes.add(pages1[i]);
        
                     // Increment page faults
                     page_faults++;
                 }
             }
         }
        
         return page_faults;

}}
		/*
		 * //Creating an ArrayList for FIFO ArrayList<Integer> a = new
		 * ArrayList<>(frame); int faults=0;
		 * 
		 * 
		 * // Calculate FIFO for(int i=0;i<pages.length;i++) { if(!a.contains(pages[i]))
		 * { faults++; }
		 * 
		 * // Check if the set can hold equal pages if(a.size()==frame) { a.remove(0);
		 * a.add(pages[i]); } else { a.add(pages[i]); } }
		 * 
		 * System.out.println("Number of Faults using FIFO = " + faults);
		 * 
		 * 
		 * 
		 * 
		 * //Creating an ArrayList for LRU ArrayList<Integer> array = new
		 * ArrayList<>(frame);
		 * 
		 * int fault=0; int count=0;
		 */
				  
			     
		/*
		 * // Calculate LRU for(int i: pages) {
		 * 
		 * if(!array.contains(i)) {
		 * 
		 * if(array.size()==frame) { array.remove(0); array.add(frame-1,i); } else
		 * array.add(count,i); // add page faults fault++; ++count; }
		 * 
		 * else { array.remove((Object)i); array.add(array.size(),i); } }
		 * System.out.println("Number of Faults using LRU = " + fault); }
		 * 
		 * }
		 */