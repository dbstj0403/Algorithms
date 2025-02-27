class Solution {
    public int solution(String str1, String str2) {
        int answer = 2;
        // 문자열이 포함되어 있는지 확인할 때는 .contains() 메서드를 사용하자
        
        return str1.contains(str2) ? 1 : 2;
    }
}