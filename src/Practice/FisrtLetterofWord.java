package Practice;

public class FisrtLetterofWord {

	public static void main(String[] args) 
	
	{
		String word=" I love Putlu cutlu 45 7";
		String s="";
		for(int i=0;i<word.length();i++)
		{
			if(word.charAt(i)==32)
			{
				s=s+word.charAt(i+1);

					
			}
			else
				
				continue;
		}
		System.out.println(s);

	}

}
