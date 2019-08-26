package Leetcode;

import java.util.HashMap;

public class WordsFromCharacters {
	public int countCharacters(String[] words, String chars) {
		int[] charCount = new int[26];
		int count = 0;
		for (int i = 0; i < chars.length(); i++) {
			charCount[chars.charAt(i) - 'a'] += 1;
		}
		HashMap<Character, Integer> mp;
		int sum = 0;
		boolean flag = true;
		int[] temp;
		for (int i = 0; i < words.length; i++) {
			temp = charCount.clone();
			count = 0;
			for (int j = 0; j < words[i].length(); j++) {
				if (temp[words[i].charAt(j) - 'a'] > 0) {
					temp[words[i].charAt(j) - 'a'] -= 1;
					count += 1;
				} else {
					count = 0;
					break;
				}
			}
			sum += count;
		}

		return sum;
	}
}
