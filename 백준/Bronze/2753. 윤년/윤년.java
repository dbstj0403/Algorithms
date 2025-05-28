import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int year = sc.nextInt();

       // 윤년은 연도가 4의 배수이면서 100의 배수가 아닐 때 또는 400의 배수일 떄
        
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.print(1);
        }
        else{
            System.out.print(0);
        }
    }
}