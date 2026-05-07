class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int ans = 0;

        for(int num:nums){
            set.add(num);
        }

        for(int num:set){
            if(!set.contains(num-1)){
                int currentNum = num;
                int streak = 1;
                while(set.contains(currentNum+1)){
                    currentNum = currentNum + 1;
                    streak = streak + 1;
                }
                ans = Math.max(streak, ans);
            }
        }

        return ans;
    }
}