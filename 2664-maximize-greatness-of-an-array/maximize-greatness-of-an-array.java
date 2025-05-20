class Solution {
    /*
    public int nextGreaterElement(int[] nums){
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int countOfNextGreaterElement = 0;
        st.add(nums[n-1]);

        for(int i=n-2;i>=0;i--){
            int currElement = nums[i];
            while(!st.isEmpty() && currElement >= st.peek()){
                st.pop();
            }
            if(!st.isEmpty()){
                countOfNextGreaterElement++;
            }
            st.add(currElement);
        }
        return countOfNextGreaterElement;
    }
    */

    public int maximizeGreatness(int[] nums) {
        // return nextGreaterElement(nums);
        Arrays.sort(nums);
        int countOfNextGreaterElement = 0;
        int i = 0,j=0,n=nums.length;

        while(j<n){
            if(nums[i]<nums[j]){
                countOfNextGreaterElement++;
                i++;
            }
            j++;
        }

        return countOfNextGreaterElement;
    }
}