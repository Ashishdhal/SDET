package HWAFTER41;
//https://leetcode.com/problems/day-of-the-year/
import org.junit.Test;

import junit.framework.Assert;
public class DayOFTheYear {
	@Test
	
	public void test() {
		int dayOfYear = dayOfYear("2008-10-10");
		System.out.println(dayOfYear);
		Assert.assertEquals(dayOfYear, 284);
	}
	 public int dayOfYear(String date) {
		 int totaldays=0;
		 String mm = date.substring(5,7);
		 Integer monthName = Integer.valueOf(mm);
		
		 
		 String dd = date.substring(8, date.length());
		 Integer days = Integer.valueOf(dd);
		 String yyyy = date.substring(0, 4);
		 Integer year = Integer.valueOf(yyyy);
		 System.out.println("mm:"+monthName);
		 System.out.println("days:"+days);
		 System.out.println("year:"+year);
		 
		 if(monthName==1) {
			 totaldays=totaldays+days;
			 return totaldays;
		 }
		 for (int i = 1; i < monthName; i++) {
			 
			
			 
			 if((i==1)||(i==3)||(i==5)||(i==7)||(i==8)||(i==10)||(i==12)){
				 
				 totaldays=totaldays+31;
			 }
			 
			 else if(i==2) {
				 if(year%4==0) {
					 totaldays=totaldays+29;
				 }
				 else {
					 totaldays=totaldays+28;
				 }
				 
			 }
			 else {
				 totaldays=totaldays+30;
				 
			 }
			
		}
		 
		 
		 
		return totaldays+days;
		 
	        
	    }
}
