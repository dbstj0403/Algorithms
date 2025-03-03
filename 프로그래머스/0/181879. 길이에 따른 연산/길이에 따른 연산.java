class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        // 리스트의 길이가 11 이상이면 모든 원소의 합, 이하이면 원소의 곱 리턴
        int len = num_list.length;
    
        if(len >= 11){
            int sum = 0;
            for(int i : num_list){
                sum += i;
            }
            answer = sum;
        }
        else{
            int mul = 1;
            for(int i : num_list){
                mul *= i;
            }
            answer = mul;
        }
        return answer;
    }
}