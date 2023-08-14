
/*	Check if the given number is prime or not 
	(Hint: A number is prime if it divisible only by 1 and itself)
	Example1: input = 5
			output = true
	Example2: input = 6
			output = false
			*/

package week1.day1;

import org.junit.Test;

import junit.framework.Assert;

public class PrimeNumOrNot {
	

	int count=1;
	@Test
	public void test1() {
		
		boolean prime = isPrime(5);
		Assert.assertEquals(true, prime);
	}
	@Test
	public void test2() {
		boolean prime = isPrime(6);
		Assert.assertEquals(false, false);
	}
	public boolean isPrime(int num) {
		for(int i=2;i<=num;i++) {  //num=5
			
			if(num%i==0) {
				count++;
			}
			//System.out.println(count);	
			
		}
		System.out.println(count);
		if(count==2) {
			return true;
		}
		else
			return false;
		
		
		
		
	}
	


}
