import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> wordMap = new HashMap<>();

        for(int i = 0; i < N; i++) {
            String word = br.readLine(); // 한 줄만 읽어야 함!
            if(word.length() >= M){
                wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
            }
        }

        List<String> wordList = new ArrayList<>(wordMap.keySet());

        wordList.sort(new Comparator<String>() {
            public int compare(String s1, String s2){
                int freq1 = wordMap.get(s1);
                int freq2 = wordMap.get(s2);
                if(freq1 != freq2){
                    return freq2 - freq1; // 자주 등장한 순
                }
                else if(s1.length() != s2.length()){
                    return s2.length() - s1.length(); // 더 긴 단어 우선
                }
                else{
                    return s1.compareTo(s2); // 사전순
                }
            }
        });

        for(String word : wordList){
            sb.append(word).append("\n");
        }

        System.out.println(sb);
    }
}
