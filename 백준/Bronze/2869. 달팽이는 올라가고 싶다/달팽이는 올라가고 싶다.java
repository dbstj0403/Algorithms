import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        long day = A - B; // 하루에 올라가는 거리
        long target = V - A;

        if(target % day == 0){
            System.out.println(target / day + 1);
        }
        else if(target / day == 0){
            System.out.println(2);
        }
        else{
            // target까지 남은 날이 있을 떄
            System.out.println(target / day + 2);
        }
    }
}
