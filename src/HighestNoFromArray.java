// Given an array of numbers, program to
// arrange the numbers to form the 
// largest number
import java.util.*;

class HighestNoFromArray {
	// The main function that prints the 
	// arrangement with the largest value.
	// The function accepts a vector of strings 
	static void printLargest(Vector<String> arr)
	{
	Collections.sort(arr, new Comparator<String>() {
		
		public int compare(String x, String y)
		{
			String xy=x+y;
			String yx=y+x;
			
			return xy.compareTo(yx)>0?-1:1;	
		}
	});
		Iterator itr=arr.iterator();
		String num="";
		while(itr.hasNext())
		{
			num=num+itr.next();
		}
		System.out.println(num);
	}
	public static void main (String[] args) 
	{
		
		Vector<String> arr;
		arr = new Vector<>();
		
		//output should be 6054854654
		arr.add("54");
		arr.add("546");
		arr.add("548");
		arr.add("60");
		printLargest(arr);
	}
}
// This code is contributed by Shubham Juneja
