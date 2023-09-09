package homework.week1;

import java.util.HashMap;

public class learnHasMap {
	
	public static void main(String[] args) {
		
		HashMap<Character, Character> map=new HashMap<Character, Character>();
		map.put('A', 'a');
		map.put('B', 'b');
		map.put('C', 'c');
		
		map.values();
		map.get(map);
		map.entrySet();
		map.keySet();
		map.containsKey(map);
		map.values();
		
		Character ch = map.get('A');
		System.out.println(ch);
	
		System.out.println(map);
	}

}
