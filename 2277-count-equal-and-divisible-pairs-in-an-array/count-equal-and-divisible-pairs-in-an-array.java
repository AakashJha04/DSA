class Solution {
    public int countPairs(int[] nums, int k) {
        int ans = 0;
        int n = nums.length;

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int num1 = nums[i];
                int num2 = nums[j];
                if(num1==num2){
                    if((i*j)%k==0){
                        ans++;
                    }
                }
            }
        }

        return ans;
    }
}