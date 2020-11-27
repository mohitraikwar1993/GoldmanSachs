import java.io.*;
import java.util.*;
/*
 * This program prints set of anagrams together in given string 
 * eg. 
 * setOfAnagrams("cat dog tac sat tas god dog") should print "cat tac dog god dog sat tas"
 */
//Time Complexity O(n) and Space Complexity O(n2)
class GroupAnagram {
  
  static String input = "cat dogd tac sat tas godd ddog";
  
  static void setOfAnagrams(String s)
  { 
	String strs[]=s.split(" ");
		        if (strs.length == 0)
		        	System.out.println("Length should be more than 0");
		        
		        Map<String, List<String>> ans = new LinkedHashMap<String, List<String>>();
		        for (String st : strs) 
		        {
		            char[] ca = st.toCharArray();
		            Arrays.sort(ca);
		            System.out.println("Sorted Array "+Arrays.toString(ca));
		            String key = String.valueOf(ca);
		            System.out.println("Key"+key);
		            if (!ans.containsKey(key))
		            	ans.put(key, new ArrayList());
		            ans.get(key).add(st);
		        }
	String res="";	        
	for(List<String> l : ans.values())	
	{
		for(String strr : l)
		{
			res=res+strr+" ";
		}
	}
	System.out.println(ans);
    System.out.println(res);
	  //your code goes here
  }
  
  public static void main(String[] args) {
    
    String input = "cat dog tac sat tas god dog";
    setOfAnagrams(input);   
  }
}