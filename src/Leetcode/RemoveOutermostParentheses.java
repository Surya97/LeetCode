package Leetcode;

import java.util.ArrayList;
import java.util.Stack;

public class RemoveOutermostParentheses {
	public String removeOuterParentheses(String S) {
		Stack<Character> st = new Stack<Character>();
		ArrayList<Integer> start = new ArrayList<Integer>();
		ArrayList<Integer> end = new ArrayList<Integer>();
		int n = S.length();
		char temp;
		int stackSize = 0;

		if (n == 0) {
			return S;
		}

		for (int i = 0; i < n; i++) {
			temp = S.charAt(i);
			if (temp == '(') {
				if (stackSize == 0) {
					start.add(i);
				}
				st.push(temp);
				stackSize++;
			} else if (temp == ')') {
				if (stackSize > 0 && st.peek() == '(') {
					st.pop();
					stackSize--;
					if (stackSize == 0) {
						end.add(i);
					}
				}
			}
		}

		String ans = "";

		for (int i = 0; i < start.size(); i++) {
			ans += S.substring(start.get(i) + 1, end.get(i));
		}

		return ans;
	}
}
