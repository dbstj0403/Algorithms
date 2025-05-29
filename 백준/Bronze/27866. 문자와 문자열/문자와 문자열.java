import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int idx = Integer.parseInt(br.readLine());

        bw.write(str.charAt(idx - 1));

        bw.flush();
        bw.close();
        br.close();
    }
}
