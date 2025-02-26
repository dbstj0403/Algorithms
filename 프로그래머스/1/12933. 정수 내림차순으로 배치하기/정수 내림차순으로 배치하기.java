import java.util.*;

class Solution {
    public long solution(long n) {
        // 1. long → String 변환
        String str = String.valueOf(n);

        // 2. 문자열을 문자 배열로 변환 후 정렬
        char[] chars = str.toCharArray();
        Arrays.sort(chars); // 오름차순 정렬

        // 3. 내림차순으로 뒤집기
        StringBuilder sb = new StringBuilder(new String(chars)).reverse();

        // 4. String → long 변환 후 반환
        return Long.parseLong(sb.toString());
    }
}
