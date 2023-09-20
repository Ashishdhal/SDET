package DSA;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

//import junit.framework.Assert;

public class HW_455_Assign_Cookies {
	
	@Test
	public void test1() {
		int findContentChildren = findContentChildren(new int[] {1,2,3}, new int[] {1,1});
		Assert.assertEquals(findContentChildren, 1);
	}
	
	public int findContentChildren(int[] g, int[] s) {
		Arrays.sort(s);
		Arrays.sort(g);
		int cnt=0;
		int sIndexG=0;
		int sIndexS=0;
		
		while(sIndexG<g.length && sIndexS<s.length) {
			
			if(s[sIndexS]>=g[sIndexG]) {
				
				cnt++;
				sIndexS++;
				sIndexG++;
			}
			//sIndexG++;
			else
				
			{
				sIndexS++;
			}
			

			
			
		}
		
		
		
		return cnt;
		
		
	    
    }

}
