package HWAFTER41;

import org.junit.Test;

import junit.framework.Assert;

//https://leetcode.com/problems/add-strings/

public class AddStrings_415 {
	@Test
	public void test() {
		String addStrings = addStrings("123", "100");
		Assert.assertEquals(addStrings, "133");
		
	}
	
	 public String addStrings(String num1, String num2) {
		// String result="";
		 int res=0;
		 int length1 = num1.length();
		 int length2 = num2.length();
		 
		 for (int i = 0; i < num1.length()-1; i++) {
			 char ch1 = num1.charAt(i);
			 char ch2 = num2.charAt(i);
			 int digit1 = Character.getNumericValue(ch1);
			 int digit2 = Character.getNumericValue(ch2);
			 res=res*(digit1+digit2);
			 
		}
		 String str = Integer.toString(res);
		 System.out.println(str);
		 
		 
		 
		 
		 
		 
		return str;
	        
		 
	    }

}
