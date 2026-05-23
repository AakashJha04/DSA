class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), ans);
        return ans;
    }

    void backtrack(int[] nums, int idx, List<Integer> curr, List<List<Integer>> ans){
        ans.add(new ArrayList<>(curr));
        for(int i=idx;i<nums.length;i++){
            curr.add(nums[i]);
            System.out.println("TAKE:" + curr);
            backtrack(nums, i+1, curr, ans);
            System.out.println("NOT TAKE:" + curr);
            curr.remove(curr.size()-1);
        }
    }
}