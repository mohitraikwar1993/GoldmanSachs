/* 
*					******** IMPORTANT ********
* THIS IS SAMPLE SOLUTION. IF YOU FIND BETTER SOLUTION PLEASE CONSIDER USING SAME.
* USE YOUR OWN VARIABLE NAMES - @@@ DO NOT COPY @@@ EXACT VARIABLE NAMES
*/
public class DistBwTwoWords {

  public static double shortestDistance(String document, String word1, String word2)
  { 
	  double mp1=word1.length()/2d;
	  double mp2=word2.length()/2d;            //TC=O(1) and SC=O(1)
	  mp1=Math.floor(mp1);
	  mp2=Math.floor(mp2);
	  System.out.println(mp1+""+mp2);
	  document=document.toLowerCase();
	  int index1=document.indexOf(word1.toLowerCase());
	  int index2=document.indexOf(word2.toLowerCase(), index1);
	 // int index2=document.indexOf(word2.toLowerCase(), index1);
	  System.out.println(index1+" "+index2);
      index1=(int) (index1+mp1);
      index2=(int) (index2+mp2);
      System.out.println(index1+" "+index2);	  

    return index2-index1;
  }

  /**
   * Returns true if the tests pass. Otherwise, false.
   */
  public static boolean doTestsPass() {
    // todo: implement more tests if you'd like
    return  shortestDistance(_document, "and", "graphic") == 6d &&
        shortestDistance(_document, "transfer", "it") == 14d &&
        shortestDistance(_document, "Design", "filler" ) == 25d &&
        shortestDistance(_document, "lorem", "used" ) == 38d;
  }

  /**
   * Execution entry point.
   */
  public static void main(String[] args) {
    // Run the tests
    if (doTestsPass()) {
      System.out.println("All tests pass");
    } else {
      System.out.println("There are test failures");
    }
  }

  private static final String _document;
  static{
StringBuffer sb = new StringBuffer();
    sb.append("In publishing and graphic design, lorem ipsum is a filler text commonly used to demonstrate the graphic elements");
    sb.append(" lorem ipsum text has been used in typesetting since the 1960s or earlier, when it was popularized by advertisements");
    sb.append(" for Letraset transfer sheets. It was introduced to the Information Age in the mid-1980s by Aldus Corporation, which");

    _document = sb.toString();
  }
}