 

import java.io.*;
import java.util.*;
//Time Complexity O(n) or O(logn) Space Complexity O(1)
public class PrimeFactorization
{
	/**
	   * Return an array containing prime numbers whose product is x
	   * Examples:
	   * primeFactorization( 6 ) == [2,3]
	   * primeFactorization( 5 ) == [5]
	   */
  public static List<Integer> primeFactorization(int x)
  {
	 List<Integer>l=new ArrayList<Integer>();
	 for(int i=2; i<=x; i++)
	 {
		 if(x%i==0)
		 {
			 x=x/i;
			 l.add(i);		 
		 }	 
	 } 
	 return l;
	}

public static void main(String args[])
  {
	
	System.out.println(primeFactorization(6) + " " + primeFactorization(7)+""+primeFactorization(15)+""+primeFactorization(30)); 
	if(primeFactorization(6).equals(Arrays.asList(2,3)) 
			&& 
			primeFactorization(7).equals(Arrays.asList(7))&& 
			primeFactorization(15).equals(Arrays.asList(3,5)) && primeFactorization(20).equals(Arrays.asList(2,5))
			) {
		System.out.println("All passed");
	}else {
		System.out.println("Failed");
	}  
  }
}