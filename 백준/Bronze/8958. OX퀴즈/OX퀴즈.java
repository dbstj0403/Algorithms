import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while(T --> 0) {
            String answers = br.readLine();
            String[] answer_list = answers.split("");

            int idx = 0;
            int score = 0;

            for(int i = 0; i < answer_list.length; i++) {
                if(answer_list[i].equals("O")) {
                    score += ++idx;
                }
                else {
                    idx = 0;
                }
            }

            System.out.println(score);
        }
    }
}
