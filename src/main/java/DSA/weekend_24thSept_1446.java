package DSA;

import org.junit.Test;

import junit.framework.Assert;

//0. maxWindwow size =-1
//1. Initialize 2 pointers left and right as 0
//
//2. check if next index char is not same as the prevoius one, if yes, incerase both left and right,  
//
//3. else increase the right index and find the window size:  ((left-right)+1)
//
//4. store the current window size and compare it with the maxwindow size 
//5. return the max window size 

public class weekend_24thSept_1446 {
	@Test
	public void test1() {
		int maxPower = maxPower("leetcode");
		System.out.println(maxPower);
		Assert.assertEquals(maxPower, 2);

	}
	@Test
	public void test2() {
		int maxPower = maxPower("abbcccddddeeeeedcba");
		System.out.println(maxPower);
		Assert.assertEquals(maxPower, 5);

	}
	//abbcccddddeeeeedcba


	
	public int maxPower(String s) {
	    int maxCount = 0;  
	    int left = 0;     
	    int right = 0;    
	   
	    while (right < s.length()) {
	        if (s.charAt(right) != s.charAt(left)) {
	            left = right;  
	        int currentCount = right - left + 1;  
	        maxCount = Math.max(maxCount, currentCount);  
	        right++;  
	    }

	    
	}
	    return maxCount;

	
//	int left=0;
//	int right=0;
//	int maxWindowSize=-1;
//	int currentWindowSize=0;
//	
//	while(right<s.length()-1) {
//		
//		if(s.charAt(right)==s.charAt(right+1)){
//			right++;
//			
//		}
//		
//	if())	
//		break;
//	
//		right++;
//		left++;
//		currentWindowSize=(right-left)+1;
//		maxWindowSize=Math.max(maxWindowSize, currentWindowSize);
//	
//	else {
//		
//		right++;
//		
//		//
//		//left++;	
//	}
//	
//	
//	}
	
//	if(maxWindowSize<currentWindowSize) {
//		maxWindowSize=currentWindowSize;
//		currentWindowSize=0;
//	}
		
	

	//return maxWindowSize;

}

}
