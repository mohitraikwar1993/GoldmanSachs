package Practice;

public class MultiCatchBlockDemo 
{
 public static void main(String[] args)
 {
   int nu=5;
   int de=0;
   
   try {
	     System.out.println(nu/de);
	     throw new Exception("Throwing exception");
   		} 
   catch (ArithmeticException ae) 
   {
	System.out.println("Exception catched by Arithmetic Exception");
   } 
   catch (Exception e) 
   {
	System.out.println("Exception catched by Exception");
   }
   finally {
	System.out.println("Finally block executed");
	try {
	System.out.println(nu/de);
	}
	catch(Exception e)
	{
		System.out.println("Finally exception");
	}
	
	
   }
	 

 }
	
	
}
