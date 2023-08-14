package homework.week1;

import java.util.Arrays;

public class SqureOFSortedArray {
	
	public static void main(String[] args) {
		
		int[] a= {-7,-3,2,3,11};
		
		for (int i = 0; i < a.length; i++) {
			
			a[i]*=a[i];
			
			
		}
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
		
		
	}

}
