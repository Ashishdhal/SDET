package DailyCall;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

public class anagram {
	@Test
	public void test() {
		boolean anagram = isAnagram("testleaf", "leafrtey");
		Assert.assertEquals(anagram, false);
		
	}
	
	@Test
	public void test1() {
		boolean anagram = isAnagram("anagram", "nagaram");
		Assert.assertEquals(anagram, true);
		
	}
	
	@Test
	public void test2() {
		boolean anagram = isAnagram("rat", "car");
		Assert.assertEquals(anagram, false);
		
	}
	 public boolean isAnagram(String s, String t) {
		 
		Map<Character, Integer> mapS=new HashMap<Character, Integer>();
		Map<Character, Integer> mapT=new HashMap<Character, Integer>();
		
		if(s.length()==t.length()) {
			
			for (int i = 0; i < s.length(); i++) {
				
				if(mapS.containsKey(s.charAt(i))) {
					
					mapS.put(s.charAt(i), mapS.get(s.charAt(i))+1);
				
				}
				else {
					mapS.put(s.charAt(i), 1);
					}
				
				if(mapT.containsKey(t.charAt(i))) {
					mapT.put(t.charAt(i), mapT.get(t.charAt(i))+1);
					
					}
					else {
						mapT.put(t.charAt(i), 1);
						}
				
			}
			
			
			
			
		}
	
					 
	
		return mapS.equals(mapT);
		 
	        
	    }

}
