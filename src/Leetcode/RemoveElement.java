package Leetcode;

//Remove all occurrences of an value by modifying the array in-place. Return the length of the array.

public class RemoveElement {
	public int removeElement(int[] nums, int val) {
		int cptr = 0, i = 0;
		int temp = 0;
		int count = 0;
		while (i < nums.length) {
			while (i < nums.length && nums[i] == val) {
				i += 1;
			}
			if (i >= nums.length) {
				break;
			}
			temp = nums[cptr];
			nums[cptr] = nums[i];
			nums[i] = temp;
			cptr += 1;
			count += 1;
			i += 1;
		}
		return count;
	}
}


/*
 * More simple approach
 *  int i = 0;
 *   for (int j = 0; j < nums.length; j++) { 
 *   if(nums[j] != val) {
 *   	 nums[i] = nums[j]; i++; }
 *    }
 *     return i;
 */
