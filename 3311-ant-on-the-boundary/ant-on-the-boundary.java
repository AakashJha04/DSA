class Solution {
    public int returnToBoundaryCount(int[] nums) {
        
        int curr_sum = 0;
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            curr_sum = curr_sum + nums[i];
            if(curr_sum==0){
                ans++;
            }
        }
        return ans;

    }
}