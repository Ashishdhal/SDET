package Hwork2;

import org.junit.Test;

import junit.framework.Assert;

//Input: n = 10
//Output: 4
//Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.


	

public class PrimeNo {
	@Test
	public void test() {
		int countPrimes = countPrimes(20);
		System.out.print(countPrimes);
		//Assert.assertEquals(4, countPrimes)
	
	}
	public int countPrimes(int n) {
		int cnt1=1; // 1 included
		 int cnt2=0;
		 
		for (int i = 2; i < n; i++,cnt1=1) {
			
			for (int j = 2; j < n; j++) { 
				//int cnt2=0;
				
				if(i%2!=0) {
				
				if(i%j==0) {
					cnt1++;
				
				if(cnt1==2) {
					cnt2++;
					//cnt1=1;
				}
			}
			}
			}
		} 
		System.out.println(cnt2);
		return cnt2;
		 
		 
		 
	 }

}
