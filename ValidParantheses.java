package Leetcode;

import java.util.Stack;

public class ValidParantheses {

	public static void main(String[] args) {
		
		ValidParantheses para = new ValidParantheses();
		System.out.println(para.isValid("()(){}[]{}"));
	}
	
	 public boolean isValid(String s) {
		 
		 Stack<Character> stack =  new Stack<>();
		 
			for (char c : s.toCharArray()) {
				if (c == '(') {
					stack.push(')');
				} else if (c == '{') {
					stack.push('}');
				} else if (c == '[') {
					stack.push(']');
				}else if (stack.isEmpty() || stack.pop() != c) {
					return false;
				}
			}
		 return stack.isEmpty();
		 
		 
	        
	    }

}
