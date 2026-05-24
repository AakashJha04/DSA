class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        backTrack(1, ans, new ArrayList<>(), k, n);
        return ans;
    }

    public void backTrack(int idx,List<List<Integer>> ans, ArrayList<Integer> temp, int k, int n){
        if(k==0 && n==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(k<0 || n<0){
            return;
        }
        for(int i=idx;i<=9;i++){
            temp.add(i);
            backTrack(i+1, ans, temp, k-1, n-i);
            temp.remove(temp.size()-1);
        }
    }
}