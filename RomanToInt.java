package Leetcode;

import java.util.HashMap;

public class RomanToInt {

	public static void main(String[] args) {

		String s = "MCMXCIV";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		int preVal = 0;
		int intVal = 0;
		
		for (int i = s.length()-1 ; i >=0; i--) {
			int romanVal = map.get(s.charAt(i));
			if(romanVal < preVal) {
				intVal = intVal - romanVal;
			}
			else {
				intVal = intVal + romanVal;
			}
			preVal = romanVal;
		}
		
		System.out.println("Int Value: "+intVal);
		
	}

}
