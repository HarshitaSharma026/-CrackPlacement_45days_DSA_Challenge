//Product Array Puzzle:  https://www.geeksforgeeks.org/problems/product-array-puzzle4525/1

// Different approach will be used to handle arrays containing 1 or more zeros
class Solution {
    public static long[] productExceptSelf(int arr[]) {
        long[] ans = new long[arr.length];
        long prod = 1;
        boolean zeroPresent = false;
        int count = 0;
        for(int elem: arr) {
            if (elem == 0) {
                zeroPresent = true;
                count++;
            }
            else {
                prod *= elem;
            }
        }
        if(zeroPresent) {
            if (count > 1) {
                return ans;
            }
            for(int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    ans[i] = prod;
                }
                else {
                    ans[i] = 0;
                }
            }
        }
        else {
            for(int i = 0; i < arr.length; i++) {
                ans[i] = prod / arr[i];
            }
        }
        return ans;
    }
}
