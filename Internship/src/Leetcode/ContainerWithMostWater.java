package Leetcode;

public class ContainerWithMostWater {
	public int maxArea(int[] height) {
		int lptr = 0, rptr = height.length - 1;
		int maxWater = Integer.MIN_VALUE;
		while (lptr < rptr) {
			maxWater = Math.max(maxWater, Math.min(height[lptr], height[rptr]) * (rptr - lptr));

			if (height[lptr] > height[rptr]) {
				rptr -= 1;
			} else {
				lptr += 1;
			}
		}
		return maxWater;
	}
}
