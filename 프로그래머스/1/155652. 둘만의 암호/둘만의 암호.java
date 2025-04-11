import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        return changeString(s, skip, index);
    }

    public String changeString(String s, String skip, int index){
        StringBuilder sb = new StringBuilder();
        Set<Character> skipSet = new HashSet<>();
        for (int i = 0; i < skip.length(); i++) {
            skipSet.add(skip.charAt(i)); 
        }

        for(char c : s.toCharArray()) {
            int moved = 0;
            char next = c;

            while (moved < index) {
                next++;
                if (next > 'z') next = 'a';
                if (skipSet.contains(next)) continue;
                moved++;
            }

            sb.append(next);
        }

        return sb.toString();
    }
}
