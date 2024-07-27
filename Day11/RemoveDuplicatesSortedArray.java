// Medium: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

class Solution {
    public int removeDuplicates(int[] nums) {
        int p1 = 0;
        int count = 1;
        for(int p2 = 1; p2 < nums.length; p2++) {
            if (nums[p1] != nums[p2]) {
                nums[++p1] = nums[p2];
                count += 1;
            }
        }
        return count;
    }
}

// Time complexity: O(n)
// Space complexity: O(1)