package Leetcode;

import java.util.Stack;

// Find the index of the next greater element.

public class DailyTemperatures {
	public int[] dailyTemperatures(int[] T) {
		int n = T.length;
		int[] ans = new int[n];

		if (n == 0) {
			return ans;
		}

		Stack<Integer> st = new Stack<Integer>();

		st.push(0);
		for (int i = 1; i < n; i++) {
			while (!st.empty() && T[st.peek()] < T[i]) {
				ans[st.peek()] = i - st.peek();
				st.pop();
			}
			st.push(i);
		}

		return ans;
	}
}
