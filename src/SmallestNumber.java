import java.util.*;
//Time Complexity O(n2) O of n square and Space Complexity O(n)
public class SmallestNumber
{ /* public static int FindMin(int a[]). Returns the smallest number in array that has been rotated. For example - Array {3,4,5,6,1,2} returns 1*/
  public static int FindMin1(int a[])
  {
	  if(a.length==0)
		  throw new IllegalArgumentException("Array length should be greater than 0");
	  if(a.length==1)
	  {
		  System.out.println("lenght is 1");
		  return a[0];
	  }
	  else
	  {
	  int smallest=a[0];
	  for(int i=0; i<a.length; i++)
	  {
		  for(int j=0; j<a.length;j++)
		  {
			  if(a[i]<a[j] && a[i]<smallest)
				  smallest=a[i];				  
			  if(a[j]<a[i] && a[j]<smallest)
				  smallest=a[j];				    
		  }  
	  }
	  System.out.println(smallest);
	  return smallest;
	  } 
  }
 public  static int FindMin(int a[])
  {
	TreeSet<Integer> set=new TreeSet<Integer>();
	for(int i:a)
	{
		set.add(i);
	}	  
	return set.first();	  	  
  }
 public static void main(String args[])
  {
    boolean result = true;
    result = result && FindMin(new int[]{3,4,5,6,1,2}) == 1;
    result = result && FindMin(new int[]{2,1}) == 1;
    result = result && FindMin(new int[]{1}) == 1;
    result = result && FindMin(new int[]{2,-1}) == -1;
    //result = result && FindMin(new int[]{}) == -1;

    try {
      FindMin(null);
      result = false;
    }
    catch(Exception e)
    {
      result = result && true;
    }

    if(result)
    {
      System.out.println("All tests pass");
    }
    else
    {
      System.out.println("There are test failures");
    }
  }
}