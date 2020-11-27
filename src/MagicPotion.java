/*
Question: 
Combine ingredients in a specific order, any of which may be repeated
As an example, consider the following  
(A,B,C,D) in 11 steps: A, B, A, B, C, A, B, A, B, C, E 
Encode the string above using only 6 characters: A,B,*,C,*,E
Implement function that takes as input an un-encoded potion and returns the 
minimum number of characters required to encode
*/
public class MagicPotion {
 private static Integer minimalSteps(String ingredients) 
	{
      int n=ingredients.length();
      if(n==0)
    	  return 0;
      StringBuilder magicPotion=new StringBuilder();          //TC= O(n) and SC=O(1)
      magicPotion.append(ingredients.charAt(0));
      
      for(int i=1; i<n; i++)
      {
    	  if(i*2<=n)
    	  {
    		  String strToCompare=ingredients.substring(0, i);
    		  if(strToCompare.equals(ingredients.substring(i, 2*i)))
    				  {
    			  		magicPotion.append("*");
    			  		i=2*i-1;
    				  }
    		  else
    			  magicPotion.append(ingredients.charAt(i));
    	  }
    	  else
    		  magicPotion.append(ingredients.charAt(i));
    	  
      }
      System.out.println(magicPotion);
      return magicPotion.length();
    
	}

	public static void main(String[] args) {

		if (minimalSteps("ABCDABCE") == 8 && minimalSteps("ABCABCE") == 5 && minimalSteps("AAA") == 3
				&& minimalSteps("AAAA") == 3 && minimalSteps("BBB") == 3 && minimalSteps("AAAAAA") == 5) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}
}