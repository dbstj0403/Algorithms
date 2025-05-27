import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int part1 = num2 % 10;
        num2 /= 10;
        int part2 = num2 % 10;
        num2 /= 10;
        int part3 = num2 % 10;

        System.out.println(part1 * num1);
        System.out.println(part2 * num1);
        System.out.println(part3 * num1);
        System.out.println(part1 * num1 + part2 * num1 * 10 + part3 * num1 * 100);
    }
}