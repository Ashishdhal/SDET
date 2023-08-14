package Hwork2;

import org.junit.Test;

import junit.framework.Assert;

//Input: jewels = "aA", stones = "aAAbbbb"
//Output: 3



//I/P: String jewels  and String stones
//o/p: Int
//
//initialize cnt=0;
//loop starting from i=0 till stones.lenth()
//substring of stones : substring(i, i+1)
//jewels.contains(substring(i, i+1))
//
//cnt++;
//
//return cnt; 
//
//----------------------

public class JewelsAndStone {
	int cnt=0;
	
@Test
public void test() {
	int numJewelsInStones = numJewelsInStones("aA","aAAbbbb");
	Assert.assertEquals(3, numJewelsInStones);
}
	public int numJewelsInStones(String jewels, String stones) {
		
		for (int i = 0; i < stones.length(); i++) {
			String sub = stones.substring(i,i+1);
			if(jewels.contains(sub)) {
				cnt++;
			}
		
		}
		System.out.println(cnt);
		return cnt;
		
		
		
	}
}
