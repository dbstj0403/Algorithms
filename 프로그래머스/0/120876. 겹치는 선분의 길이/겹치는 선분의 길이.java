import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        Set<Integer> hash = new HashSet<>();
        int answer = 0;

        int[] overlap1 = getNum(lines[0], lines[1]);
        int[] overlap2 = getNum(lines[1], lines[2]);
        int[] overlap3 = getNum(lines[0], lines[2]);

        addRangeToSet(hash, overlap1);
        addRangeToSet(hash, overlap2);
        addRangeToSet(hash, overlap3);

        answer = hash.size();
        return answer;
    }

    private void addRangeToSet(Set<Integer> set, int[] range) {
        if (range[0] == -999) return;  // 겹침 없음

        // 반열린구간 [start, end) 으로 추가 (즉, end 미포함)
        for (int i = range[0]; i < range[1]; i++) {
            set.add(i);
        }
    }

    private int[] getNum(int[] p1, int[] p2) {
        int start = Math.max(p1[0], p2[0]); // 교집합 시작
        int end = Math.min(p1[1], p2[1]);   // 교집합 끝

        if (start < end) {
            return new int[] {start, end};
        } else {
            return new int[] {-999, -999};  // 겹침 없음
        }
    }
}
