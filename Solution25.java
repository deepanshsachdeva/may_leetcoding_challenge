class Solution {
    public int maxUncrossedLines(int[] A, int[] B) {
        int lena = A.length;
        int lenb = B.length;
        
        int[][] dp = new int[lena+1][lenb+1];
        
        for (int i=1; i<=lena; i++) {
            for (int j=1; j<=lenb; j++) {
                if (A[i-1] == B[j-1]) {
                    dp[i][j] = dp[i-1][j-1]+1;
                } else {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        
        return dp[lena][lenb];
    }
}
