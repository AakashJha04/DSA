class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }

        int longest_cnt = 0;

        for(int n : set){  // iterate over set, avoids duplicates
            // Only start when n is the beginning of a sequence
            if(!set.contains(n - 1)){
                int curr = n;
                int cnt = 1;

                while(set.contains(curr + 1)){
                    curr++;
                    cnt++;
                }

                longest_cnt = Math.max(longest_cnt, cnt);
            }
        }

        return longest_cnt;
    }
}
