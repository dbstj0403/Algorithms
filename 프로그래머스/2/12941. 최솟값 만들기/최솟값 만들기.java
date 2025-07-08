import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A); // 오름차순 정렬
        
        Integer[] arr = new Integer[B.length];
        for(int i = 0; i < B.length; i++){
            arr[i] = B[i];
        }
        Arrays.sort(arr, Collections.reverseOrder()); // 내림차순 정렬
        
        for(int i = 0; i < A.length; i++){
            int num = A[i] * arr[i];
            answer += num;
        }

        return answer;
    }
}