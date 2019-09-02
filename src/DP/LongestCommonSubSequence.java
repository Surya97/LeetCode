package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestCommonSubSequence {
	
	public static String commonsubsequence = "";
	
	public static int lcs(String a, String b) {
		int result = 0;
		int[][] table = new int[a.length()+1][b.length()+1];
		
		for(int i = 1; i < a.length()+1; i++) {
			for(int j = 1; j < b.length()+1 ; j++) {
				if(a.charAt(i-1)==b.charAt(j-1)) {
					table[i][j] = 1 + table[i-1][j-1];
				}
				else {
					table[i][j] = Math.max(table[i-1][j], table[i][j-1]);
				}
			}
		}
		
		int i = a.length(), j = b.length();
		
		while( i > 0 && j > 0) {
			if(table[i][j] == table[i-1][j]) {
				i-=1;
			}
			else if(table[i][j] == table[i][j-1]) {
				j-=1;
			}
			else {
				if(a.charAt(i-1) == b.charAt(j-1)) {
					commonsubsequence=a.charAt(i-1)+commonsubsequence;
					i--;
					j--;
				}
			}
		}
		
		
		return table[a.length()][b.length()];
	}

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		String s2 = br.readLine();
		int length = lcs(s1, s2);
		System.out.println("Length of LCS of strings "+ s1 + " and "+ s2 + " is " + length);
		System.out.println("The LCS is " + commonsubsequence);
	}
	

}
