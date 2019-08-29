package Leetcode;

import java.util.Stack;

public class InsertAndMergeInterval {
	public int[][] insert(int[][] intervals, int[] newInterval) {

		if (intervals.length == 0) {
			if (newInterval.length != 0) {
				return new int[][] { newInterval };
			} else {
				return intervals;
			}
		}

		Stack<int[]> res = new Stack<int[]>();
		boolean isInserted = false;

		for (int[] a : intervals) {
			if (!isInserted) {
				if (newInterval[1] < a[0]) {
					res.push(newInterval);
					res.push(a);
					isInserted = true;
				} else if (a[1] < newInterval[0]) {
					res.push(a);
				} else {
					newInterval[0] = Math.min(a[0], newInterval[0]);
					newInterval[1] = Math.max(a[1], newInterval[1]);
				}
			} else {
				res.push(a);
			}

		}
		if (!isInserted) {
			res.push(newInterval);
		}
		return res.toArray(new int[res.size()][2]);

	}

}
