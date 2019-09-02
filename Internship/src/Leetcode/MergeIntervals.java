package Leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class MergeIntervals {
	public int[][] merge(int[][] intervals) {

		if (intervals.length == 0 || intervals.length == 1) {
			return intervals;
		}

		Arrays.sort(intervals, new Comparator<int[]>() {

			public int compare(int[] a, int[] b) {
				return Integer.compare(a[0], b[0]);
			}
		});

		Stack<int[]> mergeInterval = new Stack<int[]>();
		mergeInterval.push(intervals[0]);

		int[] top = mergeInterval.peek();

		for (int i = 1; i < intervals.length; i++) {
			top = mergeInterval.peek();
			if (intervals[i][0] <= top[1]) {
				if (intervals[i][1] >= top[1]) {
					top[1] = intervals[i][1];
					mergeInterval.pop();
					mergeInterval.push(top);
				}
			} else {
				mergeInterval.push(intervals[i]);
			}
		}

		return mergeInterval.toArray(new int[mergeInterval.size()][2]);
	}
}
