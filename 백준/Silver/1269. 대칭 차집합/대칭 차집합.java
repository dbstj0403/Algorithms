import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 자연수를 원소로 갖는 공집합이 아닌 두 집합 A, B의 대칭 차집합의 원소의 개수
        // (A - B) (B -A)의 합집합이 대칭 차집합
        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            A.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            B.add(Integer.parseInt(st.nextToken()));
        }

        Set<Integer> result = new HashSet<>();

        for(int num : A){
            if(!B.contains(num)) {
                result.add(num);
            }
        }

        for(int num : B){
            if(!A.contains(num)) {
                result.add(num);
            }
        }

        System.out.println(result.size());
    }
}
