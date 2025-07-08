class Solution {
    public int[] solution(String s) {
        int[] answer = {0, 0};
        
        StringBuilder sb = new StringBuilder(s);
        StringBuilder practice = new StringBuilder();
        
        while (!sb.toString().equals("1")) {
            practice.setLength(0);

            for (char c : sb.toString().toCharArray()) {
                if (c == '1') {
                    practice.append(c);
                } else {
                    answer[1]++; // 제거된 0의 개수
                }
            }

            int len = practice.length(); // 0 제거 후 길이
            sb = new StringBuilder(Integer.toBinaryString(len)); // 이진수 문자열로 변환

            answer[0]++; // 변환 횟수 증가
        }
        
        return answer;
    }
}
