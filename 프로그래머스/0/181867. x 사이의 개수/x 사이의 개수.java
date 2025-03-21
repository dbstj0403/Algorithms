import java.util.*;

class Solution {
    public int[] solution(String myString) {
        ArrayList<Integer> list = new ArrayList<>();
        // x를 기준으로 나눈 문자열의 길이를 담은 배열 반환
        String[] arr = myString.split("x");
        for(int i=0; i<arr.length; i++){
            list.add(arr[i].length());
        }
        
        char[] chars = myString.toCharArray();
        if(chars[myString.length() - 1] == 'x'){
            list.add(0);
        }
        
        int[] answer = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}