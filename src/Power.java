public class Power {

  /* Given base and integer exponent, compute value of base raised to the power of exponent.
   */
  public static double power(double base, int exp) 
  {
	if(exp==0)
		 return 1;
    if(base==1)
    	return 1;
    if(exp==1)                                                //TC= O(n) and SC= O(1)
    	return base;
    
	double res=1;
	for(int i=1;i<=exp;i++)
	{
		res=res*base;
	}
    return res;
  }

  public static boolean doTestPass() {
    boolean testsPass = true;
    double result = power(2,3);
    testsPass= result==8;
    result = power(1,3);
    testsPass =result==1;
    result = power(10,1);
    testsPass =result==10;
    result = power(2,0);
    return testsPass && result==1;
  }

  public static void main( String[] args ) {
    if(doTestPass()){
      System.out.println("Pass");
    }
    else{
      System.out.println("There are failures");
    }
  }
}