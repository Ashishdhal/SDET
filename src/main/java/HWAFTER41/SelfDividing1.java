package HWAFTER41;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class SelfDividing1 {
	
	
public static void main(String[] args) {
	int[] arr= new int[30];
	int left=1;
	int right=22;
	int tens;
	int units;
	for (int i = left; i <=right; i++) {
		for (int j = 0; j <arr.length ; j++) {
			if(i<10) {
				arr[i]=i;
			}
			else if((i>=10)&&(i<=99)) {
				tens=i%10;
				units=i/10;
				if((i%tens==0)&&(i%units==0)) {
					arr[j]=i;
				}
			}
			
		}
		for (int k : arr) {
			System.out.println(k);
		}
		
	}
}

}
