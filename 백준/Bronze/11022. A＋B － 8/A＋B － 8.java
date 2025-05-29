import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i <= N; i++){
            String[] parts = br.readLine().split(" ");
            int A = Integer.parseInt(parts[0]);
            int B = Integer.parseInt(parts[1]);
            bw.write("Case #" + i + ": " + A + " + " + B + " = " + (A + B) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
