class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] point = new int[2];

        int h = park.length;              // 세로
        int w = park[0].length();         // 가로

        char[][] board = new char[h][w];

        for (int i = 0; i < h; i++) {
            board[i] = park[i].toCharArray();
        }

        // 시작점 찾기
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (board[i][j] == 'S') {
                    point[0] = i;
                    point[1] = j;
                }
            }
        }

        for (String route : routes) {
            String[] commands = route.split(" ");
            String dir = commands[0];
            int move = Integer.parseInt(commands[1]);

            int nx = point[0];
            int ny = point[1];

            boolean canMove = true;

            for (int m = 1; m <= move; m++) {
                if (dir.equals("E")) {
                    ny = point[1] + m;
                } else if (dir.equals("W")) {
                    ny = point[1] - m;
                } else if (dir.equals("S")) {
                    nx = point[0] + m;
                } else if (dir.equals("N")) {
                    nx = point[0] - m;
                }

                if (nx < 0 || nx >= h || ny < 0 || ny >= w || board[nx][ny] == 'X') {
                    canMove = false;
                    break;
                }
            }

            if (canMove) {
                point[0] = nx;
                point[1] = ny;
            }
        }

        return point;
    }
}
