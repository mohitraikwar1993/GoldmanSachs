import java.io.*;
import java.util.*;
//Implement the 'walk' method.
//Assume robot inital position is (0,0).
//walk method take path where each character corresponds to a movement of the robot.
// The robot moves up, down, left, and right represented by the characters 'U', 'D', 'L', and 'R'
// Ignore other characters.
public class RobotWalk{
// your code
  public static Integer[] walk( String path )
  {
  if(path.length()==0)
	  throw new IllegalArgumentException("path length should be greater than 0");
  path=path.toUpperCase();  
  int vm=0,hm=0;
  for(int i=0;i<path.length();i++)
  {
	  if(path.charAt(i)=='L')                       //TC= O(n) and SC=O(1)
		  vm=vm-1;
	  if(path.charAt(i)=='R')
		  vm=vm+1;
	  if(path.charAt(i)=='D')
		  hm=hm-1;
	  if(path.charAt(i)=='U')
		  hm=hm+1;
  }
  return new Integer[] {vm, hm};
  }

  public static boolean isEqual(Integer[] a, Integer[] b) {
  return Arrays.equals(a, b);
  }

  public static boolean pass() {
  boolean res = true;

  {
    String test = "uuu123";
    Integer[] result = walk(test);
    res &= isEqual(result, new Integer[]{0, 3});
  }

  {
    String test = "ULDRD";
    Integer[] result = walk(test);
    res &= isEqual(result, new Integer[]{0, -1});
  }

  {
    String test = "ULLLDUDUURLRLR";
    Integer[] result = walk(test);
    res &= isEqual(result, new Integer[]{-2, 2});
  }

  {
    String test = "UP LEFT 2xDOWN DOWN RIGHT RIGHT UP UP";
    Integer[] result = walk(test);
    res &= isEqual(result, new Integer[]{1, 1});
  }

  return res;
  }

  public static void main(String[] args) {
  if(pass()){
    System.out.println("Pass");
  } else {
    System.out.println("Test failures");
  }
  }
}