class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder();
        int rows = my_string.length() / m;
        String[][] result = new String[rows][m];
        String[] list = my_string.split("");
        
        // 2차원 배열 채우기
        int idx = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < m; j++) {
                result[i][j] = list[idx++];
            }
        }

        for (int i = 0; i < rows; i++) {
            answer.append(result[i][c - 1]);
        }

        return answer.toString();
    }
}
