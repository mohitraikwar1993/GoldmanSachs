// Given a a string of letters and a dictionary, the function longestWord should
//     find the longest word or words in the dictionary that can be made from the letters
//     Input: letters = "oet", dictionary = {"to","toe","toes"}
//     Output: {"toe"}
import java.util.*;
class Dictionary {
  private String[] entries;
  public Dictionary(String[] entries) {this.entries = entries;  }
  public boolean contains(String word) {return Arrays.asList(entries).contains(word);}
  public String[] strarr()  {	  return entries;  }
}
public class DictionaryLongest {
  public static Set<String> longestWord(String letters, Dictionary dict) 
  {
	  HashMap<String, Integer> m=new HashMap<String, Integer>();
	  String arr[]=dict.strarr();
	  HashSet<String> s=new HashSet<String>();
	  boolean flag=false;
	  for(int i=0; i<arr.length;i++)
	  {
		  flag=false;
		  for(int j=0; j<arr[i].length();j++)
		  {
			  System.out.println(""+arr[i].charAt(j));
			  if(letters.contains(""+arr[i].charAt(j)))
				  flag=true;
			  else
			  {
				  flag=false;
				  break;
			  }     
		  }
		  if(flag)
			  m.put(arr[i], arr[i].length());
	  }
	  int max=0;
	  for(String w: m.keySet())
	  {
		  if(w.length()>=max)
		  {
			  s.add(w);
			  max=w.length();
		  }
	  }  
	  System.out.println(m);
	  System.out.println(s);
    return s;
  }
  public static boolean pass() {
    Dictionary dict = new Dictionary(new String[]{"to","ns", "toe", "toeso", "dog","do","eotoe","so"});
    boolean r = new HashSet<String>(Arrays.asList("eotoe")).equals(longestWord("toe", dict));
    return r;
  }

  public static void main(String[] args) {
    if(pass()) {
      System.out.println("Pass");
    } else {
      System.err.println("Fails");
    }
  }
}