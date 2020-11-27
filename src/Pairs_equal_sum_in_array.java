import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Pairs_equal_sum_in_array
{

public static LinkedList<LinkedList<Integer>> findPair(int[] arr, int sum)
{
   LinkedList<LinkedList<Integer> > res=new LinkedList<LinkedList<Integer>>();	
   Arrays.sort(arr);
   if(arr[0]+arr[1]>sum)
	   System.out.println("Sum should be more");
   else 
   {
   for(int i=0; i<arr.length;i++)
   {
	   for(int j=0; j<arr.length; j++)                         // 1 2 3 4 5
	   {                                          
		   if(arr[i]+arr[j]==sum)                             // 1 2 3 4 5  
		   {
			  LinkedList<Integer> l=new LinkedList<Integer>();
			  l.add(arr[i]);
			  l.add(arr[j]);
			  res.add(l); 
		   }   
	   }	 
   }
   System.out.println(res);
	return res;
}
return res;
}
public static void main(String[] args) 
{
    int[] arr= {1,2,3,4,5};
	findPair(arr, 5);
	//System.out.println(Arrays.toString(res));
	
}	
}
