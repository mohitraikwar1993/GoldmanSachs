import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class ApacheLog {

  /**
   * Given a log file, return IP address(es) which accesses the site most often.
   */

  public static String findTopIpaddress(String[] lines) 
  {
	HashMap<String, Integer> map=new HashMap<String, Integer>(); 
    String ip="";
	for(int i=0; i<lines.length;i++)
    {
    	ip=lines[i].substring(0, 8);
    	System.out.println(ip);
    	if(map.containsKey(ip))
    	{                                                          //TC= O(n) and SC=O(n)
    		int v=map.get(ip);
    		v++;
    		map.put(ip, v);	
    	}
    	else
    	{
    		map.put(ip,1);
    	}
    }
	String fs="";
	Set<String>s=map.keySet();
	int max=1;
	for(String v:s)
	{
		if(map.get(v)>=max)
		{
			max=map.get(v);
			fs=v;
		}
		
	}
	  System.out.println(map);
	  System.out.println(fs);
	  // Your code goes here
    return fs;
  }
  
     
  
  public static void main(String[] args) {
    
String lines[] = new String[] {
        "10.0.0.1 - log entry 1 11",
        "10.0.0.1 - log entry 2 213",
        "10.0.0.1 - log entry 133132",
         "10.0.0.2 - log entry 2 213",
        "10.0.0.3 - log entry 1 11",
        "10.0.0.2 - log entry 2 213",
        "10.0.0.3 - log entry 133132"};
    String result = findTopIpaddress(lines);
    
    if (result.equals("10.0.0.1")) {
      System.out.println("Test passed");
      
    } else {
      System.out.println("Test failed");
      
    }  

  }
  
}