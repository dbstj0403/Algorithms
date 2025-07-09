import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 잘못된 수를 부를 때마다 0을 외쳐서 가장 최근에 쓴 수 지움

        Stack<Integer> stack = new Stack<>();

        int k = Integer.parseInt(br.readLine());

        for(int i = 0; i < k; i++) {
            int n = Integer.parseInt(br.readLine());
            if(n == 0){
                stack.pop();
            }
            else{
                stack.push(n);
            }
        }

        int sum = 0;

        for(int i = 0; i < stack.size(); i++){
            sum += stack.get(i);
        }

        System.out.println(sum);
    }
}
