package DSA;

import org.junit.Assert;
import org.junit.Test;

/*Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.
 
Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

i/p: int array
o/p: int array


Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]


Input: nums = [1,1,0,3,12]
Output: [1,1,3,12,0]

Input: nums = [3,1,4,3,12]
Output: [3,1,4,3,12]

p.ceode:

1. Iterate the nums array using loop
2. if the index value is 0, if so swap it with next index value 
3. repeate step 2 for next 0 index value
4. return the nums array */

public class DSA_CLASS_MOVE_ZERO {
	@Test
	public void test() {
		int[] moveZero = moveZero(new int[] {0,1,0,3,12});
		for (int i = 0; i < moveZero.length; i++) {
			System.out.println(moveZero[i]);
		}
		
		Assert.assertArrayEquals(moveZero, new int[] {1,3,12,0,0});
		
	}
	@Test
	public void test1() {
		int[] moveZero = moveZero(new int[] {1,1,0,3,12});
		for (int i = 0; i < moveZero.length; i++) {
			System.out.println(moveZero[i]);
		}
		
		Assert.assertArrayEquals(moveZero, new int[] {1,1,3,12,0});
		
	}
	
	@Test
	public void test2() {
		int[] moveZero = moveZero(new int[] {1,2,4,3,12});
		for (int i = 0; i < moveZero.length; i++) {
			System.out.println(moveZero[i]);
		}
		
		Assert.assertArrayEquals(moveZero, new int[] {1,2,4,3,12});
		
	}
	
	
	
	public int[] moveZero(int[] nums) {
		
		
		
		for (int i = 0; i < nums.length; i++) {
			
				for (int j = i+1; j < nums.length; j++) {
				if(nums[i]==0) {	
				
				int temp=nums[i];
				nums[i]=nums[j];
				nums[j]=temp;
			}
			
		}
		
		
	}
		return nums;
	
	

}
}
