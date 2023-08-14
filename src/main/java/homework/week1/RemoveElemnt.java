package homework.week1;

import java.util.Arrays;
import java.util.Iterator;

/*
 *6. Remove the target element in the array
							
	example 1: input = [2, 3, 3, 4, 5], target=3
			   output = [2, 4, 5]
			   explanation: when 3 is removed from input array, 
							output is [2, 4, 5]
	
	example 2: input = [2, 2], target=2
			   output = []
			   explanation: when 2 is removed, output would be empty array/	    
 */

public class RemoveElemnt {
	
	public static void main(String[] args) {
		
		int[] a={2,3,3,4,5};//3
		//int[] b= {};
		int[] b=new int[3];
		int j=0;
		int target=3;
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]!=target) {
				b[j]=a[i];
				j++;
				
				
			}
			
		}
	//	System.out.println(b);
		
//		for (int i = 0; i < b.length; i++) {
//			
//		System.out.print(b[i]);
//	}
		System.out.println(Arrays.toString(b));
		
	}

}
