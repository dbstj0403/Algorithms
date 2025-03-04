class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];
        // 첫번째 원소부터 n번째 원소까지의 모든 원소를 담은 리스트 반환
        for(int i=0; i<n; i++){
            answer[i] = num_list[i];
        }
        return answer;
    }
}