// Easy: https://leetcode.com/problems/move-zeroes/description/

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

// Time Complexity: O(N)
// Space complexity: O(1)