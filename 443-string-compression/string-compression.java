class Solution {
    public int compress(char[] chars) {
        int right = 0;
        int left = 0;
        int n = chars.length;
        while(right<n){
            char currChar = chars[right];
            int cnt = 0;
            while(right<n && chars[right]==currChar){
                right++;
                cnt++;
            }
            chars[left++]=currChar;
            if(cnt>1){
                String cntInt = String.valueOf(cnt);
                for(char ch:cntInt.toCharArray()){
                    chars[left++]=ch;
                }
            }
        }
        return left;
    }
}