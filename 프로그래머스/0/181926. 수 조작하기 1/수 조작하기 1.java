class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        // control => w, a, s, d로 이루어짐
        for(int i=0; i<control.length(); i++){
            char c = control.charAt(i);
            if(c == 'w'){
                n += 1;
            }
            else if(c == 's'){
                n -= 1;
            }
            else if(c == 'd'){
                n += 10;
            }
            else {
                n -= 10;
            }
        }
        
        answer = n;
        
        return answer;
    }
}