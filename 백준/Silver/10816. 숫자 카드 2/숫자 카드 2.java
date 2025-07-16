import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> cards = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            int card = Integer.parseInt(st.nextToken());
            if(!cards.containsKey(card)){
                cards.put(card, 1);
            }
            else{
                cards.put(card, cards.getOrDefault(card, 0) + 1);
            }
        }

        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < M; i++) {
            int card = Integer.parseInt(st.nextToken());
            if(cards.containsKey(card)){
                sb.append(cards.get(card)).append(" ");
            }
            else{
                sb.append("0").append(" ");
            }
        }

        System.out.println(sb);
    }
}
