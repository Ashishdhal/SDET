package HWAFTER41;

import org.junit.Test;

public class AlternateDigit {
	@Test
	public void test() {
		int alternateDigitSum = alternateDigitSum(116);
		System.out.println(alternateDigitSum);
	}
	 public int alternateDigitSum(int n) {
		 int res=0;
		 String s = String.valueOf(n);
		 for (int i = 0; i < s.length(); i++) {
			 if(i%2==0) {
				 char ch = s.charAt(i);
				 int numericValue = Character.getNumericValue(ch);
				 res=res+numericValue;
			 }
			 else {
				 char ch = s.charAt(i);
				 int numericValue = Character.getNumericValue(ch);
				 numericValue=numericValue*-1;
				 res=res+numericValue;
				 
			 }
					
		}
		return res;
		 
	        
	    }

}
