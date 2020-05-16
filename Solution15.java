class Solution {
    public int maxSubarraySumCircular(int[] A) {
        int total = 0, maxSum = -30000, curMax = 0, minSum = 30000, curMin = 0;
        
        for (int i=0; i<A.length; i++) {
            curMax = Math.max(curMax + A[i], A[i]);
            maxSum = Math.max(maxSum, curMax);
            curMin = Math.min(curMin + A[i], A[i]);
            minSum = Math.min(minSum, curMin);
            total += A[i];
        }
        return maxSum > 0 ? Math.max(maxSum, total - minSum) : maxSum;
    }
}