import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 소인수분해 결과를 한 줄에 하나씩 오름차순 출력

        int N = Integer.parseInt(st.nextToken());

        // N의 약수 구하기

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= N; i++) {
            if(N % i == 0){
                list.add(i);
            }
        }

        Collections.sort(list);

        // 그중에서 소수인 것 고르기

        ArrayList<Integer> primeList = new ArrayList<>();
        for(int item : list){
            if(isPrime(item)){
                primeList.add(item);
            }
        }

        Collections.sort(primeList);
        int idx = 0;

        while(N != 1){
            if(N % primeList.get(idx) == 0){
                N /= primeList.get(idx);
                System.out.println(primeList.get(idx));
            }
            else{
                idx++;
            }
        }
    }

    public static boolean isPrime(int n) {
        boolean flag = true;
        if(n == 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                flag = false;
            }
        }
        return flag;
    }
}
