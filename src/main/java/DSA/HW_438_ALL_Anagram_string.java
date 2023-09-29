package DSA;

import java.util.ArrayList;
import java.util.Arrays;

//1. find the length of p
//1.1: Initialize an empty list of lenght s
//2. Initialize startIndex=0
//2.1: Iterate using a while loop where sIndex should be less than or equal to s-p
//3. check if the window contains p,
//3.1: if present store the first index in list ls
//3. slide the window till startIndex is less than or equal to length of s-p
//4. return the list ls


import java.util.List;

import org.junit.Test;

public class HW_438_ALL_Anagram_string {
	@Test
	public void test() {
		
		List<Integer> findAnagrams = findAnagrams("cbaebabacd", "abc");
		System.out.println(findAnagrams);
	}
	@Test
	public void test1() {
		
		List<Integer> findAnagrams = findAnagrams("abab", "ab");
		System.out.println(findAnagrams);
	}
	
public List<Integer> findAnagrams(String s, String p) {
	
	char[] pArray = p.toCharArray();
	
	int lengthP = p.length();
	List<Integer> ls=new ArrayList<Integer>(lengthP);
	int sIndex=0;
			
			//eIndex=sIndex+p.length()-1;
	
	
	
	while(sIndex<=(s.length()-lengthP)) {//abab
		 
		String substr = s.substring(sIndex, sIndex+lengthP);
		//for (int i = 0; i < substr.length(); i++) {
			
			
			char[] charArray = substr.toCharArray();
			Arrays.sort(charArray);
			Arrays.sort(pArray);
//			for (int j = 0; j < charArray.length; j++) {
//				System.out.println(charArray[j]);
//			}
			//System.out.println(charArray.toString());
			if(Arrays.equals(charArray, pArray)) {
				ls.add(sIndex);
			}
			
			sIndex++;
			
	//	}
		
		
		
	}
	
	return ls;
     	
    }

}
