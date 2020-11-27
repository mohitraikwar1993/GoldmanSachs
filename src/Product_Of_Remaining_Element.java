import java.util.Arrays;

public class Product_Of_Remaining_Element {

	public static int[] product(int[] arr)
	{
		int[] res=new int[5];
		for(int i=0; i<arr.length; i++)
		{
			int prod=1;
			for(int j=0; j<arr.length; j++)
			{
				if(i!=j)
				{
					prod=prod*arr[j];
				}	
			}
			res[i]=prod;
	
		}
	
		return res;
	}
	
	public static int[] product2(int[] arr)
	{
		int[] res=new int[5];
		int tp=1;
		for(int i=0; i<arr.length; i++)
		{
			tp=tp*arr[i];
		}
		for(int i=0; i<res.length; i++)
		{
		res[i]=tp/arr[i];	
		}
		return res;
	}	
	
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		int res[]=product2(arr);
		System.out.println(Arrays.toString(res));
		
	}
	
}
