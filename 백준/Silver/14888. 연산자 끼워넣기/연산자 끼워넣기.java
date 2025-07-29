import java.io.*;
import java.util.*;

public class Main {
    static int[] arr;
    static int[] selectedOps; // 선택된 연산자 순서 저장
    static boolean[] visited;
    static List<Integer> opList = new ArrayList<>();
    static List<Integer> resultList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 연산자 입력 (0:+, 1:-, 2:*, 3:/)
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 4; i++) {
            int count = Integer.parseInt(st.nextToken());
            for(int j = 0; j < count; j++) {
                opList.add(i);
            }
        }

        visited = new boolean[opList.size()];
        selectedOps = new int[opList.size()];

        backtrack(0);
        System.out.println(Collections.max(resultList));
        System.out.println(Collections.min(resultList));
    }

    static void backtrack(int depth) {
        if(depth == opList.size()) {
            int result = calculate();
            resultList.add(result);
            return;
        }

        for(int i = 0; i < opList.size(); i++) {
            if(!visited[i]) {
                visited[i] = true;
                selectedOps[depth] = opList.get(i);
                backtrack(depth + 1);
                visited[i] = false;
            }
        }
    }

    static int calculate() {
        int sum = arr[0];
        for(int i = 0; i < selectedOps.length; i++) {
            int op = selectedOps[i];
            int num = arr[i + 1];

            switch(op) {
                case 0: sum += num; break;
                case 1: sum -= num; break;
                case 2: sum *= num; break;
                case 3: sum = sum < 0 ? -(-sum / num) : sum / num; break; // 음수 나눗셈 처리
            }
        }
        return sum;
    }
}
