import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, ArrayList<Integer>> map = new HashMap<>();
        HashMap<String, Integer> playCountMap = new HashMap<>();
        ArrayList<Integer> best = new ArrayList<>();

        // 장르별 고유번호 저장 및 장르별 총 재생수 카운트
        for (int i = 0; i < genres.length; i++) {
            map.putIfAbsent(genres[i], new ArrayList<>());
            map.get(genres[i]).add(i);
            playCountMap.put(genres[i], playCountMap.getOrDefault(genres[i], 0) + plays[i]);
        }

        // 장르별 총 재생수 내림차순으로 장르 정렬
        List<String> genreOrder = new ArrayList<>(playCountMap.keySet());
        genreOrder.sort((a, b) -> playCountMap.get(b) - playCountMap.get(a));

        // 각 장르별 상위 2곡 선택
        for (String genre : genreOrder) {
            List<Integer> songList = map.get(genre);

            // 재생수 기준 내림차순, 재생수가 같으면 고유번호 오름차순 정렬
            songList.sort((a, b) -> {
                if (plays[b] == plays[a]) {
                    return a - b;
                } else {
                    return plays[b] - plays[a];
                }
            });

            // 상위 2곡만 추가
            for (int i = 0; i < Math.min(2, songList.size()); i++) {
                best.add(songList.get(i));
            }
        }

        // ArrayList → int[] 변환
        int[] answer = new int[best.size()];
        for (int i = 0; i < best.size(); i++) {
            answer[i] = best.get(i);
        }
        return answer;
    }
}
