package homework.week1;

public class AddDigit {
	public static void main(String[] args) {
		
//		Input: num = 38
//				Output: 2
//				Explanation: The process is
//				38 --> 3 + 8 --> 11
//				11 --> 1 + 1 --> 2 
//				Since 2 has only one digit, return it.
		int num=38;
		int unitPlace;
		int tensPlace;
		int sum=0;
		
	//	if(num>9)
		while(num>9) {
			unitPlace=num%10;
			tensPlace=num/10;
			
			sum=unitPlace+tensPlace;
			num=sum;
			
			 
		}
		System.out.println(num);
		
	}

}
