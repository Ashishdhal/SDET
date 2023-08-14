package sweek2.day1;

import org.junit.Test;

import junit.framework.Assert;

public class CHECKaBEFOREb {
	
//	Input: String str
//	Output: boolean 
//	Condition last index of a and 1st index of b ? true : false
	
	@Test
	public void test() {
		Assert.assertEquals(false, false);
		
		
	}

	public boolean find(String s) {
		String s="aaabbb";
		int lastIndexOf = s.lastIndexOf('a');
		System.out.println(lastIndexOf);
		
		int indexOf = s.indexOf('b');
		System.out.println(indexOf);
		
//		if(indexOf>lastIndexOf) {
//			return true;
//		}
//		else 
//			return false;
		
		return indexOf>lastIndexOf;
		
	}
	
	
	
}
