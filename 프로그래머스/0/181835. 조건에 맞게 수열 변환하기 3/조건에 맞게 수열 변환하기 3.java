class Solution {
    public int[] solution(int[] arr, int k) {
        // k가 홀수라면 arr의 모든 원소에 k 곱하기 
        // k가 짝수라면 arr의 모든 원소에 k 더하기
        for(int i=0; i<arr.length; i++){
            if(k % 2 == 0){
                arr[i] += k;
            }
            else{
                arr[i] *= k;
            }
        }
        return arr;
    }
}