// Easy : https://leetcode.com/problems/majority-element/

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}

// Time complexity : O(nlogn)
// Space complexity: O(1)