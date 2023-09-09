package HWAFTER41;

import java.util.HashMap;

import org.junit.Test;

import junit.framework.Assert;

public class HW_2325_DECODE {
	@Test
	public void test() {
		
		
		String decodeMessage = decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv");
		System.out.println(decodeMessage);
		Assert.assertEquals(decodeMessage, "this is a secret");
		
	
	}
	 public String decodeMessage(String key, String message) {
		 String newKey = key.replaceAll(" ", "");
		 String decode="";
		 //System.out.println(newKey);
		 HashMap<Character, Character> mapA=new HashMap<Character, Character>();
		 char ch='a';
		 
			 
		 
		 for (int i = 0; i < newKey.length(); i++) {
			 
			 if(!mapA.containsKey(newKey.charAt(i))) {
			 System.out.println("char .."+newKey.charAt(i));
			 mapA.put(newKey.charAt(i),ch++);
			 //System.out.println(mapA);
		  
		 }
		 }
		 for (int i = 0; i < message.length(); i++) {
			 
			if(mapA.containsKey(message.charAt(i))) {
				
				Character ch1 = mapA.get(message.charAt(i));
				decode=decode+ch1;
					
				}
		
			 else {
				 decode=decode+message.charAt(i);
			 }
		 
		 
		 
		// System.out.println(mapA);
		
		//return decode;
	        
	    }
		return decode;

}
}
