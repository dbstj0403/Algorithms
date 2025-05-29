import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i <= N; i++){
            String line = "";
            for(int j = 1; j <= N; j++){
                if(j <= N - i){
                    line += " ";
                }
                else{
                    line += "*";
                }
            }
            bw.write(line);
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
