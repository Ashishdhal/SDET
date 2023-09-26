package DSA;
//1. Sort the g and s array
//2. intialize 2 pointers p1 and p2
//3. check loop condition where p1 amd p1 less than s length
//4. if p2 is greater than p1, increase the children count and p1 pointer
//5. return children
import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class weekend_455_24th_sept {
	
	
	@Test
	public void test1() {
		int findContentChildren = findContentChildren(new int[] {1,2,3}, new int[] {1,1});
		Assert.assertEquals(findContentChildren, 1);
	}
	@Test
	public void test2() {
		int findContentChildren = findContentChildren(new int[] {1,2}, new int[] {1,2,3});
		Assert.assertEquals(findContentChildren, 2);
	}
	
	@Test
	public void test3() {
		int findContentChildren = findContentChildren(new int[] {1,2,3,4}, new int[] {1,2,3,4});
		Assert.assertEquals(findContentChildren, 4);
	}
	
	
	
	public int findContentChildren(int[] g, int[] s) {
	    Arrays.sort(g); 
	    Arrays.sort(s); 
	    int p1 = 0; 
	    int p2 = 0;
	    int children = 0;

	    while (p1 < g.length && p2 < s.length) {
	        if (s[p2] >= g[p1]) {
	        	children++;
	            p1++;
	          //  p2++;
	        }
	        p2++;
	    }

	    return children;
	}

}
