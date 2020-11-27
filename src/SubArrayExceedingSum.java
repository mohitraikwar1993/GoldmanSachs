/* 
*					******** IMPORTANT ********
*
* THIS IS SAMPLE SOLUTION. IF YOU FIND BETTER SOLUTION PLEASE CONSIDER USING SAME.
* USE YOUR OWN VARIABLE NAMES - @@@ DO NOT COPY @@@ EXACT VARIABLE NAMES
*
*/

import java.io.*;
import java.util.*;

public class SubArrayExceedingSum
{
  public static int subArrayExceedsSum(int arr[], int target )
  {
  if(arr.length<=0)
	  return 0;
  int ts=0;	  
  for(int i:arr)
	  ts=ts+i;
  if(target>ts)
	  return -1;
  if(target==0)
	  return 0;
  ArrayList<Integer> fl=new ArrayList<Integer>();      // 1 2 3 4 5
  Arrays.sort(arr);
  int sum=0;
  if(target<arr[arr.length-1] && target>0)
  {
	  int i=arr.length-2;
	  if(arr[i]==target)
	  {
		  fl.add(arr[i]);
		  System.out.println(fl);
		  return fl.size();
	  }
	  while(arr[i]>target)
		  i--;
	  sum=arr[i];
	  System.out.println(sum);
	  fl.add(arr[i]);
	  for(int j=i-1; j>=0; j--)
	  {
		  if(sum+arr[j]<=target)
		  {
			  sum=sum+arr[j];
			  fl.add(arr[j]);
		  }
	  }		
  }
  
  else
  {
  //ArrayList<Integer> fl=new ArrayList<Integer>();
  sum=0;
  
	  sum=arr[arr.length-1];
	  fl.add(arr[arr.length-1]);
	  for(int j=arr.length-2; j>=0; j--)
	  {
		  if(sum+arr[j]<=target)
		  {
			sum=sum+arr[j]; 
			fl.add(arr[j]);
		  }
		 
	  }  
  }
  System.out.println(fl);
  
  return fl.size();
  }

  public static void doTestsPass()
  {
  boolean result = true;  
  int[] arr = { 3, 2, 5, 4 ,1};                                // 1 2 3 4 5 
  //int[] arr = { 3, 5, 5, 10 ,1};
  
  result = result && subArrayExceedsSum( arr, 6 ) == 2;
  result = result && subArrayExceedsSum( arr, 12 ) == 3;
  result = result && subArrayExceedsSum( arr, 10 ) == 3;
  result = result && subArrayExceedsSum( arr, 4 ) == 1;
  result = result && subArrayExceedsSum( arr, 5 ) == 1;
  result = result && subArrayExceedsSum( arr, 8 ) == 2;
  result = result && subArrayExceedsSum( arr, 3 ) == 1;
  result = result && subArrayExceedsSum( arr, 2 ) == 1;
  result = result && subArrayExceedsSum( arr, 1 ) == 1;
  result = result && subArrayExceedsSum( arr, 0 ) == 0;
  
 // result = result && subArrayExceedsSum( arr, 11 ) == 2;
 // result = result && subArrayExceedsSum( arr, 0 ) == 0;
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
