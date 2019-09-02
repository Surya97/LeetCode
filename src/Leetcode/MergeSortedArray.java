package Leetcode;

public class MergeSortedArray {
	public void shift(int[] ar, int start, int m) {

		for (int i = 0; i < m; i++) {
			ar[m + start - i] = ar[m + start - i - 1];
		}

	}

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = 0, j = 0;
		int count = 0;
		if (m == 0) {
			for (i = 0; i < n; i++) {
				nums1[i] = nums2[i];
			}
			return;
		}
		if (n == 0) {
			return;
		}

		else {
			while (i < m && j < n) {
				if (nums1[i + count] > nums2[j]) {
					shift(nums1, i + count, m - i);
					nums1[i + count] = nums2[j];
					count += 1;
					j += 1;
				} else {
					i += 1;
				}
			}

			while (j < n) {
				nums1[m + j] = nums2[j];
				j += 1;
			}
		}
	}
}
