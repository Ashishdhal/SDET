package DSA;

import java.util.Iterator;

public class week2Day1Problem2 {
	
	/*
	 * Write a program to remove vowels from a String 
	 *  Example: Input: "Hi testleaf students" 
	 * Output: "H tstlf students"
	 */

	/*
	 * i/p: String o/p: String
	 * 
	 * test data : "Ashish" ; "shsh" 
	 * "lkjh" :"lkjh"
	 * "Ashish" : "shsh"
	 */
			
		/*
		 * p.code 0. Initialize output string .
		 *  1. Iterate using the for loop. 2. put
		 * condition to check for vowels . 
		 * 3. if satisfied, replace it with "".
		 *  4. else
		 * no change in the output string.
		 */
			
	public static void main(String[] args) {
		String old="AEIOU";
		
		StringBuilder sb= new StringBuilder(old) ;
		
		for (int i = 0; i < old.length(); i++) {
			char ch = old.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				
				//old.replace(ch, '\0' );
				sb.deleteCharAt(i);
				
			}
			//System.out.println(old);
		}
	//	old=sb.toString();
		System.out.println(sb.toString());
		//System.out.println(sb.toString());
		
		
		
	}

}
