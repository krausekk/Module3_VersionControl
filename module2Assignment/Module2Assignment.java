package module2Assignment;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Module2Assignment {

	static int Faults(int pages[], int n, int capacity) {
		HashSet<Integer> s = new HashSet<>(capacity);

		HashMap<Integer,Integer>indexes = new HashMap<>();

		int Faults = 0;

		for (int i =0; i<n; i++)
		{
			if (s.size()<capacity)
			{
			if (!s.contains(pages[i]))
				{
					s.add(pages[i]);

					Faults++;
			}

			indexes.put(pages[i],i);
		}
		else
		{

			if(!s.contains(pages[i]))
			{
				int lru = Integer.MAX_VALUE, val=Integer.MIN_VALUE;

				Iterator<Integer> itr = s.iterator();

				while(itr.hasNext())
						{
							int temp = itr.next();
							if(indexes.get(temp) < lru)
							{
								lru = indexes.get(temp);
								val = temp;
							}
						}

				s.remove(val);
			}
		}
		}
		return Faults;
		
}
	 public static void main(String args[])
	 {
	     int pages[] = {7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2};
	     
	     int capacity = 3;
	      
	     System.out.println(Faults(pages, pages.length, capacity));
	 }

	}