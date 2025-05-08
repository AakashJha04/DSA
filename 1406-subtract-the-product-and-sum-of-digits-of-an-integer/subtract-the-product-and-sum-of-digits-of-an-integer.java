class Solution {
    public int product(int n){
        int prod = 1;
        while(n>0){
            prod = (prod) * (n%10) ;
            System.out.println(prod);
            n = n / 10;
        }
        // System.out.println(prod);
        return prod;
    }

    public int sum(int n){
        int sum = 0;
        while(n>0){
            sum = sum + n%10;
            n = n / 10;
        }
        System.out.println("----" + sum);
        return sum;
    }

    public int subtractProductAndSum(int n) {
        return product(n)-sum(n);
    }
}