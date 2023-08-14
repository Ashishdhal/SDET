package DailyCall;
//https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/description/
import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class MinSumApproach2 { 
	@Test
	public void test() {
		int minimumSum = minimumSum(2923);
		Assert.assertEquals(minimumSum, 52);
	}
	
	public int minimumSum(int num) {
		int[] a= new int[4];
		
		a[0]=num/1000;
		a[1]=(num%1000)/100;
		a[2]=(num%100)/10;
		a[3]=(num%100)%10;
	
		Arrays.sort(a);
		int n1=(a[0]*10)+a[2];
		int n2=(a[1]*10)+a[3];
		return n1+n2;

	    }

}
