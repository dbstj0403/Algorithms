class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1]; // 4개 배열
        int n = num_list.length; // 3
        int last = num_list[n - 1]; // num_list[2]
        int beforeLast = num_list[n - 2]; // num_list[1]
        
        // 기존 요소 복사
        for(int i=0; i<answer.length - 1; i++){
            answer[i] = num_list[i];
        }
        
        if(last > beforeLast){
            answer[n] = last - beforeLast;
        }
        else{
            answer[n] = last * 2;
        }
        return answer;
    }
}