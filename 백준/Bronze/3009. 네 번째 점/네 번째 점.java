import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Map<Integer, Integer> xmap = new HashMap<>();
        Map<Integer, Integer> ymap = new HashMap<>();
        int x = 0;
        int y = 0;

        for(int i = 0; i < 3; i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());

            if(xmap.containsKey(x1)){
                xmap.put(x1, xmap.get(x1) + 1);
            }
            else {
                xmap.put(x1, 1);
            }

            if(ymap.containsKey(y1)){
                ymap.put(y1, ymap.get(y1) + 1);
            }
            else{
                ymap.put(y1, 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : xmap.entrySet()){
            if(entry.getValue() % 2 == 1){
                x = entry.getKey();
            }
        }

        for(Map.Entry<Integer, Integer> entry : ymap.entrySet()){
            if(entry.getValue() % 2 == 1){
                y = entry.getKey();
            }
        }

        System.out.println(x + " " + y);
    }
}
