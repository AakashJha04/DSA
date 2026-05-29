class Solution {

    public int toDigit(int n){
        int number = 0;
        int sumOfDigit = 0;
        while(n>0){
            number = n%10;
            sumOfDigit += number;
            n = n/10;
        }
        return sumOfDigit;
    }
    public int minElement(int[] nums) {
        int minVal = 10000;
        for(int i=0;i<nums.length;i++){
            minVal = Math.min(minVal,  toDigit(nums[i]));
        }
        return minVal;
    }
}