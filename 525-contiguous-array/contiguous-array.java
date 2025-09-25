class Solution {
    public int findMaxLength(int[] nums) {
        
        /*
        // steps of algorithm 
        1. replace 0 with -1
        2. maintain a prefix_sum or running_sum 
        3. take a hashmap having key as prefix_sum and value has index of cuurent    
        prefix_sum
        4. maintain an answer variable
        4. traverse the loop if the prefix_sum is present in hashmap the update the 
        answer with (idx - hashmap[prefix_sum])  
        */


        int [] temp = new int[nums.length];
        int n = temp.length;

        // step 1:
        for(int i=0;i<temp.length;i++){
            if(nums[i]==1){
                temp[i] = 1;
            }
            else{
                temp[i] = -1;
            }
        }

        Map<Integer, Integer> map = new HashMap<>();
        int prefix_sum = 0;
        int ans = 0;
        map.put(0,-1);

        for(int i=0;i<n;i++){
            prefix_sum += temp[i];
            if(map.containsKey(prefix_sum)){
                ans = Math.max(ans, i - map.get(prefix_sum));
            }
            else{
                map.put(prefix_sum, i);
            }
        }

        return ans;



        
    }
}