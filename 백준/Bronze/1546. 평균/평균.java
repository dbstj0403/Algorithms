import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 자기 점수 중 최댓값 -> M 이후 모든 점수를 점수 / M * 100으로 수정
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 본 과목의 개수

        int scores[] = new int[n];
        for(int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        long sum = 0;
        long max = 0;
        for(int i = 0; i < n; i++) {
            if(scores[i] > max) {max = scores[i];}
            sum = scores[i] + sum;
        }

        System.out.println(sum * 100.0 / max / n);
    }
}
