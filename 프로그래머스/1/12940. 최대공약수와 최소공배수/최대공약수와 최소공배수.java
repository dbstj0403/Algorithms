class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        // 두 수의 최대공약수와 최소공배수 반환
        // 최대공약수 구하기
        int max = 0;
        if(n > m){
            max = n;
        }
        else{
            max = m;
        }
        int k = 0;
        for(int i=1; i<max; i++){
            if(n % i == 0 && m % i == 0){
                if(i > k){
                    k = i;
                }
            }
        }
        answer[0] = k;
        
        // 최소공배수 구하기
        int y = n * m;
        int min = n * m;
        for(int i=1; i<y; i++){
            if(i % n == 0 && i % m == 0){
                if(i < min){
                    min = i;
                }
            }
        }
        answer[1] = min;
        return answer;
    }
}