package Leetcode;

public class ReverseOnlyLetters {
	public boolean isAlphabet(char c) {
		if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
			return true;
		}
		return false;
	}

	public String reverseOnlyLetters(String S) {
		int i = 0, j = S.length() - 1;
		char[] temp = S.toCharArray();
		while (i < j) {
			if (isAlphabet(S.charAt(i)) && isAlphabet(S.charAt(j))) {
				temp[i] = S.charAt(j);
				temp[j] = S.charAt(i);
				i += 1;
				j -= 1;
			} else {
				if (!isAlphabet(S.charAt(i))) {
					i += 1;
				}
				if (!isAlphabet(S.charAt(j))) {
					j -= 1;
				}
			}
		}

		return new String(temp);
	}
}
