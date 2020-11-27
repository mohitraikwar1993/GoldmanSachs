import java.util.Set;
import java.util.TreeMap;
/*Implement a run length encoding function. For a string input the function returns output encoded as follows:
 * "a"     -> "a1"
 * "aa"    -> "a2"
 * "aabbb" -> "a2b3"                             To solve this we can use login which we used to count all options of dropdown 
 */
public class RunLengthEncoding {
  public static String rle(String str) 
  {                                                    //Time Complexity=O(n2) SC=O(n)  not sure
      if(str.equals(""))
    	  return "";
      else 
      {
	  String fs="";
	  TreeMap<Character, Integer> m=new TreeMap<Character, Integer>();
	  int count=1;
	  for(int i=0; i<str.length();i++)
	  {
		  count=1;
		  for(int j=0; j<str.length(); j++)
		  {
			  if(str.charAt(i)==str.charAt(j))
			  {
				  m.put(str.charAt(i),count);
				  count++;
			  }	  
		  }
	  }
	  Set<Character>s=m.keySet();
	  for(Character ch: s)
	  {
		  Integer i=m.get(ch);
		  fs=fs+ch+""+i;  
	  }
	  System.out.println(m);
	  System.out.println(fs);
	  return fs;
      }
  }

 public static void main(String[] args)  {
    
	  if("".equals(rle("")) && 
			  "a2b1".equals(rle("aab")) && 
			  "a7b5".equals(rle("aaaaabaabbbb"))){
		  System.out.println("Passed");
	  }else {
		  System.out.println("Failed");
	  }
  }
}