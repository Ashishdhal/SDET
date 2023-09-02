package DailyCall;
///https://leetcode.com/problems/merge-strings-alternately/

import org.junit.Test;

import junit.framework.Assert;

/*p.code:
1. Initialize new string s1
1.1: find length of word1
2. Iterate using for loop till length of word1
3. now apend ch of word1 and word 2 in a new string finalString
4. apend  final string with rest of ch of word2*/

public class MergeStringAlternatively {
	
		@Test
		public void test1() {
			String str = mergeAlternately("abcd", "pq");
			System.out.println(str);
			Assert.assertEquals(str, "apbqcd");
		}
	
	public String mergeAlternately(String word1, String word2) { 
	String mergeString="";
	int lengthWord1=word1.length();
	
	if(word1.length()<word2.length()) {
	String substringWord2 = word2.substring(0, lengthWord1+1);
	}
	
	
	//System.out.println(substringWord2);
	for (int i = 0; i < word1.length(); i++) {
		
		mergeString=mergeString+word1.charAt(i);
		mergeString=mergeString+word2.charAt(i);
	}
	
	if(word1.length()>word2.length()) {
		
		mergeString=mergeString+word1.substring(lengthWord1, word1.length());
	}
	
	System.out.println(mergeString);
	mergeString=mergeString+word2.substring(word2.length(), word2.length());
	//System.out.println(mergeString);
	
	
	return mergeString;
        
    }

}

