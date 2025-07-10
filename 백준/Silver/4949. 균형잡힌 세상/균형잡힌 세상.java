import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            String s = br.readLine();
            if(s.equals(".")) break;
            boolean flag = true;
            Stack<Character> stack = new Stack<>();

            for(char c : s.toCharArray()){
                if(c == '(' || c == '['){
                    stack.push(c);
                }
                else if(c == ')'){
                    if(!stack.isEmpty() && stack.peek() == '('){
                        stack.pop();
                    }
                    else{
                        flag = false;
                        break;
                    }
                }
                else if(c == ']') {
                    if (!stack.isEmpty() && stack.peek() == '[') {
                        stack.pop();
                    }
                    else{
                        flag = false;
                        break;
                    }
                }
            }

            if(stack.isEmpty() && flag){
                sb.append("yes\n");
            }
            else{
                sb.append("no\n");
            }
        }

        System.out.println(sb);
    }
}
