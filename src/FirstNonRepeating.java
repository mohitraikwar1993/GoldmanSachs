import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
public class FirstNonRepeating {
 /*** Finds the first character that does not repeat anywhere in the input string* Given "apple", the answer is "a"  * Given "racecars", the answer is "e"
  **/        
  public static char findFirst(String str)
  {
	 LinkedHashMap<Character, Integer> m=new LinkedHashMap<Character, Integer>();
	 int count=1;
	 for(int i=0; i<str.length();i++)
	 {
		 count=1;
		 for(int j=0; j<str.length(); j++)                         //TC= O(n2)  and SC= O(n)
		 {
	       if(str.charAt(i)==str.charAt(j))
	       {
	    	   m.put(str.charAt(i), count);
	    	   count++;
	       }
		 } 
	 }
	 System.out.println(m);
	 Set<Character> set=m.keySet();
	
	 for(Character c: set)
	 {
		 if(m.get(c)==1)
		 {
			 return c;
		 }
	 }
	return 0;
  }
  public static void main(String args[])
  {

    String[] inputs = {"apple","racecars", "ababdc"};
    char[] outputs = {'a', 'e', 'd' };

    boolean result = true;
    for(int i = 0; i < inputs.length; i++ )
    {
      result = result && findFirst(inputs[i]) == outputs[i];
      if(!result)
        System.out.println("Test failed for: " + inputs[i]);
      else
        System.out.println("Test passed for: " + inputs[i]);
    }
  }

}
