package Practice;

import java.util.HashSet;

public class RepearingElemntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10,20,20,49,67,49};
		int count=1;
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(hs.contains(arr[i]))
			{
			count++;
			continue;
			}
			else
				hs.add(char[i]);
		}

	}

}
