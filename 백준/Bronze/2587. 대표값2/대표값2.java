import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        StringTokenizer st;

        for(int i = 0; i < 5; i++){
            st = new StringTokenizer(br.readLine());
            list.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(list);

        int sum = 0;
        for(int item : list){
            sum += item;
        }

        System.out.println(sum / 5);
        System.out.println(list.get(2));
    }
}
