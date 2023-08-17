package DailyCall;

import org.junit.Test;

import junit.framework.Assert;

public class max69NumApproach2 {
	String replace="";
	@Test
	public void test() {
		int maximum69Number = maximum69Number(9669);
		System.out.println(maximum69Number);
		Assert.assertEquals(maximum69Number, 9969);
	}
	
	public int maximum69Number (int num) {
	String str = String.valueOf(num);
	//System.out.println(str);
	//char[] charArray = str.toCharArray();
	for (int i = 0; i < str.length(); i++) {
		
		if(str.charAt(i)=='6') {
			
			char charAt = str.charAt(i);
			replace = str.replace(charAt, '9');
			//st
			//charAt='9';
			break;
		}
		
	}
	System.out.println(replace);
	
	//String str1 = String.valueOf(charArray);
	Integer intValue = Integer.valueOf(replace );
	System.out.println("replace.."+replace);
	return Integer.valueOf(replace);

        
    }


}
