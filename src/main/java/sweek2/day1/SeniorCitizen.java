package sweek2.day1;

public class SeniorCitizen {
	
	public static void main(String[] args) {
		
	int cnt=0;
	String[] s= {"7868190130M7522","5303914400F9211","9273338290F4010"};
	
	for (int i = 0; i < s.length; i++) {
		
		String substring = s[i].substring(11, 13);
		Integer valueOf = Integer.valueOf(substring);
		System.out.println(valueOf);
		if(valueOf>60) {
			
			cnt++;
			
		}
		
		//if()
	}
	System.out.println(cnt);
//	CharSequence subSequence = s.subSequence(1, 3);
	//String substring = s.substring(1, 3);
	}
}
