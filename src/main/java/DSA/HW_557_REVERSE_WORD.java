package DSA;

import org.junit.Test;

import junit.framework.Assert;

public class HW_557_REVERSE_WORD {
	@Test
	public void test() {
		String reverseWords = reverseWords("Let's take LeetCode contest");
		Assert.assertEquals(reverseWords, "s'teL ekat edoCteeL tsetnoc");
	}
	
	
	public String reverseWords(String s) {
        String s1="";
	String[] splitString = s.split(" ");
	/*for (String string : splitString) {
		System.out.println(string);
		*/
	for (int i = 0; i < splitString.length; i++) {
		StringBuilder sb= new StringBuilder(splitString[i]);
		StringBuilder reverse = sb.reverse();
		s1=s1+reverse+" ";
		
		
	}
	System.out.println(s1);
	
	return s1.trim();
        
	
    }

}
