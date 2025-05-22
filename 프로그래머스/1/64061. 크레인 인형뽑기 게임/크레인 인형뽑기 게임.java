import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> resultStack = new Stack<>();
        Map<Integer, Stack<Integer>> boardMap = new HashMap<>();
        
        int len = board.length;
        
        for(int col = 0; col < len; col++){
            Stack<Integer> stack = new Stack<>();
            for(int row = len - 1; row >= 0; row--){
                if(board[row][col] != 0){
                    stack.push(board[row][col]);
                }
            }
            
            boardMap.put(col + 1, stack);
        }
        
        for(int i = 0; i < moves.length; i ++){
            int n = moves[i];
            
            if(boardMap.get(n).isEmpty()){
                continue;
            }
            
            int top = boardMap.get(n).pop();
            
            if(!resultStack.isEmpty() && top == resultStack.peek()){
                resultStack.pop();
                answer += 2;
            }
            else{
                resultStack.push(top);
            }
            
        }
      
        return answer;
    }
}