// Easy: https://www.geeksforgeeks.org/permute-two-arrays-sum-every-pair-greater-equal-k/

class Solution {
    public boolean isPossible(long a[], long b[], int n, long k) {
        Arrays.sort(a);
        Long[] bcopy = Arrays.stream(b).boxed().toArray(Long[]::new);
        Arrays.sort(bcopy, Collections.reverseOrder());
        for(int i = 0; i < n; i++) {
            if(a[i] + bcopy[i] < k) {
                return false;
            }
        }
        return true;
    }
}

// New concept learned about reversing array in descending order.
// REVISE AGAIN
// Time complexity: O(nlog n)
// Space complexity: O(n)