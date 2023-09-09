package DailyCall;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

public class Pangram {
	@Test
	public void test() {
		
		boolean checkIfPangram = checkIfPangram("abcdefghijklmnopqrstuvwxyz");
		Assert.assertEquals(checkIfPangram, true);
	}
	
public boolean checkIfPangram(String sentence) {
	Map<Character, Integer> charMap=new HashMap<Character, Integer>();

	char[] charArr = sentence.toCharArray();
	for (int i = 0; i < charArr.length; i++) {
		
		
	}
	
	return false;
        
    }

}
