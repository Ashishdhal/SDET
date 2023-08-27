package HWAFTER41;

import org.junit.Test;

import junit.framework.Assert;

public class Flowers {
	
	@Test
	public void test1() {
		
		boolean canPlaceFlowers = canPlaceFlowers(new int[] {1,0,1,0,1,0,0,0}, 1);
		System.out.println(canPlaceFlowers);
		Assert.assertEquals(canPlaceFlowers, true);
		
	}
	@Test
public void test2() {
		
		boolean canPlaceFlowers = canPlaceFlowers(new int[] {0,0,0,1}, 2);
		System.out.println(canPlaceFlowers);
		Assert.assertEquals(canPlaceFlowers, true);
		
	}
	
	 public boolean canPlaceFlowers(int[] flowerbed, int n) {
		 
		int cnt=0;
		for (int i = 0; i < flowerbed.length; i++) {
			
			if(flowerbed[i]==0) {
				
				if(i%2==0) {
					if((flowerbed[i]==0))
						cnt++;
				}
					
			}
			else{
				
				if(flowerbed[i]==1) { 
					if(i%2==1) {
						if(flowerbed[i]==1)
							cnt++;
					}
			}
		
			}		 
	//	return cnt==n;

		   

	    }
		System.out.println(cnt);
		return cnt==n;

}
}
