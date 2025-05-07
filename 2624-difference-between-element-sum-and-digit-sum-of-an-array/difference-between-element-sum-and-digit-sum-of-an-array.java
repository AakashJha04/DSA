class Solution {
    public int sum(int [] nums){
        int ans = 0;
        for(int num:nums){
            ans+=num;
        }
        return ans;
    }

    public int digitSum(int[] nums){
        int ans = 0;
        for(int num:nums){
            while(num>0){
                ans+=num%10;
                num=num/10;
            }
        }
        return ans;
    }



    public int differenceOfSum(int[] nums) {
        return Math.abs(sum(nums) - digitSum(nums));
    }
}