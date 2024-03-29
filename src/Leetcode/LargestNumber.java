package Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LargestNumber {
	public String largestNumber(int[] nums) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			num.add(nums[i]);
		}
		Collections.sort(num, new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				String X = Integer.toString(a) + Integer.toString(b);
				String Y = Integer.toString(b) + Integer.toString(a);

				return X.compareTo(Y) > 0 ? -1 : 1;
			}
		});
		String res = "";
		for (Integer i : num) {
			res += Integer.toString(i);
		}
		return res;
	}
}
