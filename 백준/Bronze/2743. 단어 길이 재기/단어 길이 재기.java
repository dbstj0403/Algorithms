import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String length = String.valueOf(str.length());
        bw.write(length);

        bw.flush();
        bw.close();
        br.close();
    }
}
