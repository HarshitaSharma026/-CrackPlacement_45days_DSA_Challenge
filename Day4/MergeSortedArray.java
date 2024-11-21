// Easy: https://leetcode.com/problems/merge-sorted-array/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int[] arr = Arrays.copyOf(nums1, m);

        while(n1 < arr.length && n2 < n) {
            if(arr[n1] < nums2[n2]) {
                nums1[n3] = arr[n1];
                n3++; n1++;
            }
            else {
                nums1[n3] = nums2[n2];
                n3++; n2++;
            }
        }

        while(n1 < arr.length) {
            nums1[n3] = arr[n1];
            n3++; n1++;
        }
        while(n2 < n) {
            nums1[n3] = nums2[n2];
            n3++; n2++;
        }
    }
}

// Point to remember: Arrays.copyOf(nums1, newlength) to get the non zero elements
// Time complexity : O(n+m)
// Space complexity : o(m)