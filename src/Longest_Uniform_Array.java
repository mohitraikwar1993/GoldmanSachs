/**
 *  
  *  e.g.
 *      for the input: "abbbccda" the longest uniform substring is "bbb" (which starts at index 1 and is 3 characters long).
 */
import java.util.*;
public class Longest_Uniform_Array {

  private static final Map<String, int[]> testCases = new HashMap<String, int[]>();
  static int[] longestUniformSubstring(String input){
    int longestStart = -1;
    int longestLength = 0;
    String fs="";
    
    int t=0;                                                            //aabbbaa
    if(input.length()==0)
    	return new int[]{ longestStart, longestLength };
    LinkedList<Character> s=new LinkedList<Character>();     
    s.add(input.charAt(0));
    longestStart=0;
    
    for(int i=1; i<input.length();i++)
   {                                                               
    	if(s.contains(input.charAt(i)))
    	{
    		s.add(input.charAt(i));                        // s= a a
    //		System.out.println("if"+s);
    		t=s.size();                                    // t=2
    		if(t>longestLength)                            //ll=2
    		{
    		longestLength=t;
    		longestStart=i;
    		
    		}
    	}                                               
    	else
    	{
    		s.clear();
    		s.add(input.charAt(i));
    // 		System.out.println("else"+s);
    	}
    }
    longestStart=longestStart-longestLength+1;
    System.out.println(longestLength +" "+longestStart);
    System.out.println(input.substring(longestStart, longestLength+1));
    return new int[]{ longestStart, longestLength };
  }

  public static void main(String[] args) {
   // testCases.put("", new int[]{-1, 0});
    testCases.put("10000111", new int[]{1, 4});
    testCases.put("aaabbbbbCdAA", new int[]{3, 5});
    testCases.put("xx111111aabbcaaa", new int[]{2, 6});

    boolean pass = true;
    for(Map.Entry<String,int[]> testCase : testCases.entrySet()){
      int[] result = longestUniformSubstring(testCase.getKey());
      pass = pass && (Arrays.equals(result, testCase.getValue()));
    }
    if(pass){
      System.out.println("Pass!");
    } else {
      System.out.println("Failed! ");
    }
  }
}