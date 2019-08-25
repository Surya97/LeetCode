package Leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class IntersectionOfTwoArrays {
	public int binarySearch(int[] a, int l, int h, int t) {
		int mid = (l + h) / 2;
		while (l <= h) {
			mid = (l + h) / 2;
			if (a[mid] == t) {
				return mid;
			} else if (a[mid] < t) {
				l = mid + 1;
			} else {
				h = mid - 1;
			}
		}
		return -1;
	}

	public int[] intersection(int[] nums1, int[] nums2) {
		int n1 = nums1.length;
		int n2 = nums2.length;
		int index = -1;
		int[] res = new int[Math.min(n1, n2)];
		HashMap<Integer, Boolean> mp = new HashMap<Integer, Boolean>();
		int k = 0;

		if (n1 == 0 || n2 == 0) {
			return new int[0];
		}

		if (n1 < n2) {
			Arrays.sort(nums1);
			for (int i = 0; i < n2; i++) {
				index = binarySearch(nums1, 0, n1 - 1, nums2[i]);
				if (index != -1) {
					if (!mp.containsKey(nums2[i])) {
						res[k] = nums2[i];
						k += 1;
						mp.put(nums2[i], true);
					}
				}
			}
		} else {
			Arrays.sort(nums2);
			for (int i = 0; i < n1; i++) {
				index = binarySearch(nums2, 0, n2 - 1, nums1[i]);
				if (index != -1) {
					if (!mp.containsKey(nums1[i])) {
						res[k] = nums1[i];
						k += 1;
						mp.put(nums1[i], true);
					}
				}
			}
		}

		return Arrays.copyOf(res, k);
	}
}
