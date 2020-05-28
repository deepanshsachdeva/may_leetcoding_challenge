class Solution {
    public boolean possibleBipartition(int N, int[][] dislikes) {
        int[][] adj = new int[N][N];
        
        for(int i=0; i<dislikes.length; i++){
            adj[dislikes[i][0]-1][dislikes[i][1]-1] = 1;
            adj[dislikes[i][1]-1][dislikes[i][0]-1] = 1;
        }
        
        int[] color = new int[N];
        
        for(int i=0; i<N; i++){
            if(color[i]==0 && !dfsHelper(adj,color,i,1)) return false;
        }
        
        return true;
    }
    
    private boolean dfsHelper(int[][] adj, int[] color, int ix, int c){
        color[ix] = c;
        
        for (int i=0; i<adj.length; i++) {
            if (adj[ix][i] == 1) {
                if (color[i] == c) {
                    return false;
                }
                if (color[i] == 0 && !dfsHelper(adj,color,i,-c)) {
                    return false;
                }
            }
        }
        return true;
    }
}
