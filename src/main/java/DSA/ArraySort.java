package DSA;

import java.util.Iterator;

public class ArraySort {
	public static void main(String[] args) {
		int temp=0;
		int[] a=new int[] {5,4,3,2,1};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					
					temp=a[i];
					a[j]=a[i];
					
				}
				
			}
			
		}
		
		
	}

}
