import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 2번째 줄에 숫자 N개가 공백 없이 주어진다.
        // 숫자 N개의 합을 구하라. (1번째 줄은 숫자의 개수)
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 숫자가 몇 개인지 입력받기
        String sNum = sc.next();
        char[] chars = sNum.toCharArray();
        int sum = 0;
        for(int i = 0; i < N; i++){
            sum += chars[i] - '0';
        }

        System.out.print(sum);
    }
}
