package HWAFTER41;

import org.junit.Test;

import junit.framework.Assert;

public class Chess {
	
	@Test
	public void test() {
		boolean squareIsWhite = squareIsWhite("a1");
		System.out.println(squareIsWhite);
		Assert.assertEquals(false, squareIsWhite);
		
	}
	public boolean squareIsWhite(String coordinates) {//b1
		
		char ch1 = coordinates.charAt(0);//b
		int ch2 = (coordinates.charAt(1))-'0';//1
			
		if(ch1=='a'||ch1=='c'||ch1=='e'||ch1=='g') {
			if(ch2%2==0) {
				return true;
				
			}
			else
				return false;
					
		}
		
		else {
			
			if(ch2%2==0) {
				return false;
			}
			else
				return true;
		}
			
		
		
		//return false;
		
	}

}
