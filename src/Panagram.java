  import java.util.LinkedHashMap;
//Time complexity is O(n) and Sapce Complexity O(1)
class Panagram{
  private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
  public String findMissingLetters(String sentence) 
  {
	  String s="";
	  for(int i=0; i<sentence.length(); i++)
	  {
		  if(sentence.charAt(i)>='0' && sentence.charAt(i)<='9')
		  {
			  System.out.println("String contain num");
		  return s="false";
		  }
	  }
	  
	  if(sentence.equals(""))
		  return "abcdefghijklmnopqrstuvwxyz";
	  if(sentence.contains("1"))
	  {
		  System.out.println("String contain num");
		  return s;
	  }
	  else
	  {
		  for(char c='a';c<='z';c++)
		  {
			  if(!(sentence.contains(""+c)))
			  {
				  s=s+""+c;
			  }	  
		  }  
	  }
	  System.out.println(s);
	  return s;
  }
  public static void main(String[] args) {
  Panagram pd = new Panagram();
  boolean success = true;
  //success = success && "".equals(pd.findMissingLetters("a0b12c"));
    success = success && "defghijklmnopqrstuvw".equals(pd.findMissingLetters("abcxyz"));
   success = success && "".equals(pd.findMissingLetters("The quick brown fox jumps over the lazy dog"));
  //success = success && "abcdefghijklmnopqrstuvwxyz".equals(pd.findMissingLetters(""));

  if (success) {
    System.out.println("Pass ");
  } else {
    System.out.println("Failed");
  }
  }}