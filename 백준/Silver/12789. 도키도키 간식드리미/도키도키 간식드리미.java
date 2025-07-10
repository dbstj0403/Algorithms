import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> wait = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        boolean canReceive = true;
        int idx = 1;

        for(int i = str.length - 1; i >= 0; i--) {
            stack.add(Integer.parseInt(str[i]));
        }

        // 먼저 대기줄에 있었던 사람들 wait로 옮기거나 간식 주기
        while(true){
            if(stack.isEmpty() && wait.isEmpty()){
                break;
            }
            // stack top 확인
            if(!stack.isEmpty() && stack.peek() == idx){
                stack.pop();
                idx++;
            }
            // wait top 확인
            else if(!wait.isEmpty() && wait.peek() == idx){
                wait.pop();
                idx++;
            }
            // 그 어느 탑도 같지 않아 stack의 사람들 줄 옮기기
            else if(!stack.isEmpty() && stack.peek() != idx){
                wait.push(stack.pop());
            }
            // 그 어느 탑도 같지 않고, stack도 비어있는 상황
            else{
                canReceive = false;
                break;
            }
        }

        if(canReceive) {
            System.out.println("Nice");
        }
        else{
            System.out.println("Sad");
        }
    }
}
