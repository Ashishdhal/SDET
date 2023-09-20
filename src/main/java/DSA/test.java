package DSA;

public class test {

	
	public static void main(String[] args) {
		
		
		int a= Integer.MAX_VALUE;
		int b= Integer.MAX_VALUE;
		
		int sum=a+b;
		//System.out.println(sum);
		
		String s="ABCD";
		char ch = s.charAt(1);
		ch='a';
		//System.out.println(s);
		StringBuilder sb= new StringBuilder(s);
		sb.deleteCharAt(1);
	sb.insert(1, 'z');
	System.out.println(sb);
	
		
	}
}
