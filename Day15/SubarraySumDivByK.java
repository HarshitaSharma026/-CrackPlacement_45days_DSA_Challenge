// Medium: https://leetcode.com/problems/subarray-sums-divisible-by-k/description/

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count = 0;
        int prefixsum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        for(int num: nums) {
            prefixsum += num;
            int mod = prefixsum % k;
            // if mod is -ve, make it +ve
            if(mod < 0) {
                mod = mod + k;
            }
            if(map.containsKey(mod)) {
                count = count + map.get(mod);
                map.put(mod, map.get(mod) + 1);
            }
            else {
                map.put(mod, 1);
            }
        } 
        return count;
    }
}

// My solution using hashmaps : 23ms
// Time complexity: O(n)
// Space complexity: O(n)

// another solution: not able to understand, its done using arrays.

// my solution: using prefix sum method

/*

 "PREFIX SUM METHOD" -> applications
1. When the problem involves querying the sum of elements between various ranges multiple times.
Example: Finding the sum of elements in subarrays or ranges efficiently.

2. When you need to determine subarrays that meet a specific sum condition, such as being equal to a given value or divisible by a number.
Example: Counting subarrays whose sum is divisible by (k).

*/