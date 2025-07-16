import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while(true){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            StringBuilder sb = new StringBuilder();

            if(n == -1){
                break;
            }

            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 1; i < n; i++){
                if(n % i == 0){
                    list.add(i);
                }
            }

            Collections.sort(list);
            int sum = 0;

            for(int i = 0; i < list.size(); i++){
                sum += list.get(i);
            }
       
            if(sum == n){
                sb.append(n).append(" = ");
                for(int i = 0; i < list.size(); i++){
                    if(i == list.size() - 1){
                        sb.append(list.get(i));
                    }
                    else{
                        sb.append(list.get(i)).append(" + ");
                    }
                }
                System.out.println(sb);
            }
            else{
                sb.append(n).append(" is NOT perfect.");
                System.out.println(sb);
            }
        }
    }
}
