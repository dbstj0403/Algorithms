import java.util.*;

class Solution {
    public String solution(String s) {
        // 공백을 포함하여 단어 나누기
        String[] words = s.split(" ", -1);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            StringBuilder word = new StringBuilder(words[i]); 

            for (int j = 0; j < word.length(); j++) {
                if (j % 2 == 0) {
                    word.setCharAt(j, Character.toUpperCase(word.charAt(j)));
                } else {
                    word.setCharAt(j, Character.toLowerCase(word.charAt(j))); 
                }
            }

            words[i] = word.toString(); 
        }

        return String.join(" ", words); 
    }
}
