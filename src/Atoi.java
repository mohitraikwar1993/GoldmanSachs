/* 
*					******** IMPORTANT ********
* THIS IS SAMPLE SOLUTION. IF YOU FIND BETTER SOLUTION PLEASE CONSIDER USING SAME.
* USE YOUR OWN VARIABLE NAMES - @@@ DO NOT COPY @@@ EXACT VARIABLE NAMES
*
*/
public class Atoi
{
  public static int atoi(String str)
  {
  if(str.length()==0)
	  throw new IllegalArgumentException("String length should be greater than 0");
  String s="";
  String sign="";
  boolean flag=true;
  for(int i=0; i<str.length(); i++)                                //TC= O(n) and SC=O(1)
  {
	  if(str.charAt(i)=='-' || str.charAt(i)=='+')
		  sign=sign+str.charAt(i);
	  
	  if(str.charAt(i)>='0' && str.charAt(i)<='9')
	  {
		  s=s+str.charAt(i);
		  flag=false;
	  }
  }
  
  System.out.println(s);
  if(flag)	  
  return 0;
  else
	  return Integer.parseInt(sign+s);
  };


  public static boolean doTestsPass()
  {
  boolean result = true;
  result = result && atoi("0") == 0;
  result = result && atoi("1") == 1;
  result = result && atoi("123") == 123;
  result = result && atoi("-1") == -1;
  result = result && atoi("-123") == -123;
  result = result && atoi("123a") == 123;
  result = result && atoi("1a12") == 112;
  result = result && atoi("ab") == 0;
  String intMax = String.valueOf(Integer.MAX_VALUE);
  result = result && atoi(intMax) == Integer.MAX_VALUE;

  String intMin = String.valueOf(Integer.MIN_VALUE);
  //System.out.println(intMin);
  result = result && atoi(intMin) == Integer.MIN_VALUE;

  return result;
  }


  public static void main(String[] args)
  {
    if(doTestsPass())
    {
    System.out.println("All tests pass");
    }
    else
    {
    System.out.println("There are test failures");
    }
  }
}