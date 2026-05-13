class Solution {
    public String smallestSubsequence(String s) {
        StringBuilder result = new StringBuilder();
        int n = s.length();

        int[] lastSeen = new int[26];
        boolean[] visited = new boolean[26];

        Arrays.fill(lastSeen, -1);

        for (int i = 0; i < n; i++) {
            lastSeen[s.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);
            int idx = ch - 'a';

            if (visited[idx]) {
                continue;
            }

            while (
                result.length() > 0 &&
                result.charAt(result.length() - 1) > ch &&
                i < lastSeen[result.charAt(result.length() - 1) - 'a']
            ) {

                visited[result.charAt(result.length() - 1) - 'a'] = false;

                result.deleteCharAt(result.length() - 1);
            }

            result.append(ch);
            visited[idx] = true;
        }

        return result.toString();
    }
}