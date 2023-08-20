package DSA;

import java.util.Arrays;

public class ArrayMemoryQuestion {
	public static void main(String[] args) {
		
		 int[] primaryArray = {1,2,3};
	        int[] secondaryArray = primaryArray;
	        secondaryArray[2] = 5;
	        System.out.println(Arrays.toString(primaryArray));
	        System.out.println(Arrays.toString(secondaryArray));
	        
	        
	        System.out.println(primaryArray);
	        System.out.println(secondaryArray);

	        
	}

}
