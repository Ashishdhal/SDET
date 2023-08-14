package sweek2.day1;

// https://leetcode.com/problems/shuffle-string/description/

public class StringSuffle {
	
	public static void main(String[] args) {
		
	
	String s="codeleet";
	String s2 = "";
	
	//s.split(s2, 0)
	//s.split
	int [] indices = {4,5,6,7,0,2,1,3};
	
	for (int i = 0; i < indices.length; i++) {
		
		s2=s2+ s.charAt(indices[i]);
		
	}
	System.out.println(s2);
	
	}

}
