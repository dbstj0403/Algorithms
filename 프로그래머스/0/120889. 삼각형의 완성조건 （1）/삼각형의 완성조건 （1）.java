class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int n = 0;
        for(int i=1; i<3; i++){
            if(sides[n] < sides[i]){
                n = i;
            }
        }
        
        int sum = 0;
        for(int i=0; i<3; i++){
            if(i != n){
                sum += sides[i];
            }
        }
        
        if(sides[n] > sum){
            answer = 2;
        }
        else if(sides[n] == sum){
            answer = 2;
        }
        else{
            answer = 1;
        }
      
        return answer;
    }
}