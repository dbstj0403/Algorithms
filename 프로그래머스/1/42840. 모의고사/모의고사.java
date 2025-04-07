import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        // 수포자 삼인방은 모의고사 문제 모두 찍으려고 함.
        // 1번 수포자 : 1 - 2 - 3 - 4 - 5
        // 2번 수포자 : 2 - 1 - 2 - 3 - 2 - 4 - 2 - 5
        // 3번 수포자 : 3 - 3 - 1 - 1 - 2 - 2 - 4 - 4 - 5 - 5
        int[] num1 = {1, 2, 3, 4, 5};
        int[] num2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] num3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int score1 = 0;
        int score2 = 0;
        int score3 = 0;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<answers.length; i++){
            if(answers[i] == num1[i % num1.length]){
                score1++;
            }
            
            if(answers[i] == num2[i % num2.length]){
                score2++;
            }
            
            if(answers[i] == num3[i % num3.length]){
                score3++;
            }
        }
        
        int max = Math.max(score1, Math.max(score2, score3));
        
        if(score1 == max){
            list.add(1);
        }
        if(score2 == max){
            list.add(2);
        }
        if(score3 == max){
            list.add(3);
        }
        
        int[] answer = new int [list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}