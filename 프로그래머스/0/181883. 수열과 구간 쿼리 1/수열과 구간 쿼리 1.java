class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // queries의 원소는 각각 하나의 query를 나타냄 -> [s, e]
        // query마다 순서대로 s <= i <= e 인 모든 i에 대해 arr[i]에 1을 더함
        
        for(int i = 0; i < queries.length; i++){
            int[] query = queries[i];
            for(int j = query[0]; j <= query[1]; j++){
                arr[j]++;
            }
        }
        
        return arr;
    }
}