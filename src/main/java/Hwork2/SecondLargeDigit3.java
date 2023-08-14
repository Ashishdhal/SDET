package Hwork2;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

//https://leetcode.com/problems/second-largest-digit-in-a-string/description/
//Input: s = "dfa12321afd"
//Output: 2
public class SecondLargeDigit3 {
	
	@Test
	public void test()
	{
		int secondHighest = secondHighest("dfa12321afd");
		System.out.println(secondHighest);
		Assert.assertEquals(2, secondHighest);
	}
	 public int secondHighest(String s) {
		 String num = s.replaceAll("[A-Za-z]","");
		 System.out.println(num);
		 char[] charArray = num.toCharArray();
		 Arrays.sort(charArray);
		 
		 for (int i = 0; i < charArray.length; i++) {
			 if(charArray[i+1]>charArray[i]) {
				
				 char c = charArray[i+1];
				 int numericValue = Character.getNumericValue(c);
				 return numericValue;
			 }
			
		}
		 
		return -1;
	        
	    }
	

}
