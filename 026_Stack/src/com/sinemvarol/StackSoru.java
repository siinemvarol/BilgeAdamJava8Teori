package com.sinemvarol;

import java.util.Stack;

public class StackSoru {

	public static boolean isValid(String s) {
		Stack<Character> chars = new Stack<>();

//		boolean duzgunParantez = false;
//		int counter = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				chars.add(s.charAt(i));
//				counter++;
			}
			else if (s.charAt(i)== ')' && !chars.isEmpty() && chars.peek() == '(') {
				chars.pop();
			}
			
			else if (s.charAt(i)== ']' && !chars.isEmpty() && chars.peek() == '[') {
				chars.pop();
			}
			else if (s.charAt(i)== '}' && !chars.isEmpty() && chars.peek() == '{') {
				chars.pop();
			}
			else {
				return false;
			}

		}

//		for (int i = counter; i < s.length(); i++) {
//			if (s.charAt(i) == chars.peek()) {
//				chars.pop();
//				duzgunParantez = true;
//			}
//			else {
//				duzgunParantez = false;
//			}
//
//		}
		return chars.isEmpty();			// [(((((()

	}

	public static void main(String[] args) {

		// Düzgün Parantezler Problemi
		/*
		 * Given a string s containing just the characters '(', ')', '{', '}', '[' and
		 * ']', determine if the input string is valid.
		 * 
		 * An input string is valid if:
		 * 
		 * Open brackets must be closed by the same type of brackets. Open brackets must
		 * be closed in the correct order. Constraints : s consists of parentheses only
		 * '()[]{}'.
		 * 
		 * Example 1: Input: s = "()" Output: true
		 * 
		 * Example 2: Input: s = "()[]{}" Output: true
		 * 
		 * Example 3: Input: s = "(]" Output: false
		 * 
		 * Example 4: Input: s = "([)]" Output: false
		 * 
		 * Example 5: Input: s = "{[]}" Output: true
		 * 
		 * Note: In this question, we need to deal with only 6 symbols — (, ), {, }, [,
		 * ]. We will be given a string containing only these symbols.
		 */

		System.out.println(StackSoru.isValid("([}]"));
		System.out.println(StackSoru.isValid("([])"));
		System.out.println(StackSoru.isValid("()[]{}"));

	}

}