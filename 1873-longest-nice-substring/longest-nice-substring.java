class Solution {
    public String longestNiceSubstring(String s) {
        int n = s.length();

        if(n<2){
            return "";
        }

        Set<Character> set = new HashSet<>();

        for(char ch:s.toCharArray()){
            set.add(ch);
        }
        int toBeDivided = 0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(set.contains(Character.toLowerCase(ch)) && set.contains(Character.toUpperCase(ch)) ){
                continue;
            }
            String leftPart = longestNiceSubstring(s.substring(0, i));
            String rightPart = longestNiceSubstring(s.substring(i+1));
            return leftPart.length() >= rightPart.length() ? leftPart : rightPart;
        }
        return s;
    }
}