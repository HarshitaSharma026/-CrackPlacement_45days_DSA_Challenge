// Easy: https://leetcode.com/problems/maximum-product-of-three-numbers/

class Solution {

    // another method - Better and faster approach than Arrays.sort() method

    public int maximumProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int elem: nums) {
            if(elem > max1) {
                max3 = max2;
                max2 = max1;
                max1 = elem;
            }
            else if (elem > max2) {
                max3 = max2;
                max2 = elem;
            }
            else if (elem > max3) {
                max3 = elem;
            }
            if(elem < min1) {
                min2 = min1;
                min1 = elem;
            }
            else if (elem < min2) {
                min2 = elem;
            }
        }
        return Math.max(max1 * max2 * max3, min1 * min2 * max1);
        
    }
}


// 2 methods to solve - but same concept used in both methods
// 1. Sort array and find max in product
// O(n log n)
// 2. take max1, max2, max3, min1, min2 and manually check which one greater.
// O(n)
