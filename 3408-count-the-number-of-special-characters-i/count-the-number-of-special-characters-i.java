class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> lowerCases = new HashSet<>();
        Set<Character> upperCases = new HashSet<>();

        for(char ch : word.toCharArray()){
            if(Character.isLowerCase(ch)){
                lowerCases.add(ch);
            }
            else{
                upperCases.add(Character.toLowerCase(ch));
            }
        }

        int ans = 0;

        for(char c : lowerCases){
            if(upperCases.contains(c)){
                ans++;
            }
        }

        return ans;


    }
}