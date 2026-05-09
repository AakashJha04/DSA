class Solution {
    public String getActualStr(String input){
        int n = input.length();
        StringBuilder actualString = new StringBuilder();
        int hashCount = 0;
        for(int i = n-1;i>=0;i--){
            if(input.charAt(i)=='#'){
                hashCount++;
                continue;
            }
            if(hashCount>0){
                hashCount--;
            }
            else{
                actualString.insert(0, input.charAt(i));
            }
        }
        return actualString.toString();
    }

    public boolean backspaceCompare(String s, String t) {
        return getActualStr(s).equals(getActualStr(t));
    }
}