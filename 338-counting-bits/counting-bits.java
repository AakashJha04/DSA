class Solution {
    public int countBit(int x){
        int ans = 0;
        while(x>0){
            int cnt = x & 1;
            if(cnt==1){
                ans++;
            }
            x = x >> 1;
        }
        return ans;
    }
    public int[] countBits(int n) {
        int[] ans = new int[n+1];

        for(int j=0;j<=n;j++){
            ans[j] = countBit(j);
        }
        return ans;
    }
}