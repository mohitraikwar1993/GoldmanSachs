package Practice;

import java.util.LinkedHashMap;
import java.util.Set;

public class FrstChar
{
	public static void main(String[] args) 
	{
		String name="character";
		LinkedHashMap<Character,Integer> map=new LinkedHashMap<Character,Integer>();

		         for(int i=0;i<name.length();i++)
		         {   
		         int count=1;
		           for(int j=0;j<name.length();j++)
		            {
		            if(name.charAt(i)==name.charAt(j))    
		             {
		             map.put(name.charAt(i),count);
		             count++;
		            }
                   }
		         }
		   //    System.out.println(map);

		           Set<Character> st=map.keySet();
		           for(Character c:st)
		           {
		              if(map.get(c)==1)
		           {
		           System.out.println(c);
		           break;
		           }
		           }	
	            
	}
}
	
