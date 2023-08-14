package week1.day2;

import org.junit.Test;

public class TargetIndeces {
	
//	
//	  * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//			  You may assume that each input would have exactly one solution, and you may not use the same element twice.
//			       *
//			       *Input: int[], int
//			       *Outout: int[]
//			       * Iterate the array with nested for loop
//			       * outloop + innerloop = target
//			       *  return [outloop,inner loop]
//			       *  
//			       *  return [-1,-1]
//			       */

	@Test
	public void test() {
		int[] arr= {2,7,11,15};
		
		
	}
	
	public static void main(String[] args) {
	    int[] indeces=new int[5];
		
		
		int target=9;
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[i]+arr[j]==9) {
				indeces[0]= arr[i]	;
				indeces[0]= arr[i]	;
				System.err.println(indeces);
					
				}
				
			}
			
		}
	
		
	}
	
	
}
