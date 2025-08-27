class Solution {
    public String convert(String s, int numRows) {
        String[] ans = new String[numRows];
        for(int i=0;i<numRows;i++){
            ans[i] = "";
        }

        int i = 0;
        int n = s.length();

        while(i<n){
            for(int j=0;j<numRows && i<n;j++){
                ans[j] += s.charAt(i);
                i++;
            }
            for(int j=numRows-2;j>0 && i<n;j--){
                ans[j] += s.charAt(i);
                i++;
            }
        }

        String result = "";

        for(String data: ans){
            result += data;
        }

        return result;
    }
}