class Solution {

    class Pair{
        int a;
        int b;
        public Pair(int a, int b){
            this.a = a;
            this.b = b;
        }
        int getA(){
            return a;
        }
        int getB(){
            return b;
        }
    }

    public int maximumStrongPairXor(int[] nums) {
        int n = nums.length;
        ArrayList<Pair> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int x = nums[i];
                int y = nums[j];
                if(Math.abs(x-y)<=Math.min(x, y)){
                    arr.add(new Pair(x, y));
                }
            }
        }

        int ans = 0;
        for(int i=0;i<arr.size();i++){
            Pair curr = arr.get(i);
            int tempResult = curr.getA() ^ curr.getB();
            ans = Math.max(tempResult, ans);
        }

        return ans;
    }
}