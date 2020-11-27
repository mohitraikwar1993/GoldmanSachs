package Practice;

public class Panagram {

	public static void main(String[] args) 
	{
		String s="abcdefghijklmnopqustuvwxyz";
		String s1=s.toLowerCase();
		
		System.out.println(isPangram(s1));

	}

	private static boolean isPangram(String s)
	{
	if(s.length()<26)
	{
		System.out.println("not panagram as length is less than 26");
		return false;
		
	}

	else 
	{
		for(char ch='a';ch<='z';ch++)
		{
			if(s.indexOf(ch)<0)
			{
			System.out.println("Not pangarma");
			return false;
			}
			
		}
		return true;
	}
	


    }
	
	
	

	
}