package DSA;
//1.Initialize 2 pointers left=0, right=0 with and balckcount =0 
//2.Iterate till the kth index to get the first frame and find the max black count
//3. continue the operation for rest of the string and slide the window while making left++, right++
//4. subtract the max from k and return the value

import org.junit.Test;

import junit.framework.Assert;

public class HW_2379_Recolor {
	
@Test
public void test() {
	
	int minimumRecolors = minimumRecolors("WBBWWBBWBW", 7);
	System.out.println(minimumRecolors);
	Assert.assertEquals(3, minimumRecolors);
}

@Test
public void test1() {
	
	int minimumRecolors = minimumRecolors("WBWBBBW", 2);
	System.out.println(minimumRecolors);
	Assert.assertEquals(0, minimumRecolors);
}
public int minimumRecolors(String blocks, int k) { //"WBBWWBBWBW"
	
	//1.Initialize 2 pointers left=0, right=0 with and balckcount =0 
	//2.Iterate till the kth index to get the first frame and find the max black count
	//3. continue the operation for rest of the string and slide the window while making left++, right++
	//4. subtract the max from k and return the value
 
    int max = -1, left = 0,right=0, blackCount = 0;
  //2.Iterate till the kth index to get the first frame and find the max black count
    while(right < k) {
        if(blocks.charAt(right)=='B')
        	blackCount++;
        	right++;
    }
    //finding max
    max = Math.max(blackCount, max);
    
    //3. continue the operation for rest of the string and slide the window while making left++, right++
    while( right < blocks.length()){
    	//right++;
    	
    	
    	if(blocks.charAt(left)=='B') {
    		blackCount--;
    	}
    	if(blocks.charAt(right)=='B') {
    		blackCount++;
    	}
    	left++;
    	right++;
        max = Math.max(blackCount, max);
    }
//4. subtract the max from k and return the value
   // return max;
    System.out.println("max :"+max);
	
	
	return k-max;
        
    }
}

	
//public int minimumRecolors(String blocks, int k) { //"WBBWWBBWBW"
//	  
//    int max = -1, left = 0,right=0, blackCount = 0;
//  
//    while(right <= k) {
//        if(blocks.charAt(right)=='B')
//        	blackCount++;
//        	right++;
//    }
//    //finding max
//    max = Math.max(blackCount, max);
//    
//    //continue the operation for rest of the string
//    while( right < blocks.length()){
//    	right++;
//    	
//    	
//    	if(right<blocks.length() && blocks.charAt(left)=='B') {
//    		blackCount--;
//    	}
//    	if(right<blocks.length() && blocks.charAt(right)=='B') {
//    		blackCount++;
//    	}
//    	left++;
//        max = Math.max(blackCount, max);
//    }
//
//   // return max;
//    System.out.println("max :"+max);
//	
//	
//	return k-max;
//        
//    }
//}
