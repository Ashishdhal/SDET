package DailyCall;

import java.util.Arrays;

//input Array = {7,3,4,2,9,6,10}, Find 2nd maximum
public class SecondLargest {
	
	
	public static void main(String[] args) {
		int temp;
		int[] a= {7,3,4,2,9,6,10};
		Arrays.sort(a);
		
//		for (int i = 1; i < a.length; i++) {
//			System.out.println(a[1]);
//			break;
//		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if((a[i]<a[j])&&(a[i]!=a[j])) {
					
					break;
				}
				System.out.println(a[j]);
				
			}
			
			
		}
		
		
		
	}

}
