package DSA;

import org.checkerframework.checker.units.qual.s;
import org.junit.Test;

import junit.framework.Assert;

public class Weekend_24_sept_485 {

//	@Test
//	public void test() {
//		int findMaxConsecutiveOnes = findMaxConsecutiveOnes(new int[] { 1, 1, 0, 1, 1, 1 });
//		System.out.println(findMaxConsecutiveOnes);
//		Assert.assertEquals(findMaxConsecutiveOnes, 3);
//	}
	@Test
	public void test1() {
		int findMaxConsecutiveOnes = findMaxConsecutiveOnes(new int[] { 1, 0, 1, 1, 0, 1 });
		System.out.println(findMaxConsecutiveOnes);
		Assert.assertEquals(findMaxConsecutiveOnes, 2);
	}

	public int findMaxConsecutiveOnes(int[] nums) {//{1, 0, 1, 1, 0, 1}
		 
		 int sIndex=0;
		 int eIndex=0;
		// int cnt=0;
		 int max=-1;
		 
		 
		 
		 while(eIndex<nums.length){ 
		 
			 if(nums[eIndex]==1) { 
				 //cnt++;
				 
				 eIndex++;
				
		 }
			 else {
				 //(nums[eIndex]==0) {
				// break;
				 //	 }
			 	max = Math.max(max, eIndex-sIndex);
				 sIndex=eIndex;
 				 eIndex++;
 				// eIndex++;
			 
		 
	    }
//			 if(eIndex==nums.length) {
//				 max = Math.max(max, (eIndex-sIndex)+1);
//			 }
		 //return max;
	 }
		 if(eIndex==nums.length) {
			 sIndex++;
			 max = Math.max(max, (eIndex-sIndex));
		 }
		return max;
}
}

// String s="";
// int[] a=new int[nums.length];

//		 while(sIndex<nums.length) {
//			 if(nums[i]==0) {
//				a[]
//				 sIndex++;
//				 
//			 }
//			 if(nums[i]==1) {
//				 cnt++;
//				 sIndex++;
//			 }
//			 
//		 }

//		 for (int i = 0; i < nums.length; i++) {
//			 
//			 if(nums[i]==0) {
//				 	s=s+cnt;	
//					 sIndex++;
//					 
//				 }
//				 if(nums[i]==1) {
//					 cnt++;
//					 sIndex++;
//				 }
//			
//		}
//		
//		 
//		return 0;
