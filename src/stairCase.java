import java.io.*;
import java.util.*;

/*
** There is a staircase with 'n' number of steps. A child
** walks by and wants to climb up the stairs, starting at
** the bottom step and ascending to the top.instead
** of taking 1 step at a time, it will vary between taking
** either 1, 2 or 3 steps at a time.
** Given 'n' number of steps below method should find
** number of
** unique combinations the child could traverse.
** An example would be countSteps(3) == 4:
** 1 1 1
** 2 1
** 1 2
** 3
*/
class stairCase
{
  public static Integer countSteps(Integer n)
  {
	if(n==0)
		return 1;
	if(n==1)
		return 1;                         //TC=O(n)  SC=O(1)
	if(n==2)
		return 2;
//	if(n==3)
//		return 4;
	
	ArrayList<Integer> l=new ArrayList<Integer>(Arrays.asList(1,1,2));
	for(int i=3;i<=n;i++)
	{
		l.add(l.get(i-1)+l.get(i-2)+l.get(i-3));
		
	}			  
 
    return l.get(n);
  }


  public static boolean doTestsPass()
  {
    return countSteps(3) == 4
      && countSteps(4) == 7
      && countSteps(6) ==24;
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

    for (Integer n = 1; n <= 11; n++)
    {
      Integer numberOfCombinations = countSteps(n);
      System.out.println(n + " steps => " + numberOfCombinations);
    }
  }
}