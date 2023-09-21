package DSA;
//0. Initialize counter =0
//1. initialize 2 pointers, 
//sIndexG=0, sIndexS=0
//2. sort both the arrays g,s
//3. when the sIndex<s.length && eIndex<g.length, start comparing the index value of g and s arrays
//3.1: when sIndexG=0, check if the s array is having indices value greater than or equal to g index value, if yes increament count, remove the s index value 
//4. return counter 


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
