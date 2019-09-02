package Leetcode;

// find the minimum number of steps required to make word1 and word2 the same,
// where in each step you can delete one character in either string.

// Use case of Longest Common Subsequence.

public class DeleteOperationsForTwoStrings {
	public int minDistance(String word1, String word2) {
		int m = word1.length(), n = word2.length();
		int[][] table = new int[m + 1][n + 1];

		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
					table[i][j] = 1 + table[i - 1][j - 1];
				} else {
					table[i][j] = table[i - 1][j] >= table[i][j - 1] ? table[i - 1][j] : table[i][j - 1];
				}
			}
		}
		return ((m - table[m][n]) + (n - table[m][n]));
	}
}
