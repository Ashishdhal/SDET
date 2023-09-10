package DSA;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class HW_2828_Acronym_of_Words {
	@Test
	public void test() {
		 List<String> ls=new ArrayList<String>();
		 ls.add("alice");
		 ls.add("bob");
		 ls.add("charlie");
		//String[] arr = { "alice", "bob", "charlie" };
		boolean acronym = isAcronym(ls, "abc");
		Assert.assertEquals(acronym, true);
	}
	
		 public boolean isAcronym(List<String> words, String s) {
			 String str="";

		       for (int i = 0; i < words.size(); i++) {
		    	   String s1 = words.get(i);
		    	   char ch = s1.charAt(0);
		    	   str=str+ch;
		    	   
				
			}
		       System.out.println(str);
		       return str.equals(s);
		        
		    }

	}


	/*
	 * public boolean isAcronym(String[] arr, String s) {
	 * 
	 * String str="";
	 * 
	 * for (int i = 0; i < arr.length; i++) 
	 * { 
	 * String wString = arr[i]; 
	 * char ch =wString.charAt(0);
	 * str=str+ch;
	 * 
	 * 
	 * }
	 * 
	 * for (int i = 0; i < arr.length; i++) {
	 * 
	 * 
	 * } System.out.println(str);
	 * 
	 * 
	 * return s.equals(str);
	 * 
	 * 
	 * 
	 * }
	 */



/*
 * //I/P- Array of strings //o/p- boolean p.code: 0. Create a new empty string
 * str 1. Iterate word array of strings using loop 2. Find the first char in the
 * strings and apend it to str 3. Now compare str with s, if equal return true
 * else false
 */