class Solution {
    public int maxScore(String s) {
        int ans = 0;
        int n = s.length();

        for(int i = 0; i < n - 1; i++) {
            int leftScore = 0;
            int rightScore = 0;

            for(int j = 0; j <= i; j++) {
                if(s.charAt(j) == '0') {
                    leftScore++;
                }
            }

            for(int j = i + 1; j < n; j++) {
                if(s.charAt(j) == '1') {
                    rightScore++;
                }
            }

            ans = Math.max(ans, leftScore + rightScore);
        }

        return ans;
    }
}