package HWAFTER41;
//1. i/p-int
//2. o/p-boolean
//3. find the digits of number
//4. sum the digits
//5. product of digits
//6. compare 4,5 , if same , return true else false


import org.junit.Test;

import junit.framework.Assert;


public class AugSpyNum17 {
	
	@Test
	public void test1() {
		boolean spy = isSpy(123);
		Assert.assertEquals(spy, true);
		
	}
	@Test
	public void test2() {
		boolean spy = isSpy(1124);
		Assert.assertEquals(spy, true);
		
	}
	public boolean isSpy(int num) {
		
		int sum=0;
		int product=1;
		int digit=0;
		
		while(num>0) {
			digit=num%10; //3
			num=num/10;//12
			sum=sum+digit;
			product*=digit;
		}
		System.out.println(sum);
		System.out.println(product);
		
		return (sum==product);
		
		
	}

}
