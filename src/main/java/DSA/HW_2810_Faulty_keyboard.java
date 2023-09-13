package DSA;

import org.junit.Test;

import junit.framework.Assert;

/*0. String str ={};
1. String s to charArray ch
2. Iterate ch using loop
3. if ch index value is equal to 'i', reverse the string str 
4. else apend str*/
public class HW_2810_Faulty_keyboard {
	@Test
	public void test() {
		String finalString = finalString("String");
		System.out.println(finalString);
		Assert.assertEquals(finalString, "rtSng");
	}
public String finalString(String s) {
	
	String str= "";
	StringBuilder sb=new StringBuilder(str);
	char[] charArr = s.toCharArray();
	for (int i = 0; i < charArr.length; i++) {
		if(charArr[i]=='i') {
		//sb.append(charArr[i]);
		sb.reverse();	
		}
		else
		{
		sb.append(charArr[i]);
			
		}
		
	}
	
	
	
	return sb.toString();
        
    }

}
