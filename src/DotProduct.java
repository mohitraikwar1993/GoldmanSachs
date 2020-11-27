public class DotProduct {

  /**
   *
   * Given two arrays of integers, returns the dot product of the arrays
   */

  public static int dotProduct( int[] array1, int[] array2 ) 
  {
	  if(array1.length!=array2.length)
		  return -1;
	  int sum=0;                                      //TC= O(n) and SC=O(n)
	  for(int i=0;i<array1.length;i++)
	  {
		  
		  sum=sum+(array1[i]*array2[i]);
		  
	  }
	 
    // code goes here
    return sum;
  }
 
  public static void main( String[] args ) {
   int[] array1 = {  1,2, 10 };
    int[] array2 = { 2, 3, 10 };
    int result = dotProduct( array1, array2 );

    if( result == 108 ) {
      System.out.println( "Passed." );
      //return true;
    } else {
      System.out.println( "Failed." );
      //return false;
    }
  }
}