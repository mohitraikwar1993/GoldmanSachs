import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test3 {

	public static void main(String[] args) {
		String s="dog";
		String[] str=new String[]{"to", "toe", "toes", "d", "dodg", "god", "dogs", "banana"};
		boolean flag=false;
		Set<String> set=new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++)
		{
			flag=false;
			for(int j=0;j<str[i].length();j++)
			{
				flag=false;
				for(int k=0;k<s.length();k++)
				{
					if(str[i].charAt(j)==s.charAt(k))
					{
						flag=true;
						break;
					}
					
				}	
			}
			if(flag)
				set.add(str[i]);
			
		}
		
		System.out.println(set);
	}
}
