import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        HashMap<String, Integer> nameMap = new HashMap<>();
        HashMap<String, HashSet<String>> logsMap = new HashMap<>();
        
        for(int i = 0; i < id_list.length; i++){
            nameMap.put(id_list[i], i);
            logsMap.put(id_list[i], new HashSet<>());
        }
        
        // 중복 신고 제거 (한 사람이 동일인을 여러 번 신고한 것 방지)
        HashSet<String> reportSet = new HashSet<>(Arrays.asList(report));
        
        for(String rep : reportSet){
            String[] report_log = rep.split(" ");
            String take = report_log[0];
            String taken = report_log[1];
            logsMap.get(taken).add(take);
        }

        // 정지 대상자 처리
        for (String reportedUser : logsMap.keySet()) {
            HashSet<String> reporters = logsMap.get(reportedUser);
            if (reporters.size() >= k) {
                for (String reporter : reporters) {
                    int idx = nameMap.get(reporter);
                    answer[idx]++;
                }
            }
        }
        
        return answer;
    }
}
