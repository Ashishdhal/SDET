package DSA;

import org.junit.Assert;
import org.junit.Test;

public class HW_905_SORT_ARRAY_PARITY {

	@Test
	public void test() {

		int[] sortArrayByParity = sortArrayByParity(new int[] { 3, 1, 2, 4 });
		for (int i : sortArrayByParity) {
			System.out.println(i);
		}
		Assert.assertArrayEquals(sortArrayByParity, new int[] { 4, 2, 1, 3 });
	}
	@Test
	public void test2() {

		int[] sortArrayByParity = sortArrayByParity(new int[] {0,1,2});
		for (int i : sortArrayByParity) {
			System.out.println(i);
		}
		Assert.assertArrayEquals(sortArrayByParity, new int[] {0,2,1});
	}
	@Test
	public void test3() { //

		int[] sortArrayByParity = sortArrayByParity(new int[] { 0 });
		Assert.assertArrayEquals(sortArrayByParity, new int[] { 0 });
	}
	@Test
	public void test4() {

		int[] sortArrayByParity = sortArrayByParity(new int[] {3,1,2});
		System.out.println("result : 4::::::::::");
		for (int i : sortArrayByParity) {
			System.out.println(i);
		}
		Assert.assertArrayEquals(sortArrayByParity, new int[] {2,1,3});
	}
	@Test
	public void test5() {

		int[] sortArrayByParity = sortArrayByParity(new int[] {0,2,1,4});
		System.out.println("result : 5::::::::::");
		for (int i : sortArrayByParity) {
			System.out.println(i);
		}
		Assert.assertArrayEquals(sortArrayByParity, new int[] {0,2,4,1}); //0,4,1,2
	}
	
	@Test
	public void test6() {

		int[] sortArrayByParity = sortArrayByParity(new int[] {0,2});
		System.out.println("result : 6::::::::::");
		for (int i : sortArrayByParity) {
			System.out.println(i);
		}
		Assert.assertArrayEquals(sortArrayByParity, new int[] {0,2}); //
	}
	public int[] sortArrayByParity(int[] nums) {//3, 1, 2, 4 
		int sIndex = 0;
		int eIndex = nums.length-1;

		while (sIndex<eIndex) {
//			if(nums[sIndex]== 0 && nums[sIndex+1]%2==0 &&nums.length>2) {
//				sIndex++;
//				sIndex++;
//				//eIndex--;
//				
//			}
			
			if (nums[sIndex] % 2 == 1 && nums[eIndex]%2==0 ) { 
				int temp = nums[sIndex]; //3
				nums[sIndex] = nums[eIndex];//
				nums[eIndex] = temp;
				sIndex++;
				eIndex--;
			}
			
			if(nums[sIndex]%2== 0) {
				sIndex++;
				
			}
			
			if(nums[eIndex]%2== 1) {
				eIndex--;
				
			}
			

			
//			if(nums[sIndex]==0) {
//				sIndex++;
//				
//				
//			}
//			else {
//				eIndex--;
//			}
			
			
			//sIndex++;
			//eIndex--;
		

	//	return nums;

	}
		return nums;

	}
}
