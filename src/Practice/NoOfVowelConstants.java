package Practice;

public class NoOfVowelConstants {

	public static void main(String[] args) 
	
	{
		String s="Mohit";
		int vowels=0;
		int constants=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				vowels++;
			}
		
			if(s.charAt(i)!='a'&&s.charAt(i)!='e'&&s.charAt(i)!='i'&&s.charAt(i)!='o'&&s.charAt(i)!='u')
			{
				constants++;
			}
		
		}
		System.out.println(vowels);
		System.out.println(constants);
		
		

	}

}
