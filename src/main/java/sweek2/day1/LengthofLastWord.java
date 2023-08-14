package sweek2.day1;
//Input: String S
//Output: Int
//trim the String
//substring(s.lastIndexOf(" ")+1, s.length()).length()


public class LengthofLastWord {
	public static void main(String[] args) {
		
	
	
	String s= "Hello World";
	int length = s.trim().subSequence(s.lastIndexOf(" ")+1, s.length()).length();
	
	s.lastIndexOf(length)
	System.out.println(length);
	
	
			
	}
}
