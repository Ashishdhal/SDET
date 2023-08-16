package DailyCall;

import org.junit.Test;

import junit.framework.Assert;



public class CountDigits {
	@Test
	public void test() {
		int countDigits = countDigits(7);
		Assert.assertEquals(countDigits, 1);
	}
	
	 public int countDigits(int num) {
	        int digit=0;
	        int count=0;
	        int temp=num;
	      
	        while(num>0){

	              digit=num%10;
	              System.out.println(digit);
	              	if(temp%digit==0){
	                count++;
	                
	              	}
	            
	            num=num/10;
	            
	        }
	        System.out.println(count);
	        return count;
	        
	    }
			

}


