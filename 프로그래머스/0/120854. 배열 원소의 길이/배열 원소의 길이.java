class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length]; // 주어진 배열 길이만큼 배열 생성
        for(int i=0; i<strlist.length; i++){
            String str = strlist[i];
            int n = str.length();
            answer[i] = n;
        }
        
        return answer;
    }
}