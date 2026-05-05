class Solution {
    public int longestPalindrome(String s) {
        int ans = 0;
        Set<Character> seen = new HashSet<>();

        for(char s1:s.toCharArray()){
            if(seen.contains(s1)){
                seen.remove(s1);
                ans += 2;
            }
            else{
                seen.add(s1);
            }
        }

        if(seen.size()>=1){
            return ans + 1;
        }
        return ans;
    }
}