class Solution {
    public int sumBase(int n, int k) {
        if(n == 0){
            return 0;
        }
        int rem = n % k; //base k not take 10
        return rem + sumBase(n/k ,k);
    }
}