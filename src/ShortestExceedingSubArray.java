/* 
*					******** IMPORTANT ********
*
* THIS IS SAMPLE SOLUTION. IF YOU FIND BETTER SOLUTION PLEASE CONSIDER USING SAME.
* USE YOUR OWN VARIABLE NAMES - @@@ DO NOT COPY @@@ EXACT VARIABLE NAMES
*
*/

import java.io.*;
import java.util.*;

public class ShortestExceedingSubArray
{
  public static int subArrayExceedsSum(int arr[], int target )
  {
	 if(arr.length==0)
		 return 0;
	 int sum=0;
	 for(int s: arr)
		 sum=sum+s;
	 if(target>=sum)
		 throw new IllegalArgumentException("Target should be less than total sum");
	 
	 int min_l=arr.length+1;
	 for(int strt=0; strt<arr.length; strt++)
	 {
		 int c_sum=arr[strt];
		 if(c_sum>target)
		 {
			 System.out.println("First is more");
			 return 1;
		 }
		 else
		 {
			 for(int end=strt+1; end<arr.length; end++)
			 {
			   	 c_sum=c_sum+arr[end];
			      
			   	 if(c_sum>target && (end-strt+1)<min_l)
			   	 {
			   		 min_l=end-strt+1;
			   		 
			   	 } 	 
			 } 
		 } 
	 }	 
	 System.out.println(min_l);
	 return min_l; 
    }

  public static void doTestsPass()
  {                                                        // 1 3 5 6 9 10
  boolean result = true;  
 // int[] arr = { 3, 2, 5, 4 ,1};
  int[] arr = { 3, 5, 6, 9,10 ,1};
  
  
  
  result = result && subArrayExceedsSum( arr, 5 ) == 1;
  result = result && subArrayExceedsSum( arr, 33 ) == 6;
  int[] arr2 = {};
  result = result && subArrayExceedsSum( arr2, 0 ) == 0;
  //result = result && subArrayExceedsSum( arr2, 2 ) == -1;
  
  if( result )
  {
    System.out.println("All tests pass\n");
  }
  else
  {
    System.out.println("There are test failures\n");
  }
  };

  public static void main(String[] args)
  {
  doTestsPass();
  }
};
 