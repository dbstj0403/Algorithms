class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        char[] list = s.toCharArray();
        for(int i=0; i<s.length(); i++){
            int num = -1;
            char c = list[i];
            for(int j=0; j<i; j++){
                if(i == 0){
                    break; // 첫번째 요소는 무조건 -1 삽입
                }
                if(c == list[j]){
                    num = i - j;
                }
            }
            answer[i] = num;
        }
        
        return answer;
    }
}