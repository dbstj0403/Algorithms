class Solution {
    public int[] solution(int brown, int yellow) {
        // 가로가 세로보다 넓거나 같아야 한다.
        
        int sum = brown + yellow;
        for(int height = 3; height <= Math.sqrt(sum); height++) {
            if(sum % height == 0) {
                int width = sum / height;
                
                if((width - 2) * (height - 2) == yellow) {
                    return new int[] {width, height};
                }
            }
        }
        return new int[2];
    }
}