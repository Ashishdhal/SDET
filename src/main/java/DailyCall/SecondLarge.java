package DailyCall;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class SecondLarge {
	@Test
	public void test() {
		int secondLargest = secondLargest(new int[] {7,3,4,2,9,6,10});
		System.out.println(secondLargest);
		Assert.assertEquals(3, secondLargest);
	}
	
	public int secondLargest(int[] a) {
			Arrays.sort(a);
		
//		for (int i = 1; i < a.length; i++) {
//			System.out.println(a[1]);
//			break;
//		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if((a[i]<a[j])&&(a[i]!=a[j])) {
					return a[j];
				//	break;
					
				}
				System.out.println(a[j]);
				
			}
		
	}
		return 0;

}
}
