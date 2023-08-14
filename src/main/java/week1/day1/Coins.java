package week1.day1;

import java.util.Iterator;

import org.junit.Test;

public class Coins {

			
@Test
public void count() {
	
	int cnt=0;
	int n=10;
	int i;
	for ( i = 1; i<=n; i++) {
		n=n-i;
		cnt++;
		
	}
	System.out.println(cnt);
		
}	

}
