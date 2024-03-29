package Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class RelativeSortArray {
	public int[] relativeSortArray(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
		int count = 0;
		int[] res = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			if (mp.containsKey(arr1[i])) {
				count = mp.get(arr1[i]);
				mp.put(arr1[i], count + 1);
			} else {
				mp.put(arr1[i], 1);
			}
		}
		int k = 0;
		for (int i = 0; i < arr2.length; i++) {
			count = mp.get(arr2[i]);
			for (int j = 0; j < count; j++) {
				res[k] = arr2[i];
				k += 1;
			}
			mp.remove(arr2[i]);
		}

		int[] diff = new int[arr1.length - k];
		int j = 0;
		Set<Integer> keys = mp.keySet();
		for (Integer key : keys) {
			count = mp.get(key);
			for (int i = 0; i < count; i++) {
				diff[j] = key.intValue();
				j += 1;
			}
		}
		Arrays.sort(diff);

		for (int i = 0; i < diff.length; i++) {
			res[k] = diff[i];
			k += 1;
		}

		return res;

	}
}
