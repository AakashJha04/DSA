class Solution {
    public int firstOcc(int[] nums, int target){
        int l = 0, h=nums.length-1;
        int lowIdx = -1;
        while(l<=h){
            int mid = l + (h-l)/2;
            if(nums[mid]==target){
                lowIdx = mid;
                h = mid-1;
            }
            else if(nums[mid]>target){
                h = mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return lowIdx;
    }

    public int lastOcc(int[] nums, int target){
        int l = 0, h=nums.length-1;
        int highIdx = -1;
        while(l<=h){
            int mid = l + (h-l)/2;
            if(nums[mid]==target){
                highIdx = mid;
                l = mid+1;
            }
            else if(nums[mid]<target){
                l = mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return highIdx;
    }

    public int[] searchRange(int[] nums, int target) {
        int a = firstOcc(nums, target);
        int b = lastOcc(nums, target);

        return new int[]{a, b};
    }
}