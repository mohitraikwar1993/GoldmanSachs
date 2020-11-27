package Practice;

import java.util.Scanner;

public class CapitalFirstLetter {
	
	public static void method1()
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1="";
		String str3="helloP";

		    for(int i=0;i<str3.length();i++)
		    {
		    if(i==0)
		     {
		    str1=str1+str3.charAt(i);
		    str1=str1.toUpperCase();
		     }
		    
		    
	       else
		     str1=str1+str3.charAt(i);

		    }

		System.out.println("the string output is " + str1);

		}

	public static void method2(String s)
	{
		String res="";
		res=res+s.substring(0, 1).toUpperCase()+s.substring(1, s.length()).toLowerCase();
		System.out.println(res);
	}
	
	
	
	public static void main(String[] args)
	{
		method2("helloWER");
		
		
	
    }
}