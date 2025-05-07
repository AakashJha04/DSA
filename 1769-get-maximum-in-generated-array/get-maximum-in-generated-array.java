class Solution {
    public int getMaximumGenerated(int n) {
        int[] dp = new int[n+1];
        if(n==0)return 0;
        if(n==1)return 1;
        dp[0]=0;
        dp[1]=1;
        int ans = 0;
        for(int i=2;i<=n;i++){
            if(i%2==0){
                dp[i] = dp[i/2];
                ans = Math.max(dp[i], ans);
            }
            else{
                dp[i] = dp[i/2] + dp[i/2+1];
                ans = Math.max(dp[i], ans);
            }
        }

        return ans;
        
    }
}