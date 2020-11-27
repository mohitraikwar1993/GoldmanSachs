public class Add_Fraction {	
  public static int gcd(int a, int b)               // TC O(n)
  {
	  if(a==0)
		  return b;
	  else
		 return gcd(b%a, a);
  }
  public static int[] lowest(int nu, int de)       // TC O(1)
  {
	  int common_fac=gcd(nu,de);
	  
	  nu=nu/common_fac;
	  de=de/common_fac;
	  System.out.println(nu+""+de);
	  return new int[] {nu,de};	  
  }
  public static int[] addFractions( int[] fraction1, int[] fraction2 ) {                   // TC O(1) and SC O(1)
	if(!(fraction1.length==2) || !(fraction2.length==2) )
		throw new IllegalArgumentException("Argument should be 2");
	int n1=fraction1[0];
	int d1=fraction1[1];
	int n2=fraction2[0];
	int d2=fraction2[1];
	int fn=0;
	int fd=1;
	
	if(d1==0 || d2==0)
		throw new IllegalArgumentException("0 as denaminator is not allowed");
	
	if(d1==1 && d2==1)
	{
		fd=1;
		fn=n1+n2;
	}
	else
	{
		fn=n1*d2+n2*d1;
		fd=d1*d2;
		return lowest(fn, fd);
	}
	return ( new int[]{ fn, fd } );
  }

  
  public static void main( String[] args ) {
    int[] result = addFractions( new int[]{ 3, 1 }, new int[]{ 3, 1 } );

    if( result[ 0 ] == 6 && result[ 1 ] == 1 ) {
      System.out.println( "Test passed." );
      //return true;
    } else {
      System.out.println( "Test failed." );
      //return false;
    }
  }
}