package DailyCall;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

//https://leetcode.com/problems/squares-of-a-sorted-array/
//i/p: int array
//o/p: int array
//1. iterate through the array using loop
//2. take the square of each ele in the array
//3. now sort the array in acsending order.
//4. return the array



public class SqaureOfSortedArray {
	@Test
	public void test() {
		int[] a= {-4,-1,0,3,10};
		int[] sortedSquares = sortedSquares(a);
		Assert.assertArrayEquals(sortedSquares, new int[] {0,1,9,16,100});
	}
	
	 public int[] sortedSquares(int[] nums) {
		 for (int i = 0; i < nums.length; i++) {
			 nums[i]=nums[i]*nums[i];

		}
//		 for (int i : nums) {
//			System.out.println(i);
//			
//		}
		 //Note
		 System.out.println(Arrays.toString(nums));
		 Arrays.sort(nums);
		 
		 
		 
		return nums;
	        
	    }

}
