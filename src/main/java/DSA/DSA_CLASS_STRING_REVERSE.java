package DSA;

public class DSA_CLASS_STRING_REVERSE {

	public static void main(String[] args) {
		
		
		String str="Ashish";
		StringBuilder sb= new StringBuilder(str);
		sb.reverse();
		str=sb.toString();
		System.out.println(str);
	}
	
	
}
