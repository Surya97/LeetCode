package Leetcode;

//Complexity -- O(m + log(n))
//Can do in O(log(m*n-1)) -- >binary search on n*m-1 elements rowIndex = mid/n, colIndex = mid%n;

public class Search2DArray {
	public int binarySearch(int[] a, int l, int h, int target) {
		int mid = l + (h - l) / 2;
		while (l <= h) {
			if (a[mid] == target) {
				return mid;
			} else if (a[mid] < target) {
				l = mid + 1;
			} else {
				h = mid - 1;
			}
			mid = l + (h - l) / 2;
		}
		return -1;
	}

	public boolean searchMatrix(int[][] matrix, int target) {
		int rindex = -1;
		if (matrix.length == 0 || matrix[0].length == 0) {
			return false;
		}
		int j = matrix[0].length - 1;
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][0] <= target && matrix[i][j] >= target) {
				rindex = i;
				break;
			}
		}

		if (rindex == -1) {
			return false;
		} else {
			return binarySearch(matrix[rindex], 0, j, target) == -1 ? false : true;
		}
	}
}
