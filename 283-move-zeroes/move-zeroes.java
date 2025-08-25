class Solution {
    public void swap(int x, int y, int[] arr) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int pt = 0;

        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                swap(i, pt, nums);
                pt++;
            }
        }   
    }
}