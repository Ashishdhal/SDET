package Hwork2;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class MissingNumber2 {
//	Input: nums = [3,0,1]
//			Output: 2
	@Test
	public void test() {
		int missingNumber = missingNumber(new int[] {9,6,4,2,3,5,7,0,1});
	System.out.println(missingNumber);
		Assert.assertEquals(8, missingNumber);
	}
	  public int missingNumber(int[] nums) {
		  Arrays.sort(nums);
		  for (int i = 0; i <= nums.length; i++) {
			  if(i!=nums[i]) {
				  
				  return i;
			  }
			
		}
		  
		  	  
		return 0;
	        
	    }

}
