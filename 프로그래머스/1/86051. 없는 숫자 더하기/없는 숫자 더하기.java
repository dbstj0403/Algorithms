class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        // 0~9 중 일부가 들어있는 배열 에서 찾을 수 없는 숫자를 모두 더한 수를 리턴
        int n = numbers.length; // numbers의 길이
        for(int i : numbers){
            answer -= i;
        }
        
        return answer;
    }
}