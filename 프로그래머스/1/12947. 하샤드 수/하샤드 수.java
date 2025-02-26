class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int count = 0;
        int num = x;
        // 하샤드 수 = x의 자릿수의 합으로 x가 나누어져야 함
        if(x <= 10){
            if(x % x == 0){
                return true;
            }
            else{
                return false;
            }
        }
        
        while(x > 10){
            int n = x % 10;
            count += n;
            x /= 10;
        }
        count += x;
        if(num % count == 0 && count > 0){
            answer = true;
        }
        else{
            answer = false;
        }
        
        return answer;
    }
}