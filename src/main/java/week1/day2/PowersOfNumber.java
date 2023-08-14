package week1.day2;

import org.junit.Test;

public class PowersOfNumber {
	
	
	@Test
	public void test() {
		
		boolean power = isPower(16);
		System.err.println(power);
		
	}
	public boolean isPower(int var) {
		
//		while(var/2) {
//		
//		if(var%2==0) {
//			
//			return true;
//		}
//		
//		else if(var==1) {
//			
//			return true;
//		}
//			
//			else
//			{
//				return false;
//			}
//				
//		}
//	}

		while(var%2==0) {
			var=var/2;
			
		}
////		if(var==1) {
////			return true;
////		}
////		else {
////			return false;
////			
//			
//		}
		return var==1;
		
	}
		
}
