package Leetcode;
//Use an array based implementation instead of using Stack class to reduce the execution time.

import java.util.Stack;

public class ValidParentheses {

	public boolean isValid(String s) {

		Stack<Character> st = new Stack<Character>();
		boolean flag = false;
		if (s.length() == 0) {
			return true;
		}
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				st.push(s.charAt(i));
			} else {
				if (st.empty()) {
					flag = true;
					break;
				} else if (s.charAt(i) == ')') {
					if (st.peek() != '(') {
						flag = true;
						break;
					} else {
						st.pop();
					}
				} else if (s.charAt(i) == ']') {
					if (st.peek() != '[') {
						flag = true;
						break;
					} else {
						st.pop();
					}
				} else if (s.charAt(i) == '}') {
					if (st.peek() != '{') {
						flag = true;
						break;
					} else {
						st.pop();
					}
				}
			}

		}

		if (!flag && st.empty()) {
			return true;
		}

		return false;
	}

}
