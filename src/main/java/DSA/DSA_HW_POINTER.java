package DSA;

import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class DSA_HW_POINTER {
	
	@Test
	public void test() {
		List<String> summaryRanges = summaryRanges(new int[] {0,1,2,4,5,7});
		System.out.println(summaryRanges);
	}
	

	 public List<String> summaryRanges(int[] nums) {
		 
	        List<String> result = new ArrayList<String>();

	        int leftIndex = nums[0];
	        int rightIndex = nums[0];

	        for (int i = 1; i < nums.length; i++) {
	            if (nums[i] == nums[i - 1] + 1) {
	            	rightIndex = nums[i];
	            } else {
	                if (leftIndex == rightIndex) {
	                    result.add(Integer.toString(leftIndex));
	                } else {
	                    result.add(leftIndex + "->" + rightIndex);
	                }
	                leftIndex = rightIndex = nums[i];
	            }
	        }

	        if (leftIndex == rightIndex) {
	            result.add(Integer.toString(leftIndex));
	        } else {
	            result.add(leftIndex + "->" + rightIndex);
	        }

	        return result;
	    }

	    
	}



