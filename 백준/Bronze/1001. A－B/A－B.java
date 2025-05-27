import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // 수 N개가 주어졌을 때, i번째 수부터 j번째 수까지 합을 구하여라
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.print(A - B);
    }
}
