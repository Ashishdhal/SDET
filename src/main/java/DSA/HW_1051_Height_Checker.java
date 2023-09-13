package DSA;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class HW_1051_Height_Checker {
	@Test
	public void test() {
		int heightChecker = heightChecker(new int[] {1,1,4,2,1,3});
		Assert.assertEquals(heightChecker, false);
		
	}
	
	 public int heightChecker(int[] heights) {
		 int[] b=new int[heights.length];
		 Arrays.sort(heights);
		 
		 
		 
		 
		 
		return 0;
	        
	    }
}
