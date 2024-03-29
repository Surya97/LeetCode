package Leetcode;

public class Transpose {
	public int[][] transpose(int[][] A) {

		int n = A.length;
		int m = A[0].length;
		int[][] res = new int[m][n];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				res[j][i] = A[i][j];
			}
		}
		return res;
	}
}
