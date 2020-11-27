public class IsPowerOf10
{
  /**
   * Returns true if x is a power-of-10. 
   */
  public static boolean isPowerOf10(double x)
  {
	if(x<0 || x==0)
		throw new IllegalArgumentException("Value should be greater than 0");
	if(x>0 && x<1)
	{
		System.out.println("greater ");
		while(x<2)
		{
			System.out.println(x);
			x=x*10;	
		}
		if(x%10==0)                          // TC=O(logn)  and SC= O(1)
			return true;
	}
	
		for(int i=10;i<=x; i=i*10)
		{
			if(i==x)
				return true;
			
			if(i>Integer.MAX_VALUE/10)
				return false;		
		}	
	
	return false; 
  }

  public static boolean doTestsPass()
  {
  double[] isPowerList = {1000,10,100,10000000};
  int[] isNotPowerList = {3,1,5,150};

  for(double i : isPowerList)
  {
    if(!isPowerOf10(i))
    {
    System.out.println("Test failed for: " + i);
    return false;
    }
  }

  for(int i : isNotPowerList)
  {
    if(isPowerOf10(i))
    {
    System.out.println("Test failed for: " + i);
    return false;
    }
  }

  System.out.println("All tested passed");
  return true;
  };


  public static void main(String args[])
  {
  doTestsPass();
  }
}