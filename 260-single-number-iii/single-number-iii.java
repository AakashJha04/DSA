class Solution {
    public int[] singleNumber(int[] nums) {
        int res = 0;
        for (int n : nums) {
            res ^= n;
        }

        int rightMostSetBit = res & (~res + 1);
        int[] ans = new int[2];

        for (int n : nums) {
            if ((n & rightMostSetBit) != 0) {
                ans[0] ^= n;
            } else {
                ans[1] ^= n;
            }
        }

        return ans;
    }
}