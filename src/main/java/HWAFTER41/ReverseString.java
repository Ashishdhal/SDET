package HWAFTER41;

import org.junit.Test;

import junit.framework.Assert;

//https://leetcode.com/problems/reverse-string/
public class ReverseString {
	@Test
	public void test() {
		
		char[] reverseString = reverseString(new char[] {'h','e','l','l','o'});
		for (char c : reverseString) {
			System.out.println(c);
		}
		//Assert.assertEquals(false, false);
	}
	 public char[] reverseString(char[] s) {
		
		 char [] ch=new char[s.length];
		 for (int i =s.length-1 ; i >=0; i--) {
			 
			 
			 for (int j = 0; j < ch.length; j++) {
				 
				 ch[j]=s[i];
				
			}		 
			
		}
		 return ch;
	        
	    }
}
