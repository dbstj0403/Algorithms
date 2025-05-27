import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        
        // 이름과 번호 매핑 해시맵
        HashMap<String, Integer> nameMap = new HashMap<>();
        
        for(int i = 0; i < friends.length; i++){
            nameMap.put(friends[i], i);
        }
        
        // 선물 지수 관리용 해시맵
        HashMap<Integer, Integer> presentNum = new HashMap<>();
        
        for(int i = 0; i < friends.length; i++){
            presentNum.put(i, 0); 
        }
        
        // 선물 주고받은 기록 저장용 배열
        int len = friends.length;
        int[][] logs = new int[len][len];
        
        for(int i = 0; i < gifts.length; i++){
            String[] log = gifts[i].split(" ");
            int from = nameMap.get(log[0]); // 준 사람 번호 가져오기
            
            int to = nameMap.get(log[1]); // 받은 사람 번호 가져오기
            
            logs[from][to]++;
            presentNum.put(from, presentNum.getOrDefault(from, 0) + 1);
            presentNum.put(to, presentNum.getOrDefault(to, 0) - 1);
        }
        
        // 받을 선물 개수 카운팅용 배열
        int[] present = new int[len];
        
        for(int i = 0; i < logs.length; i++){
            for(int j = 0; j < logs.length; j++){
                if(i == j){
                    continue;
                }
                
                if(logs[i][j] >= 0){
                    if(logs[i][j] == logs[j][i]){
                        // 선물 지수 비교
                        int n1 = presentNum.get(i);
                        int n2 = presentNum.get(j);
                        if(n1 > n2){
                            present[i]++;
                        }
                        else if(n1 < n2){
                            present[j]++;
                        }
                        logs[i][j] = -1;
                        logs[j][i] = -1;
                    }
                    if(logs[i][j] > logs[j][i]){
                        present[i]++;
                        logs[i][j] = -1;
                        logs[j][i] = -1;
                    }
                    if(logs[i][j] < logs[j][i]){
                        present[j]++;
                        logs[i][j] = -1;
                        logs[j][i] = -1;
                    }
                }
            }
        }
        
        for(int k : present){
            if(k > answer){
                answer = k;
            }
        }
        
        return answer;
    }
}