import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 양수와 +, -, 괄호를 가지고 식을 만듦. 괄호를 모두 지움. 괄호를 적절히 쳐서 식의 값을 최소로 만들기
        String str = st.nextToken();
        String[] minusParts = str.split("-");
        int total = sumOfPart(minusParts[0]);
        for(int i = 1; i < minusParts.length; i++) {
            total -= sumOfPart(minusParts[i]);
        }
        System.out.println(total);
    }

    static int sumOfPart(String s){
        String[] plusParts = s.split("\\+");
        int sum = 0;
        for(String part: plusParts){
            sum += Integer.parseInt(part);
        }
        return sum;
    }
}
