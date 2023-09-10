package DSA;

import java.util.Iterator;

import org.junit.Test;

import com.jayway.jsonpath.internal.function.text.Length;

import junit.framework.Assert;


/*0. create an empty int array arr of size sentences
1. Iterate the sentence array using loop
2. for each index, find the word count(Spilt()---> find size)
3. store count in the array index
4. sort arr and return the last index value */
public class HW_2114_max_word {
	
	@Test
	public void test() {
		
		int mostWordsFound = mostWordsFound(new String[] {"alice and bob love leetcode", "i think so too", "this is great thanks very much"});
		System.out.println(mostWordsFound);
		
		Assert.assertEquals(mostWordsFound, 6);
	}
	 public int mostWordsFound(String[] sentences) {
		 int[] a=new int[sentences.length];
		// int cnt=0;
		 for (int i = 0; i < sentences.length; i++) {
			 String[] split = sentences[i].split(" ");
			 int len = split.length;
			 a[i]=len;
			 
			
		}
		// for
		 
		return a[a.length-1];
	        
	    }

}
