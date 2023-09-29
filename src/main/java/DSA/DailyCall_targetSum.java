package DSA;
//1. initialize 2 pointers left=0, right=1, sum=0
//1.1: create a new array a of size 2
//2. iterate for the condition left<input length
//3. find sum of indices value of left and right and compare it with target 
//4. if satisfied add left and right to the array a and break the loop
//5. else increament the right pointer 
//6. once the right pointer reach end index, increment the left pointer and make right =0
import org.junit.Test;

public class DailyCall_targetSum {
	@Test
	public void test() {
		
		int[] findTargetSum = findTargetSum(new int[] {2,3,5,6,7,8}, 11);
	}
	
	public int[] findTargetSum(int[] nums,int k) {
		
		int left=0,right=0, sum=0;
		int[] a=new int[2];
		
		while(left<a.length) {
			
		while(right<a.length) {
			
			sum=nums[left]+nums[right];
			if(sum==11) {
				a[0]=left;
				a[1]=right;
			}
			right++;
		}
		left++;
		}
		
		
		
		
		return nums;
		
		
	}

}
