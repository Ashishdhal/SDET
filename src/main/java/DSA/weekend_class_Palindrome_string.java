package DSA;

import org.junit.Test;

//Given an input String,return a boolean array by validate each of the word is a palindrome.
//Input = "this is a Tst"
//output = [false, false, true, true]



public class weekend_class_Palindrome_string {
	
	@Test
	public void test() {
		intPalindrome("this is a Tst");
		
		
	}
	public boolean[] intPalindrome(String s) {
		
		boolean[] b=new boolean[s.length()-1];
		String[] splitArr = s.split(" ");
		for (int i = 0; i < splitArr.length; i++) {
			
			boolean palindrome = isPalindrome(splitArr[i]);
			b[i]=palindrome;
		}
		
		return b ;
		
		
	}
	public boolean isPalindrome(String str) {
		int left= str.length()/2, right;
		if(str.length()%2==0) {
			right=str.length()/2;
		}
		else
			right=str.length()/2+1;
		
		while(right<str.length()) {
		
		if(str.charAt(left)!=str.charAt(right)) {
			
			return false;
		}	
			left--;
			right++;
		}
		else
		
		return true;
		// TODO Auto-generated method stub
		//return false;
		
	}
	

}
