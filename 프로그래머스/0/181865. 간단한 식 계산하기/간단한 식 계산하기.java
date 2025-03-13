class Solution {
    public int solution(String binomial) {
        int answer = 0;
        // 주어진 식을 계산한 정수 리턴
        String[] parts = binomial.split(" "); // 공백에 따라 구분
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[2]);
        String op = parts[1];
        if(op.equals("+")){
            answer = a + b;
        }
        else if(op.equals("-")){
            answer = a - b;
        }
        else{
            answer = a * b;
        }
        return answer;
    }
}