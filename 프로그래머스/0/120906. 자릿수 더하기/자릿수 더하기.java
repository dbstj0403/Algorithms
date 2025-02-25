class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = String.valueOf(n);
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            int num = Character.getNumericValue(c);
            answer += num;
        }
        return answer;
    }
}