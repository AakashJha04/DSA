class Solution {
    public int minimumSum(int num) {
        int[] store = new int[4];
        int temp = num;
        int i=0;
        
        while(temp>0){
            store[i] = temp%10;
            temp = temp/10;
            i++;
        }

        Arrays.sort(store);
        
        int num1 = store[0]*10+store[2];
        int num2 = store[1]*10+store[3]; 

        return num1+num2;
        
    }
}