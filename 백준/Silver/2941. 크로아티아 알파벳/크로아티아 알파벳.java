import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        str = str.replace("c=", "!")
                .replace("c-", "!")
                .replace("dz=", "!")
                .replace("d-", "!")
                .replace("lj", "!")
                .replace("nj", "!")
                .replace("s=", "!")
                .replace("z=", "!");

        System.out.println(str.length());
    }
}
