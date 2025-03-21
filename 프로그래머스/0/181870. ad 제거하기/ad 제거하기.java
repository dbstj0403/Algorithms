import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> list = new ArrayList<>();
        // 문자열 중 "ad"라는 부분 문자열을 포함한 모든 문자열 제거 후 반환
        for(int i=0; i<strArr.length; i++){
            if(strArr[i].contains("ad")){
                continue;
            }
            else{
                list.add(strArr[i]);
            }
        }
        return list.toArray(new String[0]);
    }
}