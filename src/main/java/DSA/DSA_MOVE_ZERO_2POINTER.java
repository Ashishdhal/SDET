package DSA;

import org.junit.Assert;
import org.junit.Test;

public class DSA_MOVE_ZERO_2POINTER {
	
	@Test
	public void test() {
		int[] moveZero = moveZero(new int[] {0,1,0,3,12});
		for (int i = 0; i < moveZero.length; i++) {
			System.out.println(moveZero[i]);
		}
		
		Assert.assertArrayEquals(moveZero, new int[] {1,3,12,0,0});
		
	}

	
	  @Test public void test1() 
	  { 
	  int[] moveZero = moveZero(new int[] {1,0}); 
	  for (int i = 0; i < moveZero.length; i++) {
	  System.out.println(moveZero[i]); }
	  
	  Assert.assertArrayEquals(moveZero, new int[] {1,0});
	  
	  }
	  
	  @Test 
	  public void test2() { 
		  int[] moveZero = moveZero(new int[]{1,1,0,3,12});
	  for (int i = 0; i < moveZero.length; i++) {
			  System.out.println(moveZero[i]); }
			  
			  Assert.assertArrayEquals(moveZero, new int[] {1,1,3,12,0});
			  
			  }
	  
	  @Test 
	  public void test3() {
		  
		  int[] moveZero = moveZero(new int[]{0,1});
	  for (int i = 0; i < moveZero.length; i++) {
			  System.out.println(moveZero[i]); }
			  
			  Assert.assertArrayEquals(moveZero, new int[] {1,0});
			  
			  }
	 
	public int[] moveZero(int[] nums) {
		int startIndex=0;
		int endIndex=0;
		int temp=0;
		
		while(startIndex<nums.length && endIndex<nums.length) {  //{0,1,0,3,12}
			
			
			if(nums[startIndex]==0 && nums[endIndex]!=0) { //  
				
				temp=nums[startIndex];
				nums[startIndex]=nums[endIndex];
				nums[endIndex]=temp;
				startIndex++;
				endIndex++;
			}
				
			
			else if( nums[endIndex]!=0 ) { 
				endIndex++;
				startIndex++;
				
	
			}
			else if(nums[endIndex]==0)
			{
				endIndex++;
			}
				
		}
			
				
			
		
		
	
	//	return nums;


		return nums;
	
}
	}
		


	
