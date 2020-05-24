class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        int ax = 0;
        int bx = 0;
        
        List<int[]> result = new ArrayList<>();
        
        while(ax < A.length && bx < B.length) {
            int start = Math.max(A[ax][0],B[bx][0]);
            int end = Math.min(A[ax][1],B[bx][1]);
            
            if (start<=end) {
               result.add(new int[]{start,end}); 
            }
            
            if (A[ax][1] < B[bx][1]) {
                ax+=1;
            }
            else{
                bx+=1;
            }
        }
        
        return result.toArray(new int[result.size()][2]);
    }
}
