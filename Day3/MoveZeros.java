// Easy: https://leetcode.com/problems/move-zeroes/description/
// NEEDS REVISION

class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;

        for(int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
    }
}

// Using 2-pointer approach. The approach used is to move the non zero elements to the left and zero elements to right.
// concept: move i forward, and fix pointer "p" is soon as it encounters a zero.
// Time Complexity: O(N)
// Space complexity: O(1)