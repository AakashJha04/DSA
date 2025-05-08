class Solution {
    public String sortSentence(String s) {
        String ans = "";
        Map<Integer, String> map = new TreeMap<>();
        int i = 0;
        int k = 0;

        while (i < s.length()) {
            if (s.charAt(i) == ' ') {
                int digitPos = s.charAt(i - 1) - '0';
                String word = s.substring(k, i - 1);
                map.put(digitPos, word);
                k = i + 1;
            }
            i++;
        }

        int digitPos = s.charAt(s.length() - 1) - '0';
        String word = s.substring(k, s.length() - 1);
        map.put(digitPos, word);

        // Construct the final sentence
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            ans += entry.getValue() + " ";
        }

        return ans.trim();
    }
}
