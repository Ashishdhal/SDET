package Hwork2;

public class Plusone4 {
//	Input: digits = [1,2,3]
//			Output: [1,2,4]
//			Explanation: The array represents the integer 123.
//			Incrementing by one gives 123 + 1 = 124.
//			Thus, the result should be [1,2,4].
	
	public static void main(String[] args) {
		int[] a= {1,2,3};
		int[] b= new int[3];
		int res=0;
		for (int i = 0; i < a.length; i++) {
		res=res*10+a[i];
		
		}
		res++;
		System.out.println(res);
		String num  = Integer.toString(res);
		System.out.println(num);
		
		for (int i = 0; i < num.length(); i++) {
			int numericValue = Character.getNumericValue(num.charAt(i));
			b[i]= numericValue;
		}  
		
		for (int i : b) {
			System.out.println(i);
		}
}

}
