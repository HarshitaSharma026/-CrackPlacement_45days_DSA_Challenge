// Medium: https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/description/

class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += cardPoints[i];
        }
        int max = sum;
        for(int j = 0; j < k; j++){
            sum = sum - cardPoints[k - 1 - j] + cardPoints[cardPoints.length - 1 - j];
            max = Math.max(sum, max);
        }
        return max;
    }
}

// Revise again
// Time complexity: O(n)
// Space complexity: O(1)