package DSA;

import org.junit.Test;

/*P.CODE:
	1. Initailze int line=1, currentWidth=0
	2. Iterate the string using charAt() 
	3. currentWidth=currentWidth+witdth['a'-'ch']
	4. put a conditon when the pixel count >=100, increase line, 
	5. return lines, current width
			*/
public class HW_806_NoOfLineToWriteString {

@Test
public void test() {
	
	int[] numberOfLines = numberOfLines(new int[] {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10}, "abcdefghijklmnopqrstuvwxyz");
	//System.out.println(numberOfLines);
	for (int i = 0; i < numberOfLines.length; i++) {
		System.out.println(numberOfLines[i]);
	}

}
	
public int[] numberOfLines(int[] widths, String s) {
	int line=1;
	int currentWidth=0;
	char[] chArray = s.toCharArray();
	for (char c : chArray) {
		int chWidth=widths[c-'a'];
		
		if(currentWidth+chWidth>100) {
			line++;
			currentWidth=chWidth;
		}
		else {
			
			currentWidth+=chWidth;
		}
		
		
	}
	
	
	
	return new int[] {line, currentWidth};
        
    }

}
