class Solution {
    static int[] fibo_arr;
    public int solution(int n) {
        fibo_arr = new int[n + 1];
        fibo_arr[0] = 0;
        fibo_arr[1] = 1;
        
        for(int i = 2; i <= n; i++) {
            fibo_arr[i] = (fibo_arr[i - 1] + fibo_arr[i - 2]) % 1234567;
        }
        
        return fibo_arr[n];
    }
}