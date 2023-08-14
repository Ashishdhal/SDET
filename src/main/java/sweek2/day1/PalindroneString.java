package sweek2.day1;

public class PalindroneString {
	
	public static void main(String[] args) {
		
		
		
	String s="A man, a plan, a canal: Panama";
	String s1;
	
     s = s.replaceAll( "[^a-zA-Z0-9]", "");
    // System.out.println(s);
	String lowerCase = s.toLowerCase();
	System.out.println(lowerCase);
	char[] ch=new char[lowerCase.length()];
	
	char[] charArray = lowerCase.toCharArray();
	
	for (int i = charArray.length-1; i >=0; i--) {

		ch[i]=charArray[i];
		
	}
//	for (char c : ch) {
//		System.out.print(c);
//	}
	
	String valueOf = String.valueOf(ch);
	System.out.println(valueOf);
	
	if(lowerCase.equals(valueOf)) {
		
		System.out.println("Palindrome!!!");
	}
	
	
	}
}
