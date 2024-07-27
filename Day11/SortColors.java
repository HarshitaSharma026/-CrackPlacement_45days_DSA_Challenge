// Medium: https://leetcode.com/problems/sort-colors/description/

class Solution {
    public void sortColors(int[] nums) {
        // using dutch national flag algorithm
        // taking three pointers:
        // low = t0 keep track of 0s
        // mid = to keep track of 1s
        // high = to keep track of 2s
        int mid = 0, low = 0;
        int high = nums.length - 1;
        while(mid <= high) {
            if(nums[mid] == 0) {
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                mid++; low++;
            }
            else if (nums[mid] == 2) {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
                // we are not incrementing mid here as we need to process swapped element at mid as well
            }
            else if(nums[mid] == 1) {
                // if value at mid is 1, just move ahead.
                mid++;
            }
        }
    }

    
    public void sortColors2(int[] nums) {
        // manually count 0, 1, 2
        int[] arr = new int[3];
        int count = 0;
        for(int elem: nums) {
            arr[elem]++;
        }
        for(int i = 0; i < arr[0]; i++) {
            nums[i] = 0;
            count += 1;
        }
        for(int i = 0; i < arr[1]; i++) {
            nums[count] = 1;
            count += 1;
        }
        for(int i = 0; i < arr[2]; i++) {
            nums[count] = 2;
            count += 1;
        }   
    }

// cyclic sort
    public void sortColors(int[] nums) {
        for(int i = 1; i < nums.length; i++) {
            for(int j = i; j > 0; j--) {
                if(nums[j] < nums[j-1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
    }
}

// Three ways:
// 1. Using insertion sort 
// time complexity: O(n^2)
// space complexity: O(1)

// 2. counting 0, 1 and 2 
// time complexity: O(n)
// space complexity: O(n)

// 3. Using three pointers, low mid and high
// time complexity: O(n)
// space complexity: O(1)


