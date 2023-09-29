package DSA;

import java.util.Iterator;

import org.junit.Test;

public class DSA_CLASS_SUM_K_CONSUCATIVE {
	
	@Test
	public void test() {
		FindResult(new int[] {1,5,2,3,7,1});
		
	}
public int FindResult(int[] a) {
	int temp=0;
	int sum=0;
	
	for (int i = 0; i < a.length; i++) {
		
		for (int j = 0; j < i+2; j++) {
			
			sum=a[i]+a[j]+a[j+1];
			
			if(sum>temp) {
				return sum;
			}
			else 
			{
				return temp;
			}
			//temp=sum;
		}
	}
	
	
	
	return 0;
	
	
}
}
