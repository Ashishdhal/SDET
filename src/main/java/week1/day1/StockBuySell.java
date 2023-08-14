package week1.day1;

import java.util.Iterator;

import org.junit.Test;

import junit.framework.Assert;

public class StockBuySell {
	
	//@Test
//	public void test1() {
//		int maxProfit = maxProfit(new int[] {7,6,4,3,1});
//		System.out.println(maxProfit);
//		Assert.assertEquals(5, maxProfit);
//	}
		@Test
		public void test2() {
			int maxProfit = maxProfit(new int[] {7,6,4,3,1});
			System.out.println(maxProfit);
			Assert.assertEquals(0, maxProfit);
		
	}
	public int maxProfit(int[] prices) {
		int maxProfit=0;
		int currentPrice=0;
		int currentProfit=0;
		int buyPrice=Integer.MAX_VALUE;
		
		for (int i = 0; i < prices.length; i++) {
			
			if(prices[i]<buyPrice) {
				buyPrice=prices[i];
			}
			currentProfit=prices[i]-buyPrice;
			if(maxProfit<currentProfit) {
				maxProfit=currentProfit;
			}
			
		}
		return maxProfit;
		
		
	}

}
