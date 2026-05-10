class Solution {
    public int helper(char[] strArr, int start, int end, int k) {
        if (end - start < k) {
            return 0;
        }
        int[] freq = new int[26];
        for (int i = start; i < end; i++) {
            freq[strArr[i] - 'a']++;
        }
        for (int right = start; right < end; right++) {
            if (freq[strArr[right] - 'a'] < k) {
                int j = right + 1;
                while (j < end && freq[strArr[j] - 'a'] < k) {
                    j++;
                }
                return Math.max(
                    helper(strArr, start, right, k),
                    helper(strArr, j, end, k)
                );
            }
        }
        return end - start;
    }

    public int longestSubstring(String s, int k) {
        return helper(s.toCharArray(), 0, s.length(), k);
    }
}