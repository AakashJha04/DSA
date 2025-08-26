class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        long cnt = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                cnt++;
                ans += cnt;
            } else {
                cnt = 0;
            }
        }

        return ans;
    }
}