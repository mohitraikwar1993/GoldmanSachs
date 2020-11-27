package Practice;

import java.net.HttpURLConnection;

public class Reverseword {

	public static void main(String[] args) 
	{
		
      String s="i love india";
      String s1="";
      String s2="";
      String arr[]=s.split(" ");
      for(int i=arr.length-1;i>=0;i--)
      {
    	  s1=s1+arr[i]+" ";
    	  
      }
      System.out.println(s1);
      
      for(int i=0;i<s.length();i++)
      {
    	  if(s.charAt(i)==32)
    	  {
    		continue;
    	  }
    	  else
    		  s2=s2+s.charAt(i);
    		  
      }
      System.out.println(s2);
      
	}
	
     

}
