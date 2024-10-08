// Medium: https://leetcode.com/problems/4sum/

// unable to run it
// its showing wrong answer at input: [0,0,0,0]

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i < nums.length - 4; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for(int j = i + 1; j <= nums.length - 3; j++) {
                if (j != i+1 && nums[j] == nums[j - 1]) continue;

                int left = j + 1;
                int right = nums.length - 1;
                while(left < right) {
                    long sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if(sum > target) {
                        right--;
                    }
                    else if (sum < target) {
                        left++;
                    } 
                    else {
                        list.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;
                        while(left < right && nums[left] == nums[left+1]) {
                            left++;
                        }
                        while(left < right && nums[right] == nums[right-1]) {
                            right--;
                        }
                        
                    }
                }
            }
        }
        return list;
    }
}