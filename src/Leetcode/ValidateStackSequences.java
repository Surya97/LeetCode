package Leetcode;

import java.util.Stack;

public class ValidateStackSequences {
	public boolean validateStackSequences(int[] pushed, int[] popped) {
		Stack<Integer> st = new Stack<Integer>();
		int i = 0, j = 0;
		int p = pushed.length, po = popped.length;

		if (p == 0 && po == 0) {
			return true;
		}

		if (p == 0 && po != 0) {
			return false;
		}

		while (pushed[i] != popped[j]) {
			st.push(pushed[i]);
			i++;
		}
		st.push(pushed[i]);
		i++;
		boolean flag = true;

		while (i < p && j < po) {
			if (!st.empty() && (st.peek() == popped[j])) {
				st.pop();
				j++;
			} else {
				if (i < p) {
					st.push(pushed[i]);
					i++;
				} else {
					flag = false;
					break;
				}
			}
		}
		if (!flag) {
			return false;
		}

		if (i >= p) {
			while (j < po) {
				if (st.peek() != popped[j]) {
					return false;
				}
				st.pop();
				j += 1;
			}
		}

		return true;

	}
}
