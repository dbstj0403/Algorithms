class Solution {
    public int solution(int[] num_list) {
        int answer = -1;
        // 첫 번째로 나오는 음수의 인덱스 리턴
        for(int i=0; i<num_list.length; i++){
            if(num_list[i] < 0){
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}