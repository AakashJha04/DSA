class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                // smallest so far
                first = num;
            } else if (num <= second) {
                // second smallest so far
                second = num;
            } else {
                // found a number greater than both first and second
                return true;
            }
        }

        return false;
    }
}
