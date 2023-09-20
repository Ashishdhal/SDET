package DSA;

import java.util.Arrays;
import java.util.Iterator;

import org.junit.Test;

import junit.framework.Assert;

public class HW_1051_Height_Checker {
	@Test
	public void test() {
		int heightChecker = heightChecker(new int[] {1,1,4,2,1,3});//1,1,1,2,3,4
		System.out.println(heightChecker);
		Assert.assertEquals(heightChecker, 3);
		
	}
	//3.22
	 public int heightChecker(int[] heights) {
		 int count=0;
		 int[] expectedArray=new int[heights.length];
		//get the expected array
		 for (int i = 0; i < heights.length; i++) {
		 expectedArray[i]=heights[i];	
		}
		 
		 //sort the expected array
		 Arrays.sort(expectedArray);
		 //compare the indices value of heights and expected array
		 for (int i = 0; i < expectedArray.length; i++) {
			if (expectedArray[i]!=heights[i]) {
				
				count++;
				
			}
		}
		 
		return count;
	        
	    }
}
