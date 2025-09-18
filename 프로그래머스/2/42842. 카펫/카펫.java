class Solution {
    public int[] solution(int brown, int yellow) {
        int sum = brown + yellow;

        for (int height = 3; height <= Math.sqrt(sum); height++) {
            if (sum % height == 0) { // 약수인지 확인
                int width = sum / height;

                // 안쪽 노란색 칸 개수 확인
                if ((width - 2) * (height - 2) == yellow) {
                    return new int[] {width, height};
                }
            }
        }
        return new int[2];
    }
}
