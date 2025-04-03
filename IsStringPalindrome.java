package Leetcode;

import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsStringPalindrome {

	public static void main(String[] args) {
		String palinDrome= "race e car";
		String newStr = palinDrome.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		IsStringPalindrome is = new IsStringPalindrome();
		System.out.println(is.isPal(newStr));
		
		}
	
	public boolean isPal(String s) {
		int left =0;
		int right = s.length()-1;
		
		while(left < right) {
			if(s.charAt(left) == s.charAt(right)) {
				left++;
				right--;
			}else {
				return false;
			}
				
		}
		
		return true;
		

	}
		
		
		



}
