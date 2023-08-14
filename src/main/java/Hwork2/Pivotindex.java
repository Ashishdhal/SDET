package Hwork2;

import org.junit.Test;

import junit.framework.Assert;

public class Pivotindex {
	/*Input: nums = [1,7,3,6,5,6]
Output: 3
Explanation:
The pivot index is 3.
Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
Right sum = nums[4] + nums[5] = 5 + 6 = 11    */
int pivot=0;	
int sum1=0;
int sum2=0;
int leftSum=0;
int rightSum=0;

	
@Test
public void test() {
	int findPivot = findPivot(new int[] {1,7,3,6,5,6});
	System.out.println(findPivot);
	Assert.assertEquals(3, findPivot);
}
	public int findPivot(int[] a) {
		
//		for (int i = 1; i < a.length; i++) {
//			sum1=sum1+a[i];	
//		}
//		if(sum1==0) {
//			return 0;
//		}
//		
//		for (int i = a.length-1; i >= 0; i--) {
//			sum2=sum2+a[i];	
//		}
//		if(sum2==0) {
//			return a.length-1;
//		}
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < i; j++) {
				leftSum=leftSum+a[j];
			}
			for (int j = i+1; j < a.length; j++) {
				rightSum=+a[j];
				
			}
			if(leftSum==rightSum) {
				System.out.println(leftSum);
				System.out.println(rightSum);
				return i;
		
			}
		
		}
		
		return -1;

	}
	
}
