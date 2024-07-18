// Easy :  https://leetcode.com/problems/two-sum/description/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[]{i, map.get(diff)};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}

// Three techniques to solve this problem
// 1. Brute force : O(n^2)
// 2. Two pass hash table: O(n)
// 3. One pass hash: O(n)
