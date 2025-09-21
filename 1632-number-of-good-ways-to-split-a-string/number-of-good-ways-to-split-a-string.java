class Solution {
    public int numSplits(String s) {
        int n = s.length();
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int count = 0;

        for(int i=0;i<n;i++){
            set1.add(s.charAt(i));
            prefix[i] = set1.size();
        }

        for(int i=n-1;i>=0;i--){
            set2.add(s.charAt(i));
            suffix[i] = set2.size();
        }

        for(int i=1;i<n;i++){
            if(prefix[i-1]==suffix[i]){
                count++;
            }
        }

        return count;
    }
}