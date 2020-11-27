import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
//Time Complexity O(n) and Space Complexity O(n)
public class SecondSmallest {
	/**
	 * int secondSmallest(int[] x)
	 */
	public static int secondSmallest(int[] x) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		for(int i:x)
		{
			list.add(i);
		}

		if(x.length==1)
			return x[0];
		else
		{
			Collections.sort(list);
			return list.get(1);
		} 	
	}

	public static void main(String args[]) {

		int[] a = { 0 };
		int[] b = { 0, 1 };
		int[] c = { 0, 1 ,-6,9,-4,8};

		boolean result = true;
		result &= secondSmallest(a) == 0;
		result &= secondSmallest(b) == 1;
		result &= secondSmallest(c) == -4;

		if (result) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

	}
}