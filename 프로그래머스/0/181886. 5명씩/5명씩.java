import java.util.*;

class Solution {
    public String[] solution(String[] names) {
       
        ArrayList<String> names_list = new ArrayList<>();
        // 5명씩 묶어서 가장 선두의 이름을 담은 리스트 반환
        // ex : 0, 5, 10, ..
        for(int i=0; i<names.length; i++){
            if(i % 5 == 0){
                names_list.add(names[i]);
            }
        }
        return names_list.toArray(new String[0]);
    }
}