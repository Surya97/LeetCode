package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	public List<List<Integer>> generate(int numRows) {

		ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();

		if (numRows == 0) {
			return res;
		}
		if (numRows >= 1) {
			res.add(new ArrayList<Integer>());
			res.get(0).add(1);
			if (numRows == 1) {
				return res;
			}
		}

		ArrayList<Integer> temp = new ArrayList<Integer>();

		for (int i = 2; i <= numRows; i++) {
			temp = new ArrayList<Integer>();
			temp.add(1);
			for (int j = 1; j < i - 1; j++) {
				temp.add(res.get(i - 2).get(j - 1) + res.get(i - 2).get(j));
			}
			temp.add(1);
			res.add(temp);
		}

		return res;

	}
}
