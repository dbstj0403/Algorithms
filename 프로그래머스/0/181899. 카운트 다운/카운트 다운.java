class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[start_num - end_num + 1];
        // start_num에서 end_num까지 1씩 감소하는 수들을 차례로 담은 리스트 반환
        int num = 0;
        for(int i=start_num; i>=end_num; i--){
            answer[num] = i;
            num++;
        }
        return answer;
    }
}