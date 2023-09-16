package DSA;

import java.util.Arrays;
import java.util.Iterator;

public class DSA_CLASS_REVERSE_STRING_2POINTER {
	private static char[] chArray;

	public static void main(String[] args) {
		
	
	String str="Ashish";
	
	chArray = str.toCharArray();
	char temp;
	/*
	 * char ch2=chArray[chArray.length-1]; char ch1=chArray[0];
	 */
	
	int startIndex=0;
	int endIndex=chArray.length-1;
	while(startIndex<endIndex) {
		
		temp=chArray[startIndex];
		chArray[startIndex]=chArray[endIndex];
		chArray[endIndex]=temp;
		
		
		startIndex++;
		endIndex--;
		
	}
	String string = Arrays.toString(chArray);
	System.out.println(string);
	

}
}