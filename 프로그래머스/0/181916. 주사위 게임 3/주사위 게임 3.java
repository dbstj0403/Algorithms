class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;

        // 네 주사위 값이 모두 같은 경우
        if(a == b && b == c && c == d){
            answer = 1111 * a;
        }
        // 세 주사위 값이 같은 경우
        else if(a == b && b == c){
            answer = (10 * a + d) * (10 * a + d);
        }
        else if(a == b && b == d){
            answer = (10 * a + c) * (10 * a + c);
        }
        else if(a == c && c == d){
            answer = (10 * a + b) * (10 * a + b);
        }
        else if(b == c && c == d){
            answer = (10 * b + a) * (10 * b + a);
        }
        // 두 쌍씩 같은 값
        else if(a == b && c == d){
            answer = (a + c) * Math.abs(a - c);
        }
        else if(a == c && b == d){
            answer = (a + b) * Math.abs(a - b);
        }
        else if(a == d && b == c){
            answer = (a + b) * Math.abs(a - b);
        }
        // 두 개만 같고 나머지 둘은 다 다름 (2:1:1 구조)
        else if(a == b && c != d && a != c && a != d && c != d){
            answer = c * d;
        }
        else if(a == c && b != d && a != b && a != d && b != d){
            answer = b * d;
        }
        else if(a == d && b != c && a != b && a != c && b != c){
            answer = b * c;
        }
        else if(b == c && a != d && b != a && b != d && a != d){
            answer = a * d;
        }
        else if(b == d && a != c && b != a && b != c && a != c){
            answer = a * c;
        }
        else if(c == d && a != b && c != a && c != b && a != b){
            answer = a * b;
        }
        // 모두 다른 경우: 4개의 값이 전부 다름
        else {
            int min = Math.min(Math.min(a, b), Math.min(c, d));
            answer = min;
        }

        return answer;
    }
}
