package Leetcode;

public class RightRotateArray {
	public void reverse(int[] a, int start, int end) {
		int i = start, j = end;
		int temp = 0;
		while (i < j) {
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
	}

	public void rotate(int[] nums, int k) {
		k = k % nums.length;
		reverse(nums, nums.length - k, nums.length - 1);
		reverse(nums, 0, nums.length - k - 1);
		reverse(nums, 0, nums.length - 1);
	}
}
