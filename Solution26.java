class Solution {
    public int findMaxLength(int[] nums) {
        int max = 0;
        //int curr_max = 0;
        int sum = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i=0; i<nums.length; i++) {
            if (nums[i]==1) {
                sum+=1;
            } else{
                sum-=1;
            }
            
            if (sum==0) {
                if (i+1 > max) max = i+1;
            } else {
                if (map.containsKey(sum)) {
                    if (i-map.get(sum) > max) max = i-map.get(sum);
                } else {
                    map.put(sum,i);
                }
            }
            
        }
        
        return max;
    }
}
