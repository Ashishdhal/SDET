package DSA;

import java.util.ArrayList;
import java.util.Arrays;
/*p.code:
0. Initialize a empty boolean list
1. Iterate the candies array using loop
2. Find the greatest number in the array
3. Compare each index value+extraCandies with the greatest number
4. If index value is greater, return true else return false
5. Store the boolean value in the boolean List
6. return the boolean list*/
//import java.util.List;
import java.util.List;

import org.junit.Test;

public class Daily_1431_gretestCandies {
	
	@Test
	public void test() {
		
		List<Boolean> kidsWithCandies = kidsWithCandies(new int[] {2,3,5,1,3}, 3);
		System.out.println(kidsWithCandies);
	}
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		//boolean[] arr=new boolean[candies.length];
		List<Boolean> ls=new ArrayList<Boolean>();
		
		/*
		 * Arrays.sort(candies); int gretestValue=candies[candies.length-1];
		 */
		
		
		for (int i = 0; i < ls.size(); i++) {
			
			//arr[i]=(candies[i]+extraCandies)>=gretestValue;
			
			//candies[i]+extraCandies)>=gretestValue)
			ls.add((candies[i]+extraCandies)>=gretestValue)	;
				
			{
				
			}
		}
		
		return arr;
        
    }

}
