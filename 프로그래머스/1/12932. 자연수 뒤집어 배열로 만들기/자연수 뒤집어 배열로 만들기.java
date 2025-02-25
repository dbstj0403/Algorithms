class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        int[] answer = new int [str.length()];
        int j = 0;
        for(int i=str.length() - 1; i>=0; i--){
            char c = str.charAt(i);
            int ic = Character.getNumericValue(c);
            answer[j] = ic;
            j++;
        }
        
        return answer;
    }
}