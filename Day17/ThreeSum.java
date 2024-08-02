// Medium: https://leetcode.com/problems/3sum/description/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        if(nums.length < 3) {
            return list;
        }
        if(nums[0] > 0) {
            return list;
        }
        for(int i = 0; i < nums.length; i++) {
            // this snippet it used to check if the number we are fixing is getting repeated
            // if it is we are going to ignore it and move forward, as we are only looking for 
            // last occurance of this repeated number.
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int j = i + 1;
            int k = nums.length - 1;

            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    list.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while(j < k && nums[j] == nums[j+1]) {
                        j++;
                    }
                    while(j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }
                    j++;
                    k--;
                }
                else if (sum > 0) {
                    k--;
                }
                else if (sum < 0) {
                    j++;
                }
            }
        }
        return list;
    }
}

// REVISE AGAIN
// here we are fixing one number, and changing other two numbers using two pointers

// Many approaches are possible
// I used in this question: sorting + two pointer technique

// Time complexity: O(n^2)
// Space complexity: O(n), n being size of arraylist