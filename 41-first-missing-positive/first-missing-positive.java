class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean containsOne = false;

        // check if one is present in the array if it is then return it.
        for(int i=0;i<n;i++){
            if(nums[i]==1)containsOne = true;
        }

        if(containsOne==false)return 1;

        // if any element is greater than n or less than 1 then update it with 1.
        for(int i=0;i<n;i++){
            if(nums[i]>n || nums[i]<=0){
                nums[i]=1;
            }
        }

        // Apply logic and update the final nums array
        for(int i=0;i<n;i++){
            int number = Math.abs(nums[i]);
            int idx = number - 1;
            if(nums[idx]>0){
                nums[idx] = -1 * nums[idx];
            }
        }

        // return the smallest number
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                return i+1;
            }
        }

        // return n+1.
        return n+1;









    }
}