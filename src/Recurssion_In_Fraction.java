
public class Recurssion_In_Fraction
{
  
 public static int findRecurssion(int nu, int de)
	{
	   double x=(double)nu;
	   double y=(double)de;
	   double res=x/y;
	   String str=""+res;
	   if(x%y==0)
		   return -1;
	   
	   System.out.println(res);
	   System.out.println(str);
	   int index=str.indexOf(".");
	   System.out.println(index);
	   System.out.println(str.substring(index+3, index+5));
       if(str.substring(index+1, index+3).equals(str.substring(index+3, index+5)))
    	   System.out.println("Recurssion");
		
	   return -1;
	}
 public static void main(String[] args) 
   {
		findRecurssion(50, 22);
		findRecurssion(50, 27);
		findRecurssion(50, 25);
   }
	
}

