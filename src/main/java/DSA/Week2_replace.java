package DSA;
/*Given a valid IP address, return a defanged version of that IP address.
A defanged IP address replaces every period "." with "[.]".
Do Not Use the replaceAll()
Example 1:
Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"*/



public class Week2_replace {
	
public static void main(String[] args) {
	
	//String replacedString="";
	
	String str="1.1.1.1";
	String str1="";
	
	  for (int i = 0; i < str.length(); i++) {
	  
	  if(str.charAt(i)=='.') 
	  { 
		  
		 //replacedString = str.replace(".", "[.]");
		 // str1=str+"[.]";
		  
	  
	  } 
	  System.out.println(str);
	 
	
	
	}
}
}
	
	


