class Solution {
    public int maxArea(int[] height) {
        int ans = 0;
        int i = 0;
        int n = height.length;
        int j = n - 1;

        while(i<j){
            int width = j-i;
            ans = Math.max(ans, Math.min(height[i], height[j]) * width);
            if(height[i]<height[j]){
                i++;
            }
            else if(height[i]>height[j]){
                j--;
            }
            else{
                i++;
                j--;
            }
        }

        return ans;
    }
}