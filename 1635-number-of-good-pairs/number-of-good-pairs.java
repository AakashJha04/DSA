// class Solution {
//     public int numIdenticalPairs(int[] nums) {
//         Map<Integer, Integer> map = new HashMap<>();

//         for(int i=0;i<nums.length;i++){
//             map.put(i, nums[i]);
//         }

//         for(Map.Entry m: map.getEntry()){
//             int x = m.getValue();
//             if(x == map.find())
//         }
//     }
// }


class Solution {
    public int numIdenticalPairs(int[] nums) {
        int cnt = 0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}