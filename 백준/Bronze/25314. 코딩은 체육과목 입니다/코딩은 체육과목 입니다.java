import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // long int -> 4byte
        // long long int -> 8byte ... long이 붙을 때마다 4byte씩 더해짐
        int N = sc.nextInt();

        // long 개수 구하기
        int longCount = N / 4;

        String answer = "";
        for(int i = 0; i < longCount; i++) {
            if(i == 0){
                answer += "long";
            }
            else{
                answer += " long";
            }
        }

        answer += " int";

        System.out.println(answer);
    }
}
