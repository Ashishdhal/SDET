package week1.day1;

import java.util.Iterator;

import org.junit.Test;

public class CheckOccurance {
	
	int[] arr={1, 1, 2, 2, 2, 2, 3};
	int x=2;
	int cnt=0;
	
@Test
public void sum() {
	for (int i = 0; i < arr.length; i++) {
		
		if(x==arr[i]) {
			cnt++;
		
		}
		
		
	
	}
	System.out.println(cnt);
		
	}

}
