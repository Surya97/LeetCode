package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RodCutting {
	public static void main(String[] args)throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int n;
		while(t-->0){
		    n = Integer.parseInt(br.readLine());
		    int[] a = new int[n];
		    String[] input = br.readLine().split(" ");
		    for(int i = 0; i < n;i++){
		        a[i] = Integer.parseInt(input[i]);
		    }
		    int[] dp = new int[n+1];
		    for(int i = 1; i<=n; i++){
		        int maxVal = Integer.MIN_VALUE;
		        for(int j = 1; j<= i; j++){
		            maxVal = Math.max(maxVal, a[j-1]+dp[i-j]);
		        }
		        dp[i] = maxVal;
		    }
		    System.out.println(dp[n]);
		}
	}
}
