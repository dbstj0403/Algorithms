class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int n = board.length;
        int count = 0;
        int[] dw = {0, 1, -1, 0}; // 위 오른쪽 왼쪽 아래 체크용
        int[] dh = {1, 0, 0, -1};
        for(int i=0; i<=3; i++){
            int h_check = h + dh[i];
            int w_check = w + dw[i];
            System.out.println(h_check);
            System.out.println(w_check);
            if(h_check >= 0 && h_check < n){
                if(w_check >= 0 && w_check < n){
                    if(board[h][w].equals(board[h_check][w_check])){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}