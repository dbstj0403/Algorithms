import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < k; i++){
            String[] str = br.readLine().split(" ");

            if(Integer.parseInt(str[0]) == 1){
                int n = Integer.parseInt(str[1]);
                stack.push(n);
            }
            else if(Integer.parseInt(str[0]) == 2){
                if(stack.isEmpty()){
                    System.out.println("-1");
                }
                else{
                    int n = stack.pop();
                    System.out.println(n);
                }
            }
            else if(Integer.parseInt(str[0]) == 3){
                System.out.println(stack.size());
            }
            else if(Integer.parseInt(str[0]) == 4){
                if(stack.isEmpty()){
                    System.out.println("1");
                }
                else{
                    System.out.println("0");
                }
            }
            else{
                if(stack.isEmpty()){
                    System.out.println("-1");
                }
                else{
                    int j = stack.peek();
                    System.out.println(j);
                }
            }
        }
    }
}
