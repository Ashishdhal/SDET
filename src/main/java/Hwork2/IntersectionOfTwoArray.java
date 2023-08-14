package Hwork2;
//Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2]

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import junit.framework.Assert;

public class IntersectionOfTwoArray {
	@Test
	public void test() {
		int[] intersection = intersection(new int[] {1,2,2,1}, new int[]{2,2});
		for (int i = 0; i < intersection.length; i++) {
			System.out.println(intersection[i]);
		}
		assertArrayEquals(new int[] {2}, intersection);
	}
	  public int[] intersection(int[] nums1, int[] nums2) {
		  int[] arr1=new int[5];
		  String s=
		  
		  for (int i = 0; i < nums1.length; i++) {
			  
			  for (int j = 0; j < nums2.length; j++) {
				  
				  if(nums1[i]==nums2[j]) {
					  arr1[i]=nums1[i];
					  
				  }
				
			}
			
		}
		  
		  
		  
		  
		return arr1;
	        
	    }

}
