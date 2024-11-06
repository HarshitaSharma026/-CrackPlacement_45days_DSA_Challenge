// https://leetcode.com/problems/find-the-duplicate-number/description/

// Concept we are using: cyclic sort
// why? because range of numbers [1,n] is given
class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int ind = nums[i] - 1;
            if (nums[ind] != nums[i]) {
                int temp = nums[i];
                nums[i] = nums[ind];
                nums[ind] = temp;
            }
            else {
                i++;
            }
        }
        for(int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1) {
                return nums[j];
            }
        }
        return -1;
    }
}

// using binary search 
// the idea: peform binary search on the range [1,n]. find mid. then find 
// how many numbers (in nums) are less than equal to mid. 
// normally if there are no duplicates this count will always be equal to the number itself
// but if count > mid, means the duplicate lies on left half so : end = mid
// else it is on right half : start = mid + 1

class Solution {
    public int findDuplicate(int[] nums) {
        int start = 1, end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            int count = getCount(mid, nums);
            if (count > mid) {
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return start;
    }
    public int getCount(int ind, int[] arr) {
        int count = 0;
        for(int elem: arr) {
            if (elem <= ind) {
                count++;
            }
        }
        return count;
    }
}

// using fast and slow pointer and considering array as a linkedlist list
// with index representing nodes, and values represent the next node in the list
// we'll move slow pointer by one and fast pointer by 2, if they meet
// we'll reset the slow pointer at start, and keep the fast pointer at the node where they met
// again start slow = slow + 1, and fast= fast + 1, so we can know the starting point of the cycle
// as they can meet anywhere in the cycle.
class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // find intial point of cycle 
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}