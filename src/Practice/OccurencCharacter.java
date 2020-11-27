package Practice;

public class OccurencCharacter {

	public static void main(String[] args) 
	{
		String s="javahtpndsndsdddd";
		int inlength=s.length();
		System.out.println(inlength);
		String s2=s.replaceAll("d", "");
		int actlength=s2.length();
		System.out.println(actlength);
		int finallength=inlength-actlength;
		System.out.println("occurence is"+ finallength);

	}

}
