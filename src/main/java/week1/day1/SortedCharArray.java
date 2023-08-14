package week1.day1;

import org.junit.Test;

import junit.framework.Assert;

public class SortedCharArray {
	char ch1;
	
	@Test
	public void test1() {
		
		char ch=biggestChar(new char[] {'b','d','h'});
		Assert.assertEquals('h', ch);
	}
	
	public char biggestChar(char[]cha) {
		
		for (int i = 0; i < cha.length; i++) {
			
			if(cha[i]>'e') {
				
				ch1= cha[i];
				System.out.println(ch1);
			}
			
		}
		
	return ch1;

		
		
		
	}

}
