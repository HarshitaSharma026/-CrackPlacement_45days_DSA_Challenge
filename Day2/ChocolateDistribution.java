// Easy : https://www.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1

class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        int p1 = 0;
        long min = Integer.MAX_VALUE;
        Collections.sort(a);
        
        for(int p2 = m - 1 ; p2 < n; p2++) {
            long diff = a.get(p2) - a.get(p1);
            if (diff < min) {
                min = diff;
            }
            p1++;
        }
        return min;
    }
}

// Approach : sorting, why because we can get minimum difference from the closest elements in the sorted list
// Time complexity : O(nlogn)
// Space Complexity : O(1)