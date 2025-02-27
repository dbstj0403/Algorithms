class Solution {
    public int[] solution(int[] array) {
        int[] answer = {0, 0};
        // 가장 큰 수와 그 수의 인덱스를 담은 배열 리턴
        int max = array[0];
        for(int i=0; i<array.length; i++){
            if(array[i] > max){
                max = array[i];
                answer[1] = i;
            }
        }
        answer[0] = max;
        return answer;
    }
}