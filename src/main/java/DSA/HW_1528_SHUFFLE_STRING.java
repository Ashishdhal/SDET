package DSA;

import java.util.Arrays;
import java.util.Iterator;

import org.junit.Test;

import junit.framework.Assert;

/*p.code:
0. Initialize a new String str as null
1. Iterate using the Int array indices
2. using charAt() to find the particular index of the String and apend it to Sttring str
3. return str*/
public class HW_1528_SHUFFLE_STRING {
	@Test
	public void test() {
		String restoreString = restoreString("codeleet", new int[] {4,5,6,7,0,2,1,3});
		System.out.println(restoreString);
		Assert.assertEquals(restoreString, "leetcode");
	}
	
	public String restoreString(String s, int[] indices) {
	String str="";
	char[] ch1=new char[s.length()];
	for (int i = 0; i < indices.length; i++) {
		ch1[indices[i]] = s.charAt(i);
		
		
	}
	
	for (int i = 0; i < ch1.length; i++) {
		str=str+ch1[i];
		
	}
	
	return str;
        
    }

}
