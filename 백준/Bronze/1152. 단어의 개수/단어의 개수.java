import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine().strip();
        String[] input = line.split(" ");
        if(line.isEmpty()){
            bw.write("0");
        }
        else{
            int count = input.length;
            String sCount = String.valueOf(count);

            bw.write(sCount);
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
