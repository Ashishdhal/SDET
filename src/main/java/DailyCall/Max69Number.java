package DailyCall;

import org.junit.Test;

import junit.framework.Assert;

public class Max69Number {
	
	@Test
	public void test() {
		int maximum69Number = maximum69Number(9669);
		System.out.println(maximum69Number);
		Assert.assertEquals(maximum69Number, 9969);
	}
	
	public int maximum69Number (int num) {
	String str = String.valueOf(num);
	//System.out.println(str);
	char[] charArray = str.toCharArray();
	for (int i = 0; i < charArray.length; i++) {
		
		if(charArray[i]=='6') {
			charArray[i]='9';
			break;
		}
		
	}
	
	String str1 = String.valueOf(charArray);
	Integer intValue = Integer.valueOf(str1);
	return intValue;

        
    }

}
