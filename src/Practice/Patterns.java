package Practice;

public class Patterns {

	public static void main(String[] args)
	
	{
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<3-i;j++)
			{
				System.out.print(" ");
			}
			for(int l=0;l<=i;l++)
			{
				System.out.print("*");
			}
			
		System.out.println();
		}
		
//pyramid
		System.out.println();
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<3-i;j++)
			{
				System.out.print(" ");
			}
			for(int l=0;l<=i;l++)
			{
				System.out.print("* ");
			}
			
		System.out.println();
		}
		
//reveerse pyramid
		System.out.println();
		
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<3-i;j++)
			{
				System.out.print(" ");
			}
			for(int l=0;l<=i;l++)
			{
				System.out.print("*");
			}
			
		System.out.println();
		}
		
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int l=0;l<=3-i;l++)
			{
				System.out.print("*");
			}
			
		System.out.println();
		}
		

	}

}
