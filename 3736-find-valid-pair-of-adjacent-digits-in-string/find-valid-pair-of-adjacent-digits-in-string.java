class Solution {
    public String findValidPair(String s) {
        int[] tempArr = new int[10];

        int n = s.length();

        // Count frequency of each digit
        for (int k = 0; k < n; k++) {
            char x = s.charAt(k);
            tempArr[x - '0']++;
        }

        // Iterate through adjacent pairs
        for (int i = 1; i < n; i++) {
            char first = s.charAt(i - 1);
            char second = s.charAt(i);

            int firstDigit = first - '0';
            int secondDigit = second - '0';

            if (first != second && 
                tempArr[firstDigit] == firstDigit && 
                tempArr[secondDigit] == secondDigit) {
                return "" + first + second;
            }
        }

        return "";
    }
}
