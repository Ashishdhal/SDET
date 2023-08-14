package HWAFTER41;

import org.junit.Test;

//https://leetcode.com/problems/contains-duplicate/

public class Dulicate {
	
	@Test
	public void test() {
		
		boolean containsDuplicate = containsDuplicate(new int[]{1,2,9,8,1});
		System.out.println(containsDuplicate);
		
	}

	 public boolean containsDuplicate(int[] nums) {
		 
		 for (int i = 0; i < nums.length; i++) {
			 
			 for (int j = i+1; j < nums.length; j++) {
				
			
			 if(nums[i]==nums[j]) {
				 return true;
			 }
		}
		 
		 } 
		return false;
		 
	        
	    }
}
