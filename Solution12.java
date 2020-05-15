class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        
        for (int i=0,j=1; i<n-1; i+=2) {
            if (nums[i] != nums[j]) {
                return nums[i];
            }
            
            j+=2;
        }
        
        return nums[n-1];
    }
}