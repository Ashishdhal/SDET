package DailyCall;
//1. i/p: int array
//2. o/p: int
//
//
//0. Initialize count=0
//1. Iterate using the for loop
//2. Inner loop to compare the index value (i<j)
//3. increament the count 
//4. return count


import org.junit.Test;

import junit.framework.Assert;

public class NumberOfGoodPairs {
	@Test
	public void test() {
		int numIdenticalPairs = numIdenticalPairs(new int[] {1,2,3,1,1,3});
		Assert.assertEquals(numIdenticalPairs, 4);
	}
public int numIdenticalPairs(int[] nums) {
	int count=0;
	for (int i = 0; i < nums.length; i++) {
		for (int j = i+1; j < nums.length; j++) {
			
			if(nums[i]==nums[j]) {
				count++;
			}
				
		}
		
	}
	
	return count;
        
    }

}
