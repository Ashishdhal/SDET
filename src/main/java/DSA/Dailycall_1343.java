package DSA;

import org.junit.Test;

import junit.framework.Assert;

//1. Initialize two pointers sIndex=0,  eIndex=k-1
//2. get the first window,  index from sIndex to eIndex
//3. take the average of index values and check if average>=thresold , if yes increase count
//4. now remove the first index of window and add the next window
//5. repeat step 3
//6. return count 
public class Dailycall_1343 {
	
	@Test
	public void test1() {
		int numOfSubarrays = numOfSubarrays(new int[] {2,2,2,2,5,5,5,8}, 3, 4);
		Assert.assertEquals(numOfSubarrays, 3);
		
		
	}
	@Test
	public void test2() {
		int numOfSubarrays = numOfSubarrays(new int[] {11,13,17,23,29,31,7,5,2,3}, 3, 5);
		Assert.assertEquals(numOfSubarrays, 6);
		
	}
	
	
	public int numOfSubarrays(int[] arr, int k, int threshold) {
		
		int startIndex = 0;
		int count = 0;
		int sum = 0;
		int avg = 0;
	
		while (startIndex < k) {

			sum = sum+arr[startIndex]; 
			startIndex++;
		}

		avg = sum / k;
		if (avg >= threshold) {
			count++;
		}

		while (startIndex < arr.length) {

			
			sum = sum + arr[startIndex] - arr[startIndex - k];
			avg = sum / k;
			if (avg >= threshold) {
				count++;
				//startIndex++;
			}
			startIndex++;
		}

		return count;

	}
	}
	


