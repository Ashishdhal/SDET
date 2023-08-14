package HWAFTER41;

import org.junit.Test;

public class DailyCallAddDigit {
	
	@Test
	public void test() {
		int addDigits = addDigits(38);
		System.out.println(addDigits);
	}
	 public int addDigits(int num) {
	        
//			int num=38;
				int unitPlace;
				int tensPlace;
				int sum=0;
				
			//	if(num>9)
				while(num>9) {
					unitPlace=num%10;
					tensPlace=num/10;
					
					sum=unitPlace+tensPlace;
					num=sum;
					
					 
				}
				//System.out.println(num);
		        return num;
				
			}


}
