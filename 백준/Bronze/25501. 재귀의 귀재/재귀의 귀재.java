import java.io.*;
import java.util.*;

public class Main {
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());

        // isPalindrome 함수의 반환값과 recursion 함수의 호출 횟수
        for(int i = 0; i < T; i++) {
            count = 0;
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            StringBuilder sb = new StringBuilder();
            sb.append(isPalindrome(str)).append(" ").append(count);
            System.out.println(sb);
        }

    }

    // 양끝 문자를 비교해서 팰린드롬 문자열인지 재귀로 판별하는 메서드
    public static int recursion(String s, int l, int r){
        count++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }

    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
}
