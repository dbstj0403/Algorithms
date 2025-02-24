class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int sum1 = 0; // 원소들의 합 
        int sum2 = 1; // 원소들의 곱
        
        for(int i=0; i<num_list.length; i++){
            int num = num_list[i];
            sum1 += num;         
            sum2 *= num;
        }
        
        if(sum1*sum1 > sum2){
            answer = 1;
        }
        else{
            answer = 0;
        }
        
        return answer;
    }
}