class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);

        int i=0, j=nums.length-1;
        int minimized_maximum_pair = 0;
        while(i<j){
            minimized_maximum_pair = Math.max(nums[i]+nums[j],minimized_maximum_pair );
            i++;
            j--;
        }

        return minimized_maximum_pair;
    }
}