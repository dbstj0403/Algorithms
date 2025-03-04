import java.util.*;

class Solution {
    public int solution(int[] number) {
        int answer = 0;
        // 3명의 정수 번호를 더했을 때 0이 되면 삼총사
        // 삼총사를 만들 수 있는 방법의 수를 리턴
        Arrays.sort(number); // 오름차순 정렬
        // System.out.println(Arrays.toString(number));
        for(int i=0; i<number.length - 2; i++){
            for(int j= i + 1; j<number.length - 1; j++){
                for(int k= j + 1; k<number.length; k++){
                    if(number[i] + number[j] + number[k] == 0){
                        answer += 1;
                        System.out.println(number[i]);
                        System.out.println(number[j]);
                        System.out.println(number[k]);
                        System.out.println("---");
                    }
                }
            }
        }
        return answer;
    }
}