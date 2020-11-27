
public class Maxi_Water_Capacity
{
  
public static int findMaxCapacity(int[] arr)     //TC O(n2) SC O(1)
  {
	int r=0;
	int n=arr.length;                      // 2 1 0 3 5 1 3
	for(int i=1; i<n-1; i++)
	{
		int left=arr[i];
		for(int j=0; j<i; j++)
		{
			left=Math.max(left, arr[j]);
			
		}
		
		int right=arr[i];
		for(int j=i+1; j<n; j++)
		{
			right=Math.max(right, arr[j]);
		}
		
		r=r+Math.min(left, right)-arr[i];
		
	}

	return r;
  }
	
public static void main(String[] args) 
 {
	int res=findMaxCapacity(new int[]{2, 1, 0, 3, 5, 1, 3});
	System.out.println(res);
 }

	
}
