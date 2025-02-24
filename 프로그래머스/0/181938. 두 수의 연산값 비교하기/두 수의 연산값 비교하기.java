class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String sa = String.valueOf(a);
        String sb = String.valueOf(b);
        
        String sab = sa + sb;
        String sba = sb + sa;
        
        int iab = Integer.valueOf(sab);
        int iba = Integer.valueOf(sba);
        
        if(iab > 2*a*b){
            answer = iab;
        }
        else if (iab == 2*a*b){
            answer = iab;
        }
        else{
            answer = 2*a*b;
        }
        
        return answer;
    }
}