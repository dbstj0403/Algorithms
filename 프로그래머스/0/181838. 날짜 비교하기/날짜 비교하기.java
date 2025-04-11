class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        int count = 0;

        // 같은 날짜일 경우
        for (int i = 0; i < 3; i++) {
            if (date1[i] == date2[i]) {
                count++;
            }
        }
        if (count == 3) {
            return answer;  // 두 날짜가 같음
        }

        for (int i = 0; i < 3; i++) {
            if (date1[i] > date2[i]) {
                return 0; 
            } else if (date1[i] < date2[i]) {
                return 1;  
            }
        }

        return answer; 
    }
}
