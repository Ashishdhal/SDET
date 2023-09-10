package DSA;
/*i/p: string
o/p: string
p.code:
1. convert the s to Array of strings str unsing split(" ")
2. now based on k value fetch the str values and apend to a new string */

import java.util.Iterator;

import org.junit.Test;

import junit.framework.Assert;

public class HW_1816_TRUNCATE {
	@Test
	public void test() {
		String truncateSentence = truncateSentence("Hello how are you Contestant", 4);
		System.out.println(truncateSentence);
		Assert.assertEquals(truncateSentence, "Hello how are you");
	}
	
	public String truncateSentence(String s, int k) {
		String s1="";
		String[] split = s.split(" ");
		for (int i = 0; i < k; i++) {
			s1=s1+" "+split[i];
		
			
		}
		s1=s1.trim();
	return s1;
	
        
    }

}
