// Medium: https://leetcode.com/problems/find-the-duplicate-number/description/

// Concept we are using: cyclic sort
// why? because range of numbers [1,n] is given

class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            if(nums[i] != i+1) {        // means the value at this index is not correct, place it on correct position
                int ind = nums[i] - 1;
                if (nums[ind] != nums[i]) {
                    int temp = nums[ind];
                    nums[ind] = nums[i];
                    nums[i] = temp;
                }
                else {
                    return nums[i];
                }
            }
            else {
                i++;
            }
        }
        return -1;
    }
}

// I did it with cyclic sort. 
// Time complexity: O(n)
// Space complexity: O(1)
// but there are different approached available, such as fast and slow pointer in LL, binary search, two pointer and so on.