class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // n의 다음 큰 숫자는 n보다 큰 자연수, 2진수로 변환했을 때 1의 개수가 같음.
        // 조건 만족 수 중 가장 작은 수.
        
        // n의 2진수 변환시 1의 개수 구하기
        StringBuilder str = new StringBuilder(Integer.toBinaryString(n));
        int one_count = 0;
        for(char c : str.toString().toCharArray()){
            if(c == '1'){
                one_count++;
            }
        }
    
        while(true){
            n++;
            int num = n;
            StringBuilder practice = new StringBuilder(Integer.toBinaryString(num));
            // 2진수 변환시 1 개수 구하기
            int count = 0;
            for(char c : practice.toString().toCharArray()){
                if(c == '1'){
                    count++;
                }
            }
            
            if(count == one_count){
                answer = num;
                break;
            }
            
        }
        
        return answer;
    }
}