package week1.day2;

import org.junit.Test;

public class Matches {
	int match1=0;
	
	int match2=0;
	@Test
	public void test() {
		
		int mat = matchTotal(14);
		System.out.println(mat);
		
	}
		public int matchTotal(int n) {
			while(n!=1) {
				
				if(n%2==0) {
					n=n/2;
					System.out.println(n);
					match1=match1+n;
					System.out.println(match1);
				}
				else
				{
					
					match2++;
					n=n-1;
					n=n/2;
					match2=match2+n;
					
					System.out.println(match1);
				}
			}
			return match1+match2;
		}
			
			
			
		}


