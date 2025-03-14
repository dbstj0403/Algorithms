class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        // 콜라를 받기 위해 마트에 주어야 하는 병 수 a
        // 빈 병 a개를 갖다 주면 마트가 주는 콜라 병 수 b
        // 상빈이가 가지고 있는 빈 병의 개수 n
        while(n >= a){
            int temp = n;
            n = n % a;
           
            answer += temp / a * b; // 교환시 받는 병 수 
           
            n = n + (temp / a * b);
           
        }
        return answer;
    }
}