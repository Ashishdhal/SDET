package homework.week1;

import org.junit.Test;

/*
 * n should be even
 * n/2 can eat
 * different kind of candy can eat?
 * 
 */
public class Candies {
	int cnt=1;
	
	@Test
	public void test() {
		
		int candy = candy(new int[] {1,1,2,2,3,3,4,4,5});
		System.out.println(candy);
//		Assert.
		}
	
	public int candy(int[] c) {
		int length = c.length;
		for (int i = 0; i < length; i++) {
//			if(length%2!=0) {
//				break;
//			}
//			else {
			//	for (int j = i+1; j < c.length; j++) {
					if((c[i]!=c[i+1]) ){
						cnt++;
						System.out.println(cnt);
						
					}
					
//				}
		//	}
			
		}
		System.out.println(cnt);
		return cnt;
		
		
	}

}
