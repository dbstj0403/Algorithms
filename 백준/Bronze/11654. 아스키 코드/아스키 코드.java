import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 알파벳 소문자, 대문자, 숫자 0 - 9
        char ch = br.readLine().charAt(0);
        System.out.println((int) ch);

        br.close();
    }
}
