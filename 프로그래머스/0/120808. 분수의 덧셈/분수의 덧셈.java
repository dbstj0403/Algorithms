class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];

        int commonDenom = 0;
        
        int maxDenom = Math.max(denom1, denom2);
        
        for(int i = 1; i <= Math.min(denom1, denom2); i++){
            int n = i * maxDenom;
            System.out.println(n);
            if(n % Math.min(denom1, denom2) == 0){
                commonDenom = n;
                break;
            }
        }
        
        int a = commonDenom / denom1;
        int b = commonDenom / denom2;
        
        int numerSum = a * numer1 + b * numer2;
        
        // commomDenom과 numerSum의 최대공약수로 나누어 기약 분수화
        int gcd = 0;
        for(int i = 1; i <= Math.min(commonDenom, numerSum); i++){
            if(commonDenom % i == 0 && numerSum % i == 0){
                gcd = i;
            }
        }
        
        if(gcd == 0){
            answer[0] = numerSum;
            answer[1] = commonDenom;
        }
        else{
            answer[0] = numerSum / gcd;
            answer[1] = commonDenom / gcd;
        }
        
        return answer;
    }
}