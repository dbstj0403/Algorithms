import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
       
        // 아직 마치지 못한 일들을 순서대로 담은 문자열 배열 리턴
        ArrayList<String> todoList = new ArrayList<>();
        for(int i=0; i<finished.length; i++){
            if(finished[i] == false){
                todoList.add(todo_list[i]);
            }
        }
        
        return todoList.toArray(new String[0]);
    }
}