package homework.week1;

import org.junit.Test;

import junit.framework.Assert;

public class Palindrome {
	
	int hundredNum;
	int tenNum;
	int unitnum;
	int newNum;
	
	@Test
	public void test() {
		int palindrome = isPalindrome(12121);
		Assert.assertEquals(12121, palindrome);
	//	Assert.
		
	}
	
	public int isPalindrome(int num) { //121
		
		hundredNum=num/100;
		num=num%100;// 21
		tenNum=num/10;//2
		unitnum=num%10;
		newNum=hundredNum*100+tenNum*10+unitnum;
		System.out.println(newNum);
		return newNum;
		
		
	}

}
