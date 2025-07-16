import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer, String> pokemonMap = new HashMap<>();
        Map<String, Integer> reverseMap = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String pokemon = st.nextToken();
            pokemonMap.put(i + 1, pokemon);
            reverseMap.put(pokemon, i + 1);
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            String quiz = st.nextToken();
            if(quiz.matches("[a-zA-z]+")){
                sb.append(reverseMap.get(quiz)).append("\n");
            }
            else{
                int num = Integer.parseInt(quiz);
                sb.append(pokemonMap.get(num)).append("\n");
            }
        }

        System.out.println(sb);
    }
}
