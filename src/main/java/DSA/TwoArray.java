package DSA;

/*
Given two array, arr1, and arr2
Subtract the sum of arr2 with arr1 respective index value, and also the sum should exclude the respective index in arr2
 */

public class TwoArray {
	public static void main(String[] args) {
		int sum=0;
		int result;

	int[] arr1=new int[] {1,2,3,4};
	int[] arr2=new int[] {2,3,4,5};
	for (int i = 0; i < arr2.length; i++) {
		
		for (int j = 0; j < arr1.length; j++) {
			
			if(i!=j) {
				sum=sum+arr1[i];
				result=sum-arr2[j];
				System.out.println(result);
			}
			
		}
	}

	}
}
