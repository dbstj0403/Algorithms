import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<Integer, Integer> flagMap = new HashMap<>();
        flagMap.put(1, 3);
        flagMap.put(2, 2);
        flagMap.put(3, 1);
        flagMap.put(4, 0);
        flagMap.put(5, 1);
        flagMap.put(6, 2);
        flagMap.put(7, 3);
        
        HashMap<Character, Integer> scoreMap = new HashMap<>();
        scoreMap.put('R', 0);
        scoreMap.put('T', 0);
        scoreMap.put('C', 0);
        scoreMap.put('F', 0);
        scoreMap.put('J', 0);
        scoreMap.put('M', 0);
        scoreMap.put('A', 0);
        scoreMap.put('N', 0);
        
        for(int i = 0; i < choices.length; i++){
            if(choices[i] < 4){
                char c = survey[i].charAt(0);
                scoreMap.put(c, scoreMap.getOrDefault(c, 0) + flagMap.get(choices[i]));
            }
            else if(choices[i] > 4){
                char c = survey[i].charAt(1);
                scoreMap.put(c, scoreMap.getOrDefault(c, 0) + flagMap.get(choices[i]));
            }
            else{
                continue;
            }
        }
        
        answer += (scoreMap.get('R') >= scoreMap.get('T')) ? "R" : "T";
        answer += (scoreMap.get('C') >= scoreMap.get('F')) ? "C" : "F";
        answer += (scoreMap.get('J') >= scoreMap.get('M')) ? "J" : "M";
        answer += (scoreMap.get('A') >= scoreMap.get('N')) ? "A" : "N";

        
        return answer;
    }
}