package DSA;

import org.junit.Test;

import junit.framework.Assert;

public class WEEKEND_int_palindrome {
	@Test
	public void test() {
		
		boolean palindrome = isPalindrome(12321);
		System.out.println(palindrome);
		Assert.assertEquals(true, palindrome);
	}
	
	public boolean isPalindrome(int a) {
		
		//int to String
		String str = Integer.toString(a);
		System.out.println(str);
		
		
		int left= str.length()/2, right;
		if(str.length()%2==0) {
			right=str.length()/2;
		}
		else
			right=str.length()/2+1;
		
		while(right<str.length())
		
		
		
		return false;
		
	}
	
}



