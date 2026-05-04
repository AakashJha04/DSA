class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean containsOne = false;
        int n = nums.length;

        for(int num:nums){
            if(num==1){
                containsOne = true;
                break;
            }
        }

        if(containsOne == false){
            return 1;
        }

        for(int i=0;i<n;i++){
            if(nums[i]<=0){
                nums[i]=1;
            }
            if(nums[i]>n){
                nums[i]=1;
            }
        }


        for(int i=0;i<n;i++){
            int num = Math.abs(nums[i]);
            int idx = num - 1;

            if(nums[idx]<0){
                continue;
            }

            nums[idx] = nums[idx] * -1;
        }

        for(int i=0;i<n;i++){
            if(nums[i]>0){
                return i+1;
            }
        }

        return n+1;


    }
}