class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");
        int n = words.length;
        for(int i=0;i<n;i++){
            String currWord = words[i];
            String nextWord = words[(i+1)%n];
            char lastCharacterOfCurrWord = currWord.charAt(currWord.length()-1);
            char firstCharacterOfnextWord = nextWord.charAt(0);
            if(lastCharacterOfCurrWord!=firstCharacterOfnextWord){
                return false;
            }
        }
        return true;
    }
}