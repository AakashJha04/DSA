class Solution {
    public boolean isValid(char ch){
        int code = (int) ch;
        if(code >= 65 && code <= 90) return true;   // A-Z
        if(code >= 97 && code <= 122) return true;  // a-z
        if(code >= 48 && code <= 57) return true;   // 0-9
        return false;
    }

    public boolean isPal(String x){
        int i = 0;
        int j = x.length()-1;

        while(i < j){
            if(x.charAt(i) != x.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public boolean isPalindrome(String s) {
        String temp = "";
        int n = s.length();

        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(isValid(ch)){
                int code = (int) ch;

                // convert to lowercase if it's uppercase
                if(code >= 65 && code <= 90){
                    ch = (char)(code + 32);
                }

                temp = temp + ch;
            }
        }

        return isPal(temp);
    }
}
