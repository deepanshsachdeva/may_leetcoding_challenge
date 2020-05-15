class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1) {
            return nums[0];    
        }
        
        int m = nums.length/2;
        
        Arrays.sort(nums);
        
        return nums[m];
    }
}