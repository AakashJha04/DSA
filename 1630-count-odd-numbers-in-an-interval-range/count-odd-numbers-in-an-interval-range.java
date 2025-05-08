class Solution {
    public boolean oddIntegers(int n){
        if((n&1)==1)return true;
        return false;
    }

    public int countOdds(int low, int high) {
        int count = 0;
        for(int i=low;i<=high;i++){
            if(oddIntegers(i)==true){
                count++;
            }
        }
        return count;
    }
}