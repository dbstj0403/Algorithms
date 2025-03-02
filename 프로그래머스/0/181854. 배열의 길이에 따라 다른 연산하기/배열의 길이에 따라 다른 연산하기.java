class Solution {
    public int[] solution(int[] arr, int n) {
      
        // 정수 배열 arr, 정수 n 
        // arr 길이가 홀수라면 arr 모든 짝수 인덱스 위치에 n 더하기
        // arr 길이가 짝수라면 arr 모든 홀수 인덱스 위치에 n 더하기
        if(arr.length % 2 == 0){
            for(int i=0; i<arr.length; i++){
                if(i % 2 == 1){
                    arr[i] += n;
                }
            }
        }
        else{
            for(int i=0; i<arr.length; i++){
                if(i % 2 == 0){
                    arr[i] += n;
                }
            }
        }
        
        return arr;
    }
}