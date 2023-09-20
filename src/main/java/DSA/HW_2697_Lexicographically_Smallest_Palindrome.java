package DSA;

//1. initialize 2 pointer one at 0 index and another at legth-1
//2. Initialise a string builder and pass the string s
//3. Iterate usibg a for loop with condition left<right
//4. check codition if left and right index value is same, make it same on the left index value
//5. convert the SB to string and returr it

import org.junit.Test;

import junit.framework.Assert;

public class HW_2697_Lexicographically_Smallest_Palindrome {

	@Test
	public void test1() {

		String makeSmallestPalindrome = makeSmallestPalindrome("egcfe");
		System.out.println(makeSmallestPalindrome);
		Assert.assertEquals("efcfe", makeSmallestPalindrome);
	}

	@Test
	public void test2() {

		String makeSmallestPalindrome = makeSmallestPalindrome("seven");
		System.out.println(makeSmallestPalindrome);
		Assert.assertEquals("neven", makeSmallestPalindrome);
	}

	@Test
	public void test3() {

		String makeSmallestPalindrome = makeSmallestPalindrome("abcd");
		System.out.println(makeSmallestPalindrome);
		Assert.assertEquals("abba", makeSmallestPalindrome);
	}
	@Test
	public void test4() {

		String makeSmallestPalindrome = makeSmallestPalindrome("esha");
		System.out.println(makeSmallestPalindrome);
		Assert.assertEquals("ahha", makeSmallestPalindrome);
	}
	public String makeSmallestPalindrome(String s) {
		int left = 0;
		int right = s.length() - 1;
		StringBuilder sb = new StringBuilder(s);
		while (left < right) {
			if (s.charAt(left) != s.charAt(right))   {
				if(s.charAt(left) > s.charAt(right)) {
				
				sb.deleteCharAt(left);
				sb.insert(left, s.charAt(right));
				left++;
				right--;
			}
				else {
					sb.deleteCharAt(right);
					sb.insert(right, s.charAt(left));
					left++;
					right--;
				}
				
			}
//			if (s.charAt(left) != s.charAt(right) && s.charAt(left) < s.charAt(right)) {
//				sb.deleteCharAt(right);
//				sb.insert(right, s.charAt(left));
//				left++;
//				right--;
//			}

			else {
				left++;
				right--;

			}

		}

		return sb.toString();

	}
}
