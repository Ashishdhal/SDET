package DailyCall;

import java.util.Arrays;

//"Given an char array as char[] arr ={'a','b','c',d','s','t','u',v'} based on ascii valures return an array the last 4 highest values.
//O/p : {'v','u','t','s'}"

//Psudeo Code
//1. i/p=char array , o/p=char array

public class LastFourHighest {
	public static void main(String[] args) {
		String s="";
		char[] arr ={'a','b','c','d','s','t','u','v'};
		char[] arr2=new char[4];
		Arrays.sort(arr);
//		for (char c : arr) {
//			System.out.println(c);		
//		}
		for (int i = arr.length-1; i >= arr.length-4; i--) {
//			for (int j = 0; j < arr2.length; j++) {
//				
//				arr2[j]=arr[i];
//			}
//			
			s=s+arr[i];
		}
		
//		for (char c : arr2) {
//			System.out.println(c);
//		}
		System.out.println(s);
		char[] charArray = s.toCharArray();
		System.out.println(charArray);
		for (char c : charArray) {
			System.out.println(c);
		}
		
	}

}
