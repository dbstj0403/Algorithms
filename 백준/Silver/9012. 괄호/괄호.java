import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());

        for(int i = 0; i < k; i++){
            Stack<Character> stack = new Stack<>();
            String str = br.readLine();
            char[] chars = str.toCharArray();

            for(int j = 0; j < chars.length; j++){
                char c = chars[j];
                if(c == '('){
                    stack.push(c);
                }
                else{
                    if(stack.isEmpty()){
                        stack.push(c);
                        break;
                    }
                    if(stack.peek() == '('){
                        stack.pop();
                    }
                }
            }

            if(stack.isEmpty()){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
