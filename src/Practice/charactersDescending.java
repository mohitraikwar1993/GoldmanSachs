package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class charactersDescending {

	public static void main(String[] args) 
	
	{
		String s="BaNana";
		String s1=s.toUpperCase();
		int count=0;
		TreeMap<Character, Integer> map=new TreeMap<Character, Integer>();
		for(int i=0;i<s1.length();i++)
		{
			if(map.containsKey(s1.charAt(i)))
			{
				count=map.get(s1.charAt(i));
				count++;
				map.put(s1.charAt(i), count);
			}
			else
				map.put(s1.charAt(i),1);
		}
		System.out.println(map);
		Set<Entry<Character, Integer>> st=map.entrySet();
		List<Entry<Character, Integer>> list=new ArrayList<Map.Entry<Character,Integer>>(st);
		Collections.sort(list, new Comparator<Entry<Character, Integer>>() 
		{

			@Override
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2)
			{
				// TODO Auto-generated method stub
				
				return o2.getValue().compareTo(o1.getValue());
				
			}
		}
		
		);
		System.out.println(list);
		

	}

}
