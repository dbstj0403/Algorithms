class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int cp = 0;
        int cy = 0;
        // 문자열 순회시 toCharArray() 메서드 사용
        for(char c : s.toCharArray()){
            if(c == 'p' || c == 'P'){
                cp++;
            }
            else if(c == 'y' || c == 'Y'){
                cy++;
            }
        }
        
        if(cp == cy){
            answer = true;
        }
        else if(cp == 0 && cy == 0){
            answer = true;
        }
        else{
            answer = false;
        }

        return answer;
    }
}