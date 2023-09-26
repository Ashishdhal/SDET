package DSA;

import org.junit.Test;

import junit.framework.Assert;

public class weekend_palindrome_23rdSept {
	@Test
	public void test() {
		
		boolean palindrome = isPalindrome("RADAR");
		System.out.println(palindrome);
		Assert.assertEquals(true, palindrome);
	}
	
	@Test
	public void test1() {
		
		boolean palindrome = isPalindrome("RADARD");
		System.out.println(palindrome);
		Assert.assertEquals(true, palindrome);
	}
	
	@Test
	public void test2() {
		
		boolean palindrome = isPalindrome("RRADARD");
		System.out.println(palindrome);
		Assert.assertEquals(true, palindrome);
	}
//	@Test
//	public void test4() {
//		
//		boolean palindrome = isPalindrome("RADAR");
//		System.out.println(palindrome);
//		Assert.assertEquals(true, palindrome);
//	}
	
	public boolean isPalindrome(String s) {
		int left=0;
		int right=s.length()-1;
		int count=0;
		while(left<right) {
			
			if(s.charAt(left)==s.charAt(right)) {
				
				count++;
			}
			left++;
			right--;
			
			
		}
		if(count==s.length()/2) {
			return true;
		}
		else
			return false;
		
		
		
		//return false;
		
		
	}

}
