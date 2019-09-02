package Leetcode;

import java.util.Stack;

public class RemoveAllAdjacentDuplicates {
	public String removeDuplicates(String S) {
		Stack<Character> resString = new Stack<Character>();
		char temp;
		char top;
		for (int i = 0; i < S.length(); i++) {
			temp = S.charAt(i);
			top = resString.size() > 0 ? resString.peek() : ' ';
			if (!resString.empty() && temp == top) {
				while (!resString.empty() && top == temp) {
					resString.pop();
					top = resString.empty() ? ' ' : resString.peek();
				}
			} else {
				resString.push(temp);
			}
		}

		char[] res = new char[resString.size()];
		int i = 0;
		while (!resString.empty()) {
			res[i] = resString.pop();
			i++;
		}

		int l = 0, r = res.length - 1;
		while (l < r) {
			temp = res[l];
			res[l] = res[r];
			res[r] = temp;
			l++;
			r--;
		}

		return new String(res);

	}
}
