package Practice;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class String_Compression {

	public static void main(String[] args) 
	{
		String s="aaaggggerfdjda";
		String s1="";
		int count=0;
		LinkedHashMap<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		
		for(int i=0;i<s.length();i++)
         {
        if(map.containsKey(s.charAt(i)))

        {
        	count=map.get(s.charAt(i));
        	count++;
        	map.put(s.charAt(i), count);
        }
        
        else
        	map.put(s.charAt(i), 1);
        }
		System.out.println(map);
		
		StringBuilder sb=new StringBuilder();
		for(java.util.Map.Entry<Character, Integer> entr:map.entrySet())
		{
			sb.append(entr.getKey());
			sb.append(entr.getValue());
			String s2=sb.toString();
			System.out.println(s2);
		}
		
		}
		

		

	}


