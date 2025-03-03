class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        // arr의 원소에 대해 값이 50보다 크거나 같은 짝수 -> 2로 나누기
        // 50보다 작은 홀수 -> 2 곱하기
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 0 && arr[i] >= 50){
                answer[i] = arr[i] / 2;
            }
            else if(arr[i] % 2 == 1 && arr[i] < 50){
                answer[i] = arr[i] * 2;
            }
            else{
                answer[i] = arr[i];
            }
        }
        return answer;
    }
}