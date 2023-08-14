package homework.week1;

import org.junit.Test;

import junit.framework.Assert;

public class SingleNumber {
	
	int singleNum;
	int cnt=0;
	
	@Test
	public void test() {
	
	int[] arr= {4,1,2,1,2};
	
	int findSingleNum = findSingleNum(arr);
	System.out.println(findSingleNum);
	Assert.assertEquals(4, findSingleNum);
		
	//	Arrays.
	}
	
 
	public int findSingleNum(int[] num) { //2,2,1
		
		for (int i = 0; i < num.length; i++) {
			
			for (int j = 0; j < num.length; j++) {
				
			//	System.out.println("num[i]"+num[i]);
				//System.out.println("num[i]"+num[j]);
				
//				if(num[i]!=num[j]) {
//					singleNum= num[i]; 
//					System.out.println(singleNum);
				
				if(num[i]!=num[j]) {
					
//					cnt++; 
//					//System.out.println(singleNum);
//					if(cnt==1) {
//						
//						singleNum= num[i];
				singleNum=num[i]	;
						
						
					//}
					
				}
				
			}
			//return singleNum;
		}
		return singleNum;
	
		
		
	}
}
