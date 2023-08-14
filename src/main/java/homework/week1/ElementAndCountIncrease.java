package homework.week1;

public class ElementAndCountIncrease {
	
	
	public static void main(String[] args) {
		int cnt=0;
		int n=0;
	    int[]a= {1, 1, 2}; //4
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				
				if((a[i]+1)==a[j]){
					cnt++;
					
					//System.out.println(cnt);
				}
				
				
			}
			//System.out.println(cnt);	
		}
		System.out.println(cnt);
	}

}
