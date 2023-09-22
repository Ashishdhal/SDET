package DSA;

import org.junit.Assert;
import org.junit.Test;

public class HW_2562_ARRAY_CONCAT {
//	@Test
//	public void test() {
//
//		long findTheArrayConcVal = findTheArrayConcVal(new int[] { 7, 52, 2, 4 });
//		System.out.println(findTheArrayConcVal);
//		Assert.assertEquals(findTheArrayConcVal, 596);
//	}

	@Test
	public void test1() {

		long findTheArrayConcVal = findTheArrayConcVal(new int[] { 5, 14, 13, 8, 12 });
		System.out.println(findTheArrayConcVal);
		Assert.assertEquals(findTheArrayConcVal, 673);

	}
	// 5,14,13,8,12

	public long findTheArrayConcVal(int[] nums) {// 5, 14, 13, 8, 12

		int startIndex = 0;
		int endIndex = nums.length - 1;
		String s = "";
		int intValue = 0;
		if (nums.length == 1) {
			return nums[0];
		}

		while (startIndex <endIndex) {// 0<3

			if (startIndex < endIndex) {
				s = s + nums[startIndex++];// 7
				s = s + nums[endIndex--];// 74

				intValue = intValue + Integer.valueOf(s);// 0+74=74
				s = "";
			}
			if ((startIndex == endIndex) && ((nums.length) % 2) == 1) {

				intValue = intValue + nums[(startIndex)];
				break;
			}
		}

		return intValue;

	}

}
