import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            String[] parts = br.readLine().split(" ");
            int A = Integer.parseInt(parts[0]);
            int B = Integer.parseInt(parts[1]);
            if(A == 0 && B == 0 ){
                break;
            }
            bw.write( (A + B) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
