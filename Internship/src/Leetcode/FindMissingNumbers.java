package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindMissingNumbers {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int temp = nums[i] > 0 ? nums[i] : -nums[i];
			if (nums[temp - 1] > 0) {
				nums[temp - 1] = -nums[temp - 1];
			}
		}
		ArrayList<Integer> res = new ArrayList<Integer>();
		for (int i = 1; i <= nums.length; i++) {
			if (nums[i - 1] > 0) {
				res.add(i);
			}
		}
		return res;
	}
}
