class Solution {
    public String solution(int a, int b) {
        // 2016년 a월 b일은 무슨 요일일지 리턴하기
        // 2016/1/1 -> 금요일임!
        // 2016년은 윤년 -> 2월이 29일까지 
        String[] date = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        String answer = "";
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // 1/1 로부터 며칠 떨어져 있는지 찾아야 함!
        int day = b;
        for(int i=0; i<a-1; i++){
            // 1월이라면 월 빼고 날수 비교만 해도 되므로 브레이크
            if(a == 1){
                break;
            }
            day += month[i];
        }
        
        answer += date[(day - 1) % 7];
        
        // 만약 1/20일이면 20 일 => 수요일 20 % 7 = 6
        return answer;
    }
}