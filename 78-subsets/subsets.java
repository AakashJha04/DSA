class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backTrack(0, nums, new ArrayList<>(), ans);
        return ans;
    }

    public void backTrack(int idx, int[] nums, List<Integer> temp, List<List<Integer>> ans){
        ans.add(new ArrayList<Integer>(temp));
        for(int i=idx;i<nums.length;i++){
            temp.add(nums[i]);
            backTrack(i+1, nums, temp, ans);
            temp.remove(temp.size()-1);
        }
    }




}