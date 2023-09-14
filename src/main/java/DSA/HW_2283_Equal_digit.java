package DSA;

import java.util.Iterator;

import org.junit.Test;

import junit.framework.Assert;



/*1210
 * 0->1210-> 1
 * 1->1210 ->2
 * 2->1210->1
 * 3->1210->0
 * 
 * */

public class HW_2283_Equal_digit {
	
@Test
public void test() {
	
	boolean digitCount = digitCount("1210");
	Assert.assertEquals(digitCount, true);
}
	
public boolean digitCount(String num) {  //1210
	int cnt=0;
	String s="";
	
	//int parseInt = Integer.parseInt(num);
	char[] charArr = num.toCharArray();
	for (int i = 0; i < charArr.length; i++) {
		
		
		for (int j = 0; j < charArr.length; j++) {
	
		char ch=charArr[j];//1
		int num1 = Character.getNumericValue(ch); //1
		
		if(i==num1) {//0==1
			cnt++;
	
		}
		
		//s=s+cnt;
	}
		s=s+cnt;
		cnt=0;
	}
	System.out.println(s);
	return s.equals(num);
     
	
	
    }

}
