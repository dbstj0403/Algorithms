class Solution {
    public int solution(int price) {
        int answer = 0;
        if(price >= 100000 && price < 300000){
            price = price * 95 / 100;
        }
        else if(price >= 300000 && price < 500000){
            price = price * 90 / 100;
        }
        else if(price >= 500000){
            price = price * 80 / 100;
        }
        
        answer = price;
        
        return answer;
    }
}