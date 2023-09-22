package DSA;

import org.junit.Test;

import junit.framework.Assert;

//1. initialize 2 pointers sIndex=0, eIndex=2
//2. Iterate using a while loop with condition sIndex<s.length() && eIndex<s/length
//3. fetch the substring 
//4. check if the string has a,b,c 
//5. if a,b and c is present in the string, increament the count
//6. return count 
public class HW_1358_AllChar {
//	@Test
//	public void test() {
//		int numberOfSubstrings = numberOfSubstrings("abcabc");
//		System.out.println(numberOfSubstrings);
//		Assert.assertEquals(numberOfSubstrings, 10);
//		
//	}
	
	@Test
	public void test1() {
		int numberOfSubstrings = numberOfSubstrings("aaacb ");
		System.out.println(numberOfSubstrings);
		Assert.assertEquals(numberOfSubstrings, 3);
		
	}
	
	 public int numberOfSubstrings(String s) {//"aaacb"
		 
		 int sIndex=0;
		 int eIndex=2;
		 int count=0;
		 while(sIndex<s.length()&&eIndex<s.length()) {
			// CharSequence subSequence = s.subSequence(sIndex, eindex);
			 String str = s.substring(sIndex, eIndex+1);
			if(str.indexOf('a')!=-1&& str.indexOf('b')!=-1 &&str.indexOf('c')!=-1) {
				count++;
				eIndex++;
				
			}
		
			 
			//sIndex++;
			
			if(eIndex==s.length()) {
				sIndex++;
				eIndex=sIndex+2;
			}
			
			if(eIndex!=s.length()) {
				
		
				eIndex=sIndex++;
			}
			
		 
//		 sIndex++;
//		 eIndex=sIndex+2;
//		 while(eIndex==s.length()) {
//			 	
//			 	
//			 	String str = s.substring(sIndex, eIndex+1);
//				if(str.indexOf('a')!=-1&& str.indexOf('b')!=-1 &&str.indexOf('c')!=-1) {
//					count++;
//					eIndex++;
//				
//				
//			 }
//		 
		
	        
	    }
		 return count;
}
}
