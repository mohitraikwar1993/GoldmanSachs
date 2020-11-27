public class SquareRoot {
  /*
  *   double squareRoot( double x )
  *
  */
//Time Complexity O(n) and Space Complexity O(1)
  public static double squareRoot( double x )
  {
	double i, precision=0.00001;
	for(i=1; i*i<=x;i++ );
	for(--i; i*i<x; i=i+precision);
	  
    return i;
  }

  public static void main( String args[])
  {
    double[] inputs = {2, 4, 100};
    double[] expected_values = { 1.41421, 2, 10 };
    double threshold = 0.001;
    for(int i=0; i < inputs.length; i++)
    {
      if( Math.abs(squareRoot(inputs[i])-expected_values[i])>threshold )
      {
        System.out.printf( "Test failed for %f, expected=%f, actual=%f\n", inputs[i], expected_values[i], squareRoot(inputs[i]) );
      }
    }
    System.out.println( "All tests passed");
  }
}