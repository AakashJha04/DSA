class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";

        Arrays.sort(strs); // ["flight", "flow", "flower"]

        String firstEle = strs[0]; // "flight"
        String lastEle = strs[strs.length-1]; // "flower"

        int i = 0, j=0;

        while(i<firstEle.length() && j<lastEle.length()){
            if(firstEle.charAt(i)==lastEle.charAt(j)){
                ans += firstEle.charAt(i);
                i++;
                j++;
            }
            else{
                break;
            }
        }

        return ans;


    }
}