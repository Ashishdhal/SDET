package DSA;

import org.junit.Assert;
import org.junit.Test;
//import org.junit.Test;

public class Daily_2798_Employee_target {
	
	@Test
	public void test(){
		
		int numberOfEmployeesWhoMetTarget = numberOfEmployeesWhoMetTarget(new int [] {1,2,3,4,5}, 3);
		System.out.println(numberOfEmployeesWhoMetTarget);
		//Assert.assertequa
	}
	public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
	int cnt=0;
	for (int i = 0; i < hours.length; i++) {
		if(hours[i]>=target) {
			cnt++;
			
		}
		
	}
	
	return cnt;
        
    }
	
	

}
