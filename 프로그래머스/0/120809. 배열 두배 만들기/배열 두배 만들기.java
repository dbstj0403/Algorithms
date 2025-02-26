class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        // 각 원소를 두배한 원소를 가진 배열 리턴
        int i = 0;
        for(int n : numbers){
            int k = n * 2;
            answer[i] = k;
            i++;
        }
        return answer;
    }
}