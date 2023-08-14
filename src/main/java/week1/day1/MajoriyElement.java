package week1.day1;

import org.junit.Test;

import junit.framework.Assert;

public class MajoriyElement {
	
	
//	Input: nums = [3,2,3]
//			Output: 3

	@Test
	public void test() {
		int[] arr1= {3,2,3};
		//System.out.println(arr1.length);
		int findMajority = findMajority(arr1);
		
//		Assert.assertEquals(3, findMajority);
		
	}
	
	public int findMajority(int[] arr) {
		int val=0;
		int halfLength = arr.length/2;
		//System.out.println(halfLength);
		int cnt=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[i]==arr[j]) {
					
				cnt++;
				}
			}
			
			if(cnt>halfLength) {
				System.out.println(arr[i]);
				val=arr[i];
			}
			
			
		}
		System.out.println(val);
		return val;
		
		
	}

}
