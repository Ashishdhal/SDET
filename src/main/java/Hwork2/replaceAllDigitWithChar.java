package Hwork2;

//6. https://leetcode.com/problems/replace-all-digits-with-characters/description/
//Input: s = "a1c1e1"
//Output: "abcdef"
	
public class replaceAllDigitWithChar {
public static void main(String[] args) {
	String s="a1c1e1";
	String s1="";
	for (int i = 0; i < s.length(); i++) {
		if(s.charAt(i)<57) {
			//System.out.println(s.charAt(i));
			char charAt = s.charAt(i); //char 1
			int numericValue = Character.getNumericValue(charAt);
			//	int charAt = s.charAt(i); //char 1

			//System.out.println(charAt);
			char charAt2 = (char) (s.charAt(i-1)+numericValue);
			
			System.out.println(charAt2);
			s1=s1+charAt2;
			
		//	s.charAt(i)
			//char ch2= (char) (charAt+s.charAt(i-1));
			//System.out.println(ch2);
			
		}
		else
		{
			s1=s1+s.charAt(i);
		}
			
		
	}
	System.out.println(s1);
	
}
	
	

}
