package HWAFTER41;

import org.junit.Test;

import junit.framework.Assert;

public class SingOfPrductOfArray {
	
	@Test
	public void test() {
		int arraySign = arraySign(new int[] {-1,-2,-3,4,3,2,0});
		System.out.println(arraySign);
		Assert.assertEquals(0, arraySign);
		
		
	}

	public int arraySign(int[] nums) {

		int cnt=0;
		for (int i : nums) {
			if(i==0) {
				return 0;
			}
			
			if(i<0) {
				cnt++;
			}
		
				if(cnt%2==0) {
					return 1;
				}
				else
					return -1;
		}
		return 0;

	}
}
