class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        // 원래 price원, N번째 이용시 원래 이용료의 N배
        // 얼마가 모자라는지 구하기
        
        long sum = 0;
        for(int i=1; i<=count; i++){
            sum += price * i;
        }
        System.out.print(sum);
        if(sum > money){
            answer = sum - money;
        }
        else{
            answer = 0;
        }

        return answer;
    }
}