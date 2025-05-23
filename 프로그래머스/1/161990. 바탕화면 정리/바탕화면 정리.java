import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        int lux = Integer.MAX_VALUE;
        int luy = Integer.MAX_VALUE;
        int rdx = Integer.MIN_VALUE;
        int rdy = Integer.MIN_VALUE;

        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    // 가장 위, 가장 왼쪽
                    lux = Math.min(lux, i);
                    luy = Math.min(luy, j);

                    // 가장 아래, 가장 오른쪽
                    rdx = Math.max(rdx, i + 1); // +1: 끝점은 다음 칸까지
                    rdy = Math.max(rdy, j + 1);
                }
            }
        }

        return new int[]{lux, luy, rdx, rdy};
    }
}
