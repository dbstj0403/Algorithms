class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        // 두 배열의 길이가 다르면 길이가 긴 쪽이 더 큼
        // 두 배열의 길이가 같다면 각 배열에 있는 모든 원소의 합을 비교해 다르면 더 큰 쪽이 크고 같다면 같음
        int len1 = arr1.length;
        int len2 = arr2.length;
        // 배열 길이가 다를 경우
        if(len1 != len2){
            if(len1 > len2){
                return 1;
            }
            else{
                return -1;
            }
        }
        // 배열 길이 같을 경우
        else{
            int sum1 = 0;
            int sum2 = 0;
            for(int i : arr1){
                sum1 += i;
            }
            for(int j : arr2){
                sum2 += j;
            }
            if(sum1 > sum2){
                return 1;
            }
            else if(sum1 == sum2){
                return 0;
            }
            else{
                return -1;
            }
        }
    }
}