package DSA;

import org.junit.Test;

//p.code: 
//1. initialize 2 pointers left and right
//2. Iterate using loop and check for condition left<right
//3. use a temp variable and reverse the index value
//4. return the reverse array 
public class DailyCall_344 {
	
	@Test
	public void test() {
		reverseString(new char[] {'h','e','l','l','o'});
		
	}
	
	 public void reverseString(char[] strings) {
		 
		 int left=0;
		 char temp;
		 int right=strings.length-1;
		 while(left<right) {
		temp=strings[left];
		strings[left]=strings[right];
		strings[right]=temp;
		left++;
		right--;
		 }
		 
		 for (int i = 0; i < strings.length; i++) {
			
		
		 System.out.println(strings[i]);
		 
	        
	    }

}
}
