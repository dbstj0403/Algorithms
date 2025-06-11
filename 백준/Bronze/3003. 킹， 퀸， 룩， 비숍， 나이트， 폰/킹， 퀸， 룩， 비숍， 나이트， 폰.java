import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int[] pieces = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < 6; i++) {
            int current = Integer.parseInt(input[i]);
            System.out.print((pieces[i] - current) + " ");
        }
    }
}
