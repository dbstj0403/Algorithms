class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder("");
        // 대문자는 소문자로, 소문자는 대문자로 변환
        for(char c : my_string.toCharArray()){
            // 대소문자 구별 -> Character.isUpperCase() / isLowerCase()
            if(Character.isUpperCase(c)){
                sb.append(Character.toLowerCase(c));
            }
            else{
                sb.append(Character.toUpperCase(c));
            }
        }
        
        return sb.toString();
    }
}