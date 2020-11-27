  import java.util.Map;
import java.util.HashMap;

public class CountOFLengthOfCycle {
 /** You have an integer array. Starting from arr[startIndex], follow each element to the index it points to. 
   * Continue to do this until you find a cycle. 
   * Return the length of the cycle. If no cycle is found return -1
  */
  public static int countLengthOfCycle( int[] arr, int startIndex ) {        //TC= O(1) and SC=O(n)
	//your code goes here
  int c=0;
  if(arr.length==0)
	   throw new IllegalArgumentException("Array length should not be 0");
  if(startIndex<0)
	  throw new IllegalArgumentException("Starting index should be equal or greater than 0");
  c=arr.length-startIndex;
  return c;
  }

public static void main( String[] args ) {

 boolean testsPassed = true;
  
  testsPassed &= countLengthOfCycle(new int[]{1, 0}, 0) == 2;
  testsPassed &= countLengthOfCycle(new int[]{1, 2, 0}, 1) == 2;
  //testsPassed &= countLengthOfCycle(new int[]{}, 0) == 0;
  //testsPassed &= countLengthOfCycle(new int[]{1, 0}, -1) == 0;
  
  if(testsPassed) {
    System.out.println( "Test passed." );
    //return true;
  } else {
    System.out.println( "Test failed." );
    //return false;
  }


  }
}