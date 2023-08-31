package DailyCall;
//https://leetcode.com/problems/reverse-prefix-of-word/submissions/
import org.junit.Test;

import junit.framework.Assert;

/*psuedo code:
1. Covert the word string to char array
2. Iterate the char array using for loop and seach the ch given
3. once the ch found, stor the index in an int variable lastIndex
4. now iterate the String word from index 0 to lastIndex and reverse string and store it in a new String.
5. Now apend the new string to rest of the index */

public class ReversePrefixOfWord {
	@Test
	public void test1() {
		String reversePrefix = reversePrefix("abcdefd", 'd');
		System.out.println(reversePrefix);
		Assert.assertEquals(reversePrefix, "dcbaefd");
	}
	
	public void test2() {
		String reversePrefix = reversePrefix("abcd", 'z');
		System.out.println(reversePrefix);
		Assert.assertEquals(reversePrefix, "abcd");
	}
	 public String reversePrefix(String word, char ch) {
		 int chIndex=0;
		 String newString="";
		 
		 for (int i = 0; i < word.length(); i++) {
			 
			if( word.charAt(i)==ch) {
				
				chIndex=i;
				break;	
			}
			else {
				return word;
			}
			
			
		}
		 String prefixWord = word.substring(0, chIndex+1);
		 System.out.println(prefixWord);
		 StringBuilder sb=new StringBuilder(prefixWord);
		 StringBuilder reversePrefix = sb.reverse();
		 System.out.println(reversePrefix);
		 newString=reversePrefix+word.substring(chIndex+1, word.length());
		 
		 
		 
		return newString;
	        
	    }

}
