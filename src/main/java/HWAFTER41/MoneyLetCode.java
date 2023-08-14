package HWAFTER41;

import org.junit.Test;

import junit.framework.Assert;

public class MoneyLetCode {
	@Test
	public void test()
	{
		int totalMoney = totalMoney(20);
		System.out.println(totalMoney);
		Assert.assertEquals(96, totalMoney);
	}
	 public int totalMoney(int n) {
		 int sum=0;
		 int j=1;
		 int n1;
		 for (int i = 1; i <=n; i++,j++) {
			 
			 if(i%8==0) {//i=1
				 n1=i/7;//n1=1
				 j=n1+1;//j=2
				 sum=sum+j;//2
			 }else
			 {
				 sum=sum+j;//
			 }
			
		}
		return sum;
	        
	    }

}
