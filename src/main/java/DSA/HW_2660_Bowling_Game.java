package DSA;
//p.code:
//1. initialize 2 pointers p1=0 and p2=0, sumP1=0, sump2=0
//2. traverse through player1 using pointer 1 
//3. if not 10, add the index value to sump1
//4. else , multiple the next indecies values with 2 and add to sump1
					
		


//5. repeat the step 3,4 for player2 with pointer p2
//6. sump1>sump2: return 1
//   sump1<sump2: return 2
//   sump1==sump2: return 0
import org.junit.Test;

import junit.framework.Assert;

public class HW_2660_Bowling_Game {
	@Test
	public void test() {
		int winner = isWinner(new int[] {4,10,7,9}, new int[] {6,5,2,3});
		Assert.assertEquals(winner, 1); 
	}
	@Test
	public void test1() {
		int winner = isWinner(new int[] {3,5,7,6}, new int[] {8,10,10,2});
		Assert.assertEquals(winner, 2); 
	}
	@Test
	public void test2() {
		int winner = isWinner(new int[] {2,3}, new int[] {4,1});
		Assert.assertEquals(winner, 0); 
	}
	
	 public int isWinner(int[] player1, int[] player2) {
		 int p1=0,p2=0,sump1=0,sump2=0;
		 
		 while(p1<player1.length) { //3,5,7,6
			 
			 if(p1==1 && player1[p1-1]==10) {
				 sump1=sump1+player1[p1]*2;
				 p1++;
			
			 }
			 else if(p1>=2 && (player1[p1-1]==10 ||player1[p1-2]==10)) {
				 sump1=sump1+player1[p1]*2;
				 p1++;
				 
			 }
			 else {
				 sump1=sump1+player1[p1];
				 p1++;
			 }
				 
			 
		 }
		 
		 while(p2<player2.length) { //8,10,10,2
			 
			 if(p2==1 && player2[p2-1]==10) {
				 sump2=sump2+player2[p2]*2;
				 p2++;
			
			 }
			 else if(p2>=2 && (player2[p2-1]==10 ||player2[p2-2]==10)) {
				 sump2=sump2+player2[p2]*2;
				 p2++;
				 
			 }
			 else {
				 sump2=sump2+player2[p2];
				 p2++;
			 }
				 
			 
		 }
		 System.out.println(sump1);
		 System.out.println(sump2);
		 
		 if(sump1>sump2) return 1;
		 if(sump1<sump2) return 2;
		 if(sump1==sump1) return 0;
		 
		 
		return 0;
	
	 }
}
	
//	 public int isWinner(int[] player1, int[] player2) {
//		 int p1=0,p2=0,sump1=0,sump2=0;
//		 while(p1<player1.length) {
//			 if(player1[p1]==10) { //{4,10,7,9}
//				 sump1=sump1+player1[p1]+(player1[p1+1])*2+(player1[p1+2])*2;
//				 p1=p1+2;
//			 }
//			 if(p1-1==10) {
//				 
//				 sump1=sump1+(player1[p1+1]*2)+(player1[p1+2]*2);
//				 p1=p1+2;
//			 }
//			 else
//				 sump1=sump1+player1[p1];
//			 	p1++;
//			 
//		 }
//		 while(p2<player2.length) {
//			 if(player2[p2]==10) {
//				 sump2=sump2+player2[p2]+player1[p2+1]*2+player2[p2+2]*2;
//				 p2=p2+2;
//			 }
//			 if(p2-1==10) {
//				 
//				 sump2=sump1+player2[p2+1]*2+player2[p2+2]*2;
//				 p2=p2+2;
//			 }
//			 else
//				 sump2=sump1+player2[p2];
//			 	p2++;
//			 
//		 }
//		 
//		// if()
//		 System.out.println(sump1);
//		 System.out.println(sump2);
//
//		 
//		 
//		return 0;
//		//return sump2;
//	        
//	    }
//
//}
