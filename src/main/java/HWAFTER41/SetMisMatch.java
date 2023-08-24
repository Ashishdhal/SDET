package HWAFTER41;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

//https://leetcode.com/problems/set-mismatch/

/*psuedo code:
1. CREATE  AN EMPTY INT ARRAY B
2. ITERATE USING FOR LOOP
3. CHECK FOR BELOW CONDITION
 a[i]==a[i+1]{
b[0]=a[i];
b[1]=a[i]+1;
}
4 Return int array b

Input: nums = [1,2,2,4]
Output: [2,3]
*/

public class SetMisMatch {
	int[] a= new int[2]; 
	
	@Test
	public void test() {
		int[] findErrorNums = findErrorNums(new int[]{1,2,2,4});
		for (int i : findErrorNums) {
		System.out.println(i);
		}
		Assert.assertArrayEquals(findErrorNums, new int[] {2,3} );
	}
	 public int[] findErrorNums(int[] nums) {
		 
		 
		 for (int i = 0; i < nums.length; i++) {
			if(nums[i]==nums[i+1]) {
			
				
				a[0]=nums[i];
		 		System.out.println(a[0]);
				a[1]=nums[i]+1;
				System.out.println(a[1]);
				return a;
				
			}
		}
		/*
		 * for (int b : a) 
		 * { System.out.println(b);
		 * 
		 *  } 
		 */  
		/*
		 * for (int b : a) { System.out.println(b); }
		 */
			 
//		 for (int i = 0; i <a.length; i++) {
//			 System.out.println(a[i]);
//	 }
		 System.out.println(a[1]);
		return a;
			
		
		 
	//	return a;
	        
	        

	    }
	
	// return a;

}
