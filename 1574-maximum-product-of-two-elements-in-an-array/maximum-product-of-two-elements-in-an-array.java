class Solution {
    public int maxProduct(int[] nums) {
        int maxElement = Integer.MIN_VALUE;
        int indexmaxElement = -1;

        for(int i=0;i<nums.length;i++){
            if(maxElement<nums[i]){
                maxElement = nums[i];
                indexmaxElement = i;
            }
        }


        int secondMaxElement = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(secondMaxElement<nums[i] && indexmaxElement!=i){
                secondMaxElement = nums[i];
            }
        }

        return (maxElement-1)*(secondMaxElement-1);



    }
}