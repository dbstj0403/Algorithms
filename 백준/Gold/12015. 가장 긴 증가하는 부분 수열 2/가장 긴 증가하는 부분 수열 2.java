import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 수열 A가 주어졌을 때, 가장 긴 증가하는 부분 수열을 구하는 프로그램 작성
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        List<Integer> list = new ArrayList<>();

        for(int num : arr){
            int idx = Collections.binarySearch(list, num);
            if(idx < 0){
                idx = -idx - 1;
            }

            if(idx == list.size()){
                list.add(num);
            }
            else{
                list.set(idx, num);
            }
        }

        System.out.println(list.size());
    }
}
