package Leetcode;

public class RotatedSortedArraySearch {
	public int binarySearch(int[] a, int l, int h, int target) {
		int mid = (l + h) / 2;

		if (l > h) {
			return -1;
		}

		if (a[mid] == target) {
			return mid;
		}

		if (a[l] <= a[mid]) {
			if (a[l] <= target && a[mid] >= target) {
				return binarySearch(a, l, mid - 1, target);
			}
			return binarySearch(a, mid + 1, h, target);
		}

		if (a[mid] <= target && a[h] >= target) {
			return binarySearch(a, mid + 1, h, target);
		}
		return binarySearch(a, l, mid - 1, target);
	}

	public int search(int[] nums, int target) {
		int index = binarySearch(nums, 0, nums.length - 1, target);
		return index;
	}
}
