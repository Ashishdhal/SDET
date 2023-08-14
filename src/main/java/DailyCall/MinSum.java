package DailyCall;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.junit.Test;
import org.testng.Assert;
//1234 -> 1234  : 13+24 
//https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/
public class MinSum {
	
	@Test
	public void test() {
		int minimumSum = minimumSum(2932);
		Assert.assertEquals(minimumSum, 52);
	}
	public int minimumSum(int num) {
		
		String s1 = "";
		String s2 = "";
		String str = String.valueOf(num);
		char[] charArray = str.toCharArray();
		Arrays.sort(charArray);// 2,2,3,9
		System.out.println(charArray);
		for (int i = 0; i < charArray.length; i++) {
			if(i%2==0) {
				s1=s1+charArray[i];
			}
			else {
				s2=s2+charArray[i];
			}
				
			
		}
		System.out.println(s1);
		System.out.println(s2);
		Integer n1 = Integer.valueOf(s1);
		Integer n2 = Integer.valueOf(s2);
		return n1+n2;
	     

	    }
	

}
