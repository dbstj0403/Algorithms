class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        // 모서리의 길이 n, 상자의 가로 세로 높이가 들어있는 배열 box
        int a = box[0] / n;
        int b = box[1] / n;
        int c = box[2] / n;
        answer = a * b * c;
        return answer;
    }
}