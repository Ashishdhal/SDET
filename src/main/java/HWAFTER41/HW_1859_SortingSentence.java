package HWAFTER41;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class HW_1859_SortingSentence {
	@Test
	public void test() {
		String sortSentence = sortSentence("is2 sentence4 This1 a3");
		//System.out.println(sortSentence);
		Assert.assertEquals(sortSentence,"This is a sentence");
	}
	
	 public String sortSentence(String s) {
		 StringBuilder sb=new StringBuilder(s);
		  String[] splitSentence = s.split(" ");
		
		 for (int i = 0; i < splitSentence.length; i++) {
			 /*char[] chArray = splitSentence[0].toCharArray();
			 
			 for (int j = 0; j < chArray.length; j++) {
				 char temp;
				 chArray[chArray.length-1]=chArray[j];
				 */
		//	 StringBuilder sb=new StringBuilder(splitSentence[i]);	 
			splitSentence[i] =sb.reverse();
			 //System.out.println(reverse);
				
			}
			
		
	 
	 
		// Arrays.sort(splitSentence);
		// Arrays.sort(splitSentence);
		// Arrays.sort(splitSentence);
		 
		 for (String string : splitSentence) {
			 System.out.println(string);
			 
		}
		 
		return s;
		 
	        
	    }

}
