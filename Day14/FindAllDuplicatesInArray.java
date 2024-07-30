// Medium: https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

// Approach: cycle sort
// why because range [1,n] is given

// ** important point to remember: if such things are asked, find all indices, find all numbers, 
// find all occurences, then in that case first perform cyclic sort, and then loop through the array
// to find the duplicates one. **

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        //cyclic sort the nums
        int i = 0;
        while(i < nums.length) {
            int ind = nums[i] - 1;
            if (nums[ind] != nums[i]) {
                int temp = nums[ind];
                nums[ind] = nums[i];
                nums[i] = temp;
            }
            else {
                i++;
            }
        }
        // check for duplicates
        for(int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1) {
                list.add(nums[j]);
            }
        }
        return list;
    }
    
}

// Two approaches: 
// - Using cyclic sort
// - Putting -ve on the index when we encounter that index. 
// Time complexity: O(n)
// Space complexity: O(n), n being the size of arraylist to be returned.
