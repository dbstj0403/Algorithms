class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        if(direction.equals("left")){
            // 왼쪽으로 한칸씩 이동
            for(int i = 0; i < numbers.length; i++){
                if(i == numbers.length - 1){
                    answer[i] = numbers[0];
                }
                else{
                    answer[i] = numbers[i + 1];
                }
            }
        }
        else{
            // 오른쪽으로 한칸씩 이동
            for(int i = 0; i < numbers.length; i++){
                if(i == 0){
                    answer[0] = numbers[numbers.length - 1];
                }
                else{
                    answer[i] = numbers[i - 1];
                }
            }
        }
        return answer;
    }
}