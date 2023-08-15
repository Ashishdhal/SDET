package DailyCall;

import org.junit.Test;

import junit.framework.Assert;

public class FindDifferenceMulAndSum {
	@Test
	public void test() {
		
		int findDiff = findDiff(2234);
		System.out.println(findDiff);
		Assert.assertEquals(findDiff, 37);
	}
	
	
	public int findDiff(int num) {
		
		int mul=1;
		int sum=0;
		int digit;
		
		//while(num>=10)
		while(num>0) {
			
			digit=num%10;
			num=num/10;
			mul=mul*digit;
			sum=sum+digit;
		}
//		sum=sum+num;
//		mul=mul*num;
		System.out.println(mul);
		System.out.println(sum);
		return mul-sum;
		
	}

}
