class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        for(int i=0; i<num_list.length; i++){
            int num = num_list[i];
            if(n == num){
                answer = 1;
            }
        }
        return answer;
    }
}