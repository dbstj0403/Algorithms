import java.util.*;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int maxTime = attacks[attacks.length - 1][0];
        int currentHP = health;
        int bandageGauge = 0;   // 연속 시전 카운트
        int atkIdx = 0;

        for (int t = 0; t <= maxTime; t++) {
            if (atkIdx < attacks.length && t == attacks[atkIdx][0]) {
                currentHP -= attacks[atkIdx][1]; 
                bandageGauge = 0;               
                atkIdx++;

                if (currentHP <= 0) return -1;   
            } else {
                currentHP = Math.min(health, currentHP + bandage[1]);
                bandageGauge++;

                if (bandageGauge == bandage[0]) {
                    currentHP = Math.min(health, currentHP + bandage[2]);
                    bandageGauge = 0;
                }
            }
        }
        return currentHP;
    }
}
