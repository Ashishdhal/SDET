package DSA;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

public class HW_1876_SUBSTRING_3_DISTINCT {
	@Test
	public void test() {
		int countGoodSubstrings = countGoodSubstrings("xyzzaz");// xyz,yzz
		
		System.out.println(countGoodSubstrings);
		Assert.assertEquals(countGoodSubstrings, 1);

	}
	@Test
	public void test() {
		int countGoodSubstrings = countGoodSubstrings("aababcabc");// 
		
		System.out.println(countGoodSubstrings);
		Assert.assertEquals(countGoodSubstrings, 4);

	}

	public int countGoodSubstrings(String s) {

		int sIndex = 0;
		int count=0;
		int eIndex = 0;
		Set<Character> chSet = new HashSet<Character>(3);

		for (int i = 0; i < s.length(); i++) {

			while (sIndex < s.length() && eIndex < s.length()) {
				char ch = s.charAt(eIndex);
				if (chSet.contains(s.charAt(eIndex))) {
					chSet.remove(s.charAt(sIndex));
					sIndex++;
				//	eIndex++;
				//	chSet.add(ch);
				}
				chSet.add(ch);
				if (chSet.size() == 3) {
                count++;
	             
	              //  chSet.remove(s.charAt(sIndex+1));
                chSet.remove(s.charAt(sIndex));
	                sIndex++;
	            }
			eIndex++;
			}
			
		}

		return count;

	}

}
