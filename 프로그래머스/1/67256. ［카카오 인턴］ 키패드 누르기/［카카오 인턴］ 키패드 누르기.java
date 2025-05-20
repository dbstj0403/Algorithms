import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();

        Map<Integer, int[]> pos = new HashMap<>();
        pos.put(1, new int[]{0, 0});
        pos.put(2, new int[]{0, 1});
        pos.put(3, new int[]{0, 2});
        pos.put(4, new int[]{1, 0});
        pos.put(5, new int[]{1, 1});
        pos.put(6, new int[]{1, 2});
        pos.put(7, new int[]{2, 0});
        pos.put(8, new int[]{2, 1});
        pos.put(9, new int[]{2, 2});
        pos.put(0, new int[]{3, 1});

        int[] leftPos = {3, 0};
        int[] rightPos = {3, 2};

        List<Integer> leftKeys = Arrays.asList(1, 4, 7);
        List<Integer> rightKeys = Arrays.asList(3, 6, 9);

        for (int number : numbers) {
            if (leftKeys.contains(number)) {
                sb.append("L");
                leftPos = pos.get(number);
            } else if (rightKeys.contains(number)) {
                sb.append("R");
                rightPos = pos.get(number);
            } else {
                int[] target = pos.get(number);
                int leftDist = getDistance(leftPos, target);
                int rightDist = getDistance(rightPos, target);

                if (leftDist < rightDist) {
                    sb.append("L");
                    leftPos = target;
                } else if (rightDist < leftDist) {
                    sb.append("R");
                    rightPos = target;
                } else {
                    if (hand.equals("left")) {
                        sb.append("L");
                        leftPos = target;
                    } else {
                        sb.append("R");
                        rightPos = target;
                    }
                }
            }
        }

        return sb.toString(); 
    }

    private int getDistance(int[] a, int[] b) {
        return Math.abs(a[0] - b[0]) + Math.abs(a[1] - b[1]);
    }
}
