package DSA;

import org.junit.Test;

import junit.framework.Assert;

public class HW_2744_String_pair {
	
@Test
public void test() {
	int val = maximumNumberOfStringPairs(new String[] {"cd","ac","dc","ca","zz"});
	System.out.println(val);
	Assert.assertEquals(val, 2);
	
}
	
	
public int maximumNumberOfStringPairs(String[] words) {
	
	int cnt=0;
	for (int i = 0; i < words.length; i++) {
		
		StringBuilder sb=new StringBuilder(words[i]);
		sb.reverse();
		String str = sb.toString();
		for (int j = i+1; j < words.length; j++) {
			if(str.equals(words[j])) {
				
				cnt++;
			}
			
		}
		
		//words[i]
		
	}
	
	
	
	return cnt;
        
    }

}
