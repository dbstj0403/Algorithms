import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int sum = 0;
        int found = 1;
        int item = 1;

        int a = 0; // 분자
        int b = 0; // 분모
        int line = 0;

        while(true){
            sum += item;

            if(sum >= N){
                line = found;
                break;
            }

            item++;
            found++;
        }

        if(line % 2 == 0){
            int before = 0;
            for(int i = 1; i < line; i++){
                before += i;
            }

            a = N - before;
            b = item - a + 1;

            System.out.println(a + "/" + b);
        }
        else{
            int before = 0;
            for(int i = 1; i < line; i++){
                before += i;
            }

            a = N - before;
            b = item - a + 1;

            System.out.println(b + "/" + a);
        }
    }
}
