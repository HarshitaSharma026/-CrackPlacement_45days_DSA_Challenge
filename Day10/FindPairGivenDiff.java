// Easy: https://www.geeksforgeeks.org/problems/find-pair-given-difference1559/1

class Solution {
    public int findPair(int n, int x, int[] arr) {
        Arrays.sort(arr);
        int p1 = 0;
        int p2 = 1;
        while(p1 <= p2 && p2 < n) {
            int diff = arr[p2] - arr[p1];
            if (diff == x && p1 != p2) {
                return 1;
            }
            else if (diff > x) {
                // if diff is greater, we'll reduce the difference 
                // by moving the pointer closer to p2
                p1++;
            }
            else {
                // if diff is smaller, we'll increase the difference
                // by moving the pointer far from to p1
                p2++;
            }
        }
        return -1;
    }
}

