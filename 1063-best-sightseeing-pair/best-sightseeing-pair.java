class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int maxIthValue = values[0];
        int result = 0;

        for(int j=1;j<values.length;j++){
            int curr = values[j]-j;
            result = Math.max(result, maxIthValue + curr);
            maxIthValue = Math.max(maxIthValue, values[j]+j);
        }

        return result;
    }
}