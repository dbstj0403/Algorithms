class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        // 피자를 두 조각에서 열 조각까지 잘라줌
        // n명의 사람이 최소 한 조각 이상씩 피자를 먹도록
        // slice 만큼 조각조각 잘려 있음
        
        if(n % slice == 0){
            answer = n / slice;
        }
        else{
            answer = n / slice + 1;
        }
        
        return answer;
    }
}