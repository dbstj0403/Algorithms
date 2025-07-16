import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        int sum = 0;
        int min = Integer.MAX_VALUE;
        int count = 0;

        for(int i = M; i <= N; i++){
            if(isPrime(i)){
                sum += i;

                if(min > i){
                    min = i;
                }

                count++;
            }
        }

        if(count == 0){
            System.out.println(-1);
        }
        else{
            System.out.println(sum);
            System.out.println(min);
        }
    }

    public static boolean isPrime(int n){
        boolean flag = true;
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                flag = false;
            }
        }
        return flag;
    }
}
