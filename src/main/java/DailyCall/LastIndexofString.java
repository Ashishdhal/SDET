package DailyCall;
//https://leetcode.com/problems/length-of-last-word/
//1. I/p: String
//2. O/p: String
//2.1. s.trim()
//3. array of strings split()
//4. return Last index of string  

import org.junit.Test;

public class LastIndexofString {
	int length;
	@Test
	public void test() {
		int lengthOfLastWord = lengthOfLastWord("Hello World");
		System.out.println(lengthOfLastWord);
	}
	
public int lengthOfLastWord(String s) {
	String s2;
	
	String s1 = s.trim();
	String[] split = s1.split(" ");
	for (int i = split.length-1; i >=0; i--) {
		s2=split[i];
		System.out.println(s2);
		int length=s2.length();
		System.out.println(length);
		return length;
	//	break;
		
	}
	
	return 0;
        
    }

}
