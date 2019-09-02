package Leetcode;

// The requirement is we should not use extra space. Should modify the array in-place.

public class RemoveDuplicatedFromSortedArray {
	public int removeDuplicates(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		int cptr = 1;
		int i = 1;
		int count = 1;
		int temp = nums[0];
		while (i < nums.length) {
			while (i < nums.length && nums[i] == temp) {
				i += 1;
			}
			if (i >= nums.length) {
				break;
			}
			temp = nums[cptr];
			nums[cptr] = nums[i];
			nums[i] = temp;

			temp = nums[cptr];
			cptr += 1;
			count += 1;
			i += 1;
		}
		// for(i = 0; i< nums.length; i++){
		// System.out.print(nums[i] + " ");
		// }
		return count;
	}
}


// Easy solution
/*  i = 0
 * for(int j = 0; j< n; j++){
 * 		if(nums[j]!=nums[i]){
 * 			i+=1;
 * 			nums[i] = nums[j];
 * 		}
 * }
 * 
 * return i+1;
 */
