import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            String line = br.readLine();
            char first = line.charAt(0);
            char last = line.charAt(line.length() - 1);

            String sFirst = String.valueOf(first);
            String sLast = String.valueOf(last);

            bw.write(sFirst + sLast + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
