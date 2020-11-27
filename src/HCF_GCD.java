
public class HCF_GCD
{
	public static int gcd(int a, int b)
	{
		if(a==0)
			return b;
		
		else 
			return gcd(b%a, a);
	}
	public static void main(String[] args) 
	{
	int a,b;
	a=15;
	b=6;
	
	for(int i=1 ; i<=a && i<=b ; i++)
	{
		if(a%i==0 && b%i==0)
		{
			System.out.println(i);
		}
		
	}
	
	System.out.println(gcd(15,6));
		
		
		
		
	}

}
