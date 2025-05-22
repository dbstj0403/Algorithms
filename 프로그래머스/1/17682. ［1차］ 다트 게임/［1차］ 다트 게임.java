import java.util.*;
import java.util.regex.*;

class Solution {
    public int solution(String dartResult) {
        Pattern pattern = Pattern.compile("(\\d{1,2})([SDT])([*#]?)");
        Matcher matcher = pattern.matcher(dartResult);
        
        List<Integer> scores = new ArrayList<>();
        
        int idx = 0;
        while (matcher.find()) {
            int score = Integer.parseInt(matcher.group(1));
            String bonus = matcher.group(2);
            String option = matcher.group(3);
            
            switch (bonus) {
                case "S": score = (int) Math.pow(score, 1); break;
                case "D": score = (int) Math.pow(score, 2); break;
                case "T": score = (int) Math.pow(score, 3); break;
            }
            
            if (option.equals("*")) {
                score *= 2;
                if (idx > 0) {
                    scores.set(idx - 1, scores.get(idx - 1) * 2);
                }
            } else if (option.equals("#")) {
                score *= -1;
            }
            
            scores.add(score);
            idx++;
        }
        
        // 총합 계산
        int answer = scores.stream().mapToInt(Integer::intValue).sum();
        return answer;
    }
}
