import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++){
            int[] command = commands[i];
            int[] sliced = Arrays.copyOfRange(array, command[0] - 1, command[1]);
            Arrays.sort(sliced);
            int target = sliced[command[2] - 1];
            answer[i] = target;
        }
        
        return answer;
    }
}