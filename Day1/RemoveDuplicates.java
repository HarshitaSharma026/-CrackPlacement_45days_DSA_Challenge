// Easy question : https://leetcode.com/problems/remove-duplicates-from-sorted-array/

class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int p1 = 0;
        for(int p2 = 1; p2 < nums.length; p2++) {
            if (nums[p1] != nums[p2]) {
                p1 += 1;
                nums[p1] = nums[p2];
                count += 1;
            }
        }
        return count;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)
// Solved using 2-pointer technique.