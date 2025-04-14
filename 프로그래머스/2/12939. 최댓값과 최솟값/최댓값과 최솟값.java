import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        // 최소값 최대값 형태로 반환
        String[] list = s.split(" ");
        int[] arr = new int[list.length];
        for(int i=0; i<list.length; i++){
            arr[i] = Integer.valueOf(list[i]);
        }
        Arrays.sort(arr);
        answer = arr[0] + " " + arr[arr.length - 1];
        return answer;
    }
}