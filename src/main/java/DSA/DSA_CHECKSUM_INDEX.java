package DSA;

import org.junit.Assert;
import org.junit.Test;

/*Given a sorted array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
Input: nums = [2,3,5,7], target = 9
Output: [0,3]
Output: Because nums[0] + nums[3] == 9, we return [0, 3].*/

/*p.code:
	1. Iterate using the array 
	2. Start index=0 , end index =length-1
	3. take the sum of index value and compare it with target value
	4. If the sum=target, return the indices
	4. if the sum>target, dec endIndex and check when the sum=target  return the indices
	4. if the sum<target, increament the startIndex, when the sum=target return the indices
	4. If matches, return the startIndex and endIndex
	*/

public class DSA_CHECKSUM_INDEX {
	@Test
	
	
	  public void test() {
	  
	  int[] findIndex = findIndex(new int[] {1,2,3,4,5}, 6);
	  //System.out.println(findIndex.toString()); 
	  Assert.assertArrayEquals(findIndex,new int[] {0,4});
	  
	  }
	
		
		  public void test1() {
		  
		  int[] findIndex = findIndex(new int[] {2,3,5,7}, 9); //
		  System.out.println(findIndex.toString()); Assert.assertArrayEquals(findIndex,
		  new int[] {0,3});
		  
		  }
		 
	//  
	
	  public void test2() {
	  
	  int[] findIndex = findIndex(new int[] {1,4,5,8,11,12,16,21}, 19);
	  Assert.assertArrayEquals(findIndex, new int[] {3,4});
	  
	  }
	 
	
	public int[] findIndex(int[] num, int target) {
		//int[] a= new int[2];
		int startIndex=0;
		int endIndex=num.length-1;
		
		while(startIndex<endIndex) { //0<7  , 1<6 , 2<5, 3<5 , 3<4
			
		
		if(num[startIndex]+num[endIndex]==target) { //1+21=22 !=19, 4+16=20 !=19, 5+12=17 !=19, 8+12=20 !=19, 8+11=19 ==19
			
			return new int[] {startIndex,endIndex}; //[3,4]
		}
		else if(num[startIndex]+num[endIndex]>target) { // 22>19, 20>19, 17>19, 20>19
			
			endIndex--; // 7->6, 6->5, 5->4
			
			}	
		
		else if(num[startIndex]+num[endIndex]<target) {  // 17<19 , 4+12=16 < 19, 17<19, 20<19
			
			startIndex++; //0-> 1 , 1->2, 2->3
				
			}
		}
		
		
		return new int[] {0,0};
		
		
	}

}
