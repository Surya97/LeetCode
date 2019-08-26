package Leetcode;

public class FirstAndLastOccurrence {
	public int binarySearch(int[] a, int l, int h, int target) {

		int mid = (l + h) / 2;
		while (l <= h) {
			if ((mid == 0 || a[mid - 1] < target) && a[mid] == target) {
				return mid;
			} else if (a[mid] < target) {
				l = mid + 1;
			} else {
				h = mid - 1;
			}
			mid = (l + h) / 2;
		}
		return -1;
	}

	public int binarySearchLast(int[] a, int l, int h, int target) {

		int n = a.length;
		int mid = (l + h) / 2;
		while (l <= h) {
			if ((mid == n - 1 || a[mid + 1] > target) && a[mid] == target) {
				return mid;
			} else if (a[mid] > target) {
				h = mid - 1;
			} else {
				l = mid + 1;
			}
			mid = (l + h) / 2;
		}
		return -1;
	}

	public int[] searchRange(int[] nums, int target) {
		if (nums.length == 0) {
			return new int[] { -1, -1 };
		}
		int first = binarySearch(nums, 0, nums.length - 1, target);

		int last = binarySearchLast(nums, 0, nums.length - 1, target);

		return new int[] { first, last };
	}
}
