
public class StudentEliminateInCircle 
{
public static int position(int n, int k)
{
	if(n==1)
		return 1;
	
	else
		return(position(n-1,k)+k-1)%n+1;
}
	public static void main(String[] args) {
		
		int p=position(8, 2);
		System.out.println(p);
		
	}
	
	
	
}
