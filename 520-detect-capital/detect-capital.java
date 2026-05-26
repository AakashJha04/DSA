class Solution {
    public boolean isCapital(char ch){
        if(ch >= 'A' && ch <= 'Z'){
            return true;
        }
        return false;
    }

    public boolean detectCapitalUse(String word) {
        int count = 0;
        int firstCount = 0;
        if(isCapital(word.charAt(0))){
            firstCount++;
        }


        for(int i=1;i<word.length();i++){
            if(isCapital(word.charAt(i))){
                count++;
            }
        }

        if((count == 0 && firstCount == 0) || ((count == word.length() - 1) && (firstCount == 1 )) || (count == 0 && firstCount == 1)){
            return true;
        }

        return false;
        
    }
}