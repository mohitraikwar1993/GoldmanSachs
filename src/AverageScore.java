/* 
*					******** IMPORTANT ********
*
* THIS IS SAMPLE SOLUTION. IF YOU FIND BETTER SOLUTION PLEASE CONSIDER USING SAME.
* USE YOUR OWN VARIABLE NAMES - @@@ DO NOT COPY @@@ EXACT VARIABLE NAMES
*
*/
import java.io.*;
import java.util.*;
class AverageScore
{
  public static Integer bestAverageGrade(String[][] scores)
  {
	  int max=0;
	  Map<String ,Integer> sum=new HashMap<String, Integer>();
	  Map<String ,Integer> count=new HashMap<String, Integer>();
	  
	  for(int i=0; i<scores.length;i++)            // TC= O(n) SC=O(n)
	  {
		 int avg=0;
		 if(count.containsKey(scores[i][0]))
		 {
			 int currc=count.get(scores[i][0]);
			 currc++;
			 count.put(scores[i][0], currc);
			 
			 int currs=sum.get(scores[i][0]);
			 currs=currs+Integer.parseInt(scores[i][1]);
			 sum.put(scores[i][0], currs);
			 avg=currs/currc; 
		 }
		 else
		 {
			 count.put(scores[i][0], 1);
			 sum.put(scores[i][0], Integer.parseInt(scores[i][1]));
			 System.out.println(Integer.parseInt(scores[i][1]));
			 avg=Integer.parseInt(scores[i][1]);
		 }
		 max=Math.max(max, avg); 
	  }	  
	  System.out.println(max);
      return (int) Math.floor(max);
  }

  public static boolean doTestsPass()
  {
    Map<String[][], Integer> testCases = new HashMap<>();

    testCases.put(new String[][] { { "Bobby", "87" },
                     { "Charles", "100" },
                     { "Eric", "64" },
                     { "Charles", "22" } },
            87);
    testCases.put(new String[][] {},
            0);
    testCases.put(new String[][] { { "Sarah", "91" },
                     { "Goldie", "92" },
                     { "Elaine", "93" },
                     { "Elaine", "95" },
                     { "Goldie", "94" },
                     { "Sarah", "93" } },
            94);
    testCases.put(new String[][] { { "Janie", "-66" },
                     { "Janie", "0" },
                     { "Gina", "-88" },
                     { "Bobby", "0" },
                     { "Gina", "44" },
                     { "Bobby", "0" },
                     { "Bobby", "-6" } },
            -2);
    testCases.put(new String[][] { { "Alpha", "99" },
                     { "Bravo", "99" },
                     { "Charlie", "99" },
                     { "Delta", "99" },
                     { "Echo", "99" },
                     { "Foxtrot", "99" },
                     { "Foxtrot", "99" } },
            99);
    testCases.put(new String[][] { { "Gerald", "91" },
                     { "Gerald", "92" } },
            91);
    testCases.put(new String[][] { { "Barry", "-66" },
                     { "Barry", "-65" },
                     { "Alfred", "-122"} },
            -66);

    boolean passed = true;
    for(Map.Entry<String[][], Integer> entry : testCases.entrySet())
    {
      Integer actual = bestAverageGrade(entry.getKey());
      if(actual != entry.getValue())
      {
        passed = false;
        System.out.println("Failed for " + Arrays.deepToString(entry.getKey()) + "\n  expected " + entry.getValue() + ", actual " + actual);
      }
    }

    return passed;
  }

  public static void main(String[] args)
  {
    if(doTestsPass())
    {
      System.out.println("All tests pass");
    }
    else
    {
      System.out.println("Tests fail.");
    }
  }
}