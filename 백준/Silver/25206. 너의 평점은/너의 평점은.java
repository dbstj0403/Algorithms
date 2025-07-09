import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Double> scoreMap = new HashMap<>();

        scoreMap.put("A+", 4.5);
        scoreMap.put("A0", 4.0);
        scoreMap.put("B+", 3.5);
        scoreMap.put("B0", 3.0);
        scoreMap.put("C+", 2.5);
        scoreMap.put("C0", 2.0);
        scoreMap.put("D+", 1.5);
        scoreMap.put("D0", 1.0);
        scoreMap.put("F", 0.0);

        double score = 0;
        double totalCredit = 0;

        for(int i = 0; i < 20; i++){
            String[] str = br.readLine().split(" ");
            double credit = Double.parseDouble(str[1]);
            String grade = str[2];

            if(scoreMap.containsKey(grade)){
                double getGrade = scoreMap.get(grade);
                score += getGrade * credit;
                totalCredit += credit;
            }
        }

        System.out.printf("%.6f\n", score / totalCredit);
    }
}
