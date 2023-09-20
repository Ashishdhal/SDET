package DSA;

import org.junit.Test;

import junit.framework.Assert;

//import static org.junit.Assert.assertArrayEquals;
//import static org.testng.Assert.assertEquals;

//import java.util.ArrayList;
//import java.util.List;

//import org.junit.Test;

//1. Iniutialize two pointers sIndex=0,  eIndex=k-1
//2. get the first window index from sIndex to eIndex
//3. take the average of index values and check if >=thresold , if yes increase count
//4. now remove the first index of window and add the next window
//5. repeat step 3
//6. return count 
public class HW_1343_SUB_ARRAY {
	@Test
	public void test() {
		int numOfSubarrays = numOfSubarrays(new int[] { 2, 2, 2, 2, 5, 5, 5, 8 }, 3, 4);
		System.out.println(numOfSubarrays);

		Assert.assertEquals(3, numOfSubarrays);
	}

	public int numOfSubarrays(int[] arr, int k, int threshold) {

		int sIndex = 0;
		// int eIndex=k-1;
		int sum = 0;
		int avg = 0;
		int count = 0;
		// int[] s=new int[3];
		// List<Integer> ls=new ArrayList<Integer>();

		while (sIndex < k) {

			// ls.add(sIndex);
			sum += arr[sIndex++];
		}

		avg = sum / k;
		if (avg >= threshold) {
			count++;
		}

		while (sIndex < arr.length) {

			// sum+=arr[sIndex]-arr[sIndex-k];
			sum = sum + arr[sIndex] - arr[sIndex - k];

			// sum+=arr[sIndex];
			avg = sum / k;
			if (avg >= threshold) {
				count++;
				
			}
			sIndex++;
		}

		return count;

	}

}
