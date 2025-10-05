class Solution {
    public int commonFactors(int a, int b) {
        int till = Math.min(a, b);
        int ans = 1;

        for(int i=2;i<=till; i++){
            if(a%i==0 && b%i==0){
                ans++;
            }
        }

        return ans;
    }
}