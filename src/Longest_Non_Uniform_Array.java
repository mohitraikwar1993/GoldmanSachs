import java.util.*;
public class Longest_Non_Uniform_Array {

  private static final Map<String, int[]> testCases = new HashMap<String, int[]>();
  static int[] longestUniformSubstring(String input){
    int longestStart = -1;
    int longestLength = 0;
    int tl=0;
    LinkedList<Character> list=new LinkedList<Character>();
    list.add(input.charAt(0));		
    for(int i=1; i<input.length();i++)
    {
    	if(!(list.contains(input.charAt(i))))
    	{
    		list.add(input.charAt(i));
    		System.out.println(list);
    		tl=list.size();
    		if(tl>longestLength)
    		{
    			longestLength=tl;
    			longestStart=i;
    		}
    	}
    	else
    	{
    		list.clear();
    		list.add(input.charAt(i)); 
    	}
    }
    longestStart=longestStart-longestLength+1;
    System.out.println(longestStart+" "+longestLength);
    return new int[]{ longestStart, longestLength };
  }

  public static void main(String[] args) {
   // testCases.put("", new int[]{-1, 0});
    testCases.put("10123456000111", new int[]{2, 7});
    testCases.put("xabcdedAA", new int[]{0, 6});
    testCases.put("ababcdedAA", new int[]{2, 5});
   // testCases.put("xx111111aabbcaaa", new int[]{2, 6});

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