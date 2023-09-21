package DSA;

import org.junit.Test;

import junit.framework.Assert;

//p.code:
//0. Int before=0, int after=0, count =0
//1.Intialize a pointer startIndex=0
//2. Iteate using a while loop with condition s<nums.length-1
//3. get the pointer index value and add+3 and remove +3 and store in before and after 
//4. now check if this values are present in array, if yes, increas count, its triplet
//5. return the count value 

public class HW_2367_NoOFArithMaticTrplet {
	@Test
	public void test() {
		int arithmeticTriplets = arithmeticTriplets(new int[] { 0, 1, 4, 6, 7, 10 }, 3);
		System.out.println(arithmeticTriplets);
		Assert.assertEquals(arithmeticTriplets, 2);
	}

	public int arithmeticTriplets(int[] nums, int diff) {
		int count = 0;
		int trplet = 0;
		int before = 0;
		int after = 0;
		int sIndex = 0;
		while (sIndex < nums.length) {

			before = nums[sIndex] - diff;
			after = nums[sIndex] + diff;

			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == before) {
					count++;
				}
				if (nums[i] == after) {
					count++;
				}
			}
			if (count == 2) {
				trplet++;
			}
			sIndex++;
			count=0;
		}

		return trplet;

	}

}
