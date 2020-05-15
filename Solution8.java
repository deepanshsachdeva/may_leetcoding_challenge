class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length == 2) {
            return true;
        } else {            
            float slope = slope(coordinates[0], coordinates[1]);
            
            for (int i=1; i<coordinates.length; i++) {                
                float xslope = slope(coordinates[0], coordinates[i]);
                
                if (slope != xslope) return false;  
            }
            
            return true;
        }
    }
    
    private float slope(int p1[], int p2[]) {
        if (p2[0]-p1[0] == 0) return 0;
        
        return (float)(p2[1]-p1[1])/(p2[0]-p1[0]);
    }
}