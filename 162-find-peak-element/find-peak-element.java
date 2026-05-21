class Solution {
    public int findPeakElement(int[] nums) {

        int l = 0;
        int h = nums.length - 1;

        while(l <= h) {

            int mid = l + (h - l) / 2;

            int left = (mid == 0) ? Integer.MIN_VALUE : nums[mid - 1];

            int right = (mid == nums.length - 1) ? Integer.MIN_VALUE : nums[mid + 1];

            if(nums[mid] >= left && nums[mid] >= right) {
                return mid;
            }
            else if(nums[mid] < right) {
                l = mid + 1;
            }
            else {
                h = mid - 1;
            }
        }

        return -1;
    }
}