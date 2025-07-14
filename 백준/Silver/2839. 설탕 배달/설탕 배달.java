import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 3kg, 5kg 봉지를 지정된 무게만큼 가져가는데 가장 적게 가져갈 수 있는 봉지 개수
        // 가져갈 수 없다면 -1 출력
        int n = Integer.parseInt(st.nextToken());
        int kg = 0;
        int countOf5kg = 0;
        int countOf3kg = 0;

        while(n > 0){
            if(n % 5 == 0){
                countOf5kg = n / 5;
                n -= countOf5kg * 5;
            }
            else{
                n -= 3;
                countOf3kg++;
            }
        }

        if(n == 0){
            System.out.println(countOf3kg + countOf5kg);
        }
        else{
            System.out.println("-1");
        }
    }
}
